package image;

import ij.IJ;
import ij.ImagePlus;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String []args){
//        try {
//
//
//            String imgPath = "D:/Img//website.jpg";
//            BufferedImage myPicture = ImageIO.read(new File(imgPath));
//            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//            JPanel jPanel = new JPanel();
//            jPanel.add(picLabel);
//            System.out.println(jPanel);
//            JFrame f = new JFrame();
//            f.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
//            f.add(jPanel);
//            f.setVisible(true);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        ImagePlus imp= IJ.openImage("D:/Img//website.jpg");
        imp.show();


    }
}
