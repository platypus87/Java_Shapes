package com.company;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main extends Frame {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("2-D and 3-D Shapes");
        frame.setSize(600,400);

        JButton btnOne = new JButton("2-D Shapes");
        btnOne.setBounds(50,50,100,50);
        btnOne.addActionListener((event)-> new TwoDGui());

        JButton btnTwo = new JButton("3-D Shapes");
        btnTwo.setBounds(200,50,100,50);
        btnTwo.addActionListener((event)->new ThreeDGui());

        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(50,150,100,50);
        quitButton.addActionListener((event)->System.exit(0));

        frame.add(btnOne);
        frame.add(btnTwo);
        frame.add(quitButton);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

//        FileReader reader = new FileReader("<filePath>");
//        BufferedReader buffer = new BufferedReader(reader);
//        String s;
//        while((s=buffer.readLine())!=null){
//            System.out.println(s);
//        }
//        reader.close();