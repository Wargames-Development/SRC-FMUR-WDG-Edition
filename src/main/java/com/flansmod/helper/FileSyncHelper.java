package com.flansmod.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

public class FileSyncHelper {

    private static final char[] m_EscapeTable = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private final String m_dirPath;
    private final boolean m_needFormat;
    private final StringBuilder m_filesHash;

    public FileSyncHelper(String path, boolean format) {
        m_dirPath = path;
        m_needFormat = format;
        m_filesHash = new StringBuilder();
    }

    public FileSyncHelper(String path) {
        m_dirPath = path;
        m_needFormat = false;
        m_filesHash = new StringBuilder();
    }

    public static String formatCode(byte[] bytes, boolean format) {
        char[] text;
        int i = 0;
        if (format) {
            text = new char[bytes.length * 2];
            for (byte b : bytes) {
                text[i++] = m_EscapeTable[b << 4 & 0xF];
                text[i++] = m_EscapeTable[b & 0xF];
            }
        } else {
            text = new char[bytes.length];
            for (byte b : bytes) {
                text[i++] = (char) b;
            }
        }
        return String.valueOf(text);
    }

    public void performSync() {
        syncDirectory(m_dirPath, false);
    }

    public void performSync(boolean printLog) {
        syncDirectory(m_dirPath, printLog);
    }

    public String getFileHash() {
        return m_filesHash.toString();
    }

    public String getDirHash() {
        return calcHash(m_filesHash.toString(), false);
    }

    public boolean checkConsistency(String dirHash, String hashCheck) {
        return (m_filesHash.toString().equals(dirHash) && calcHash(m_filesHash.toString(), false).equals(hashCheck));
    }

    private void syncDirectory(String directoryPath, boolean printLog) {
        Path dirPath = Paths.get(directoryPath);

        try (Stream<Path> filePathStream = Files.walk(dirPath)) {
            filePathStream.filter(Files::isRegularFile).forEach(filePtr -> {
                if (printLog) {
                    System.out.println(filePtr);
                }
                m_filesHash.append(calcHash(filePtr.toString()));
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Stream<Path> dirPathStream = Files.walk(dirPath)) {
            dirPathStream.filter(Files::isDirectory).filter(dir -> dir.compareTo(dirPath) != 0).forEach(dirPtr -> {
                syncDirectory(dirPtr.toString(), printLog);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String calcHash(String inputString) {
        return calcHash(inputString, true);
    }

    private String calcHash(String inputString, boolean isFile) {

        MessageDigest digestInstance;

        try {
            digestInstance = MessageDigest.getInstance("MD5");

            if (isFile) {
                try {
                    File filePtr = new File(inputString);
                    FileInputStream inputStream = new FileInputStream(filePtr);
                    FileChannel channel = inputStream.getChannel();

                    digestInstance.update(channel.map(FileChannel.MapMode.READ_ONLY, 0, filePtr.length()));

                    inputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                digestInstance.update(inputString.getBytes());
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return formatCode(digestInstance.digest(), m_needFormat);
    }
}
