package com.flansmod.common.network;

import com.flansmod.client.Screenshot;
import com.flansmod.common.FlansMod;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import static com.flansmod.common.FlansMod.SERVER_IP;
import static com.flansmod.common.FlansMod.SERVER_PORT;


public class PacketRequestScreenshot extends PacketBase {
    public PacketRequestScreenshot() {
    }

    private static byte[] getBytesFromImage(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        return baos.toByteArray();
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {

        if(!FlansMod.enableScreenShot) {
            return;
        }

        try {
//            Minecraft minecraft = Minecraft.getMinecraft();
//            ServerData serverData = minecraft.func_147104_D();
//            if (serverData == null) {
//                return;
//            }
//            String serverIP = serverData.serverIP;
//            String[] parts = serverIP.split(":");
//            serverIP = parts[0];
            try {
                Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                try {
                    byte[] imageBytes = getBytesFromImage(Screenshot.newScreenshot());
                    out.writeObject(imageBytes);
                    out.writeObject(clientPlayer.getDisplayName());
                    out.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                out.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
