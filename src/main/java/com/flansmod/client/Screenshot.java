package com.flansmod.client;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Screenshot {
    public static BufferedImage newScreenshot() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();

            // 获取屏幕尺寸
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            // 截图操作
            BufferedImage image = robot.createScreenCapture(screenRect);
            return image;
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return null;
    }
}
