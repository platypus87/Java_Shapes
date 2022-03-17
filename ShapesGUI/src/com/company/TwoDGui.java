package com.company;

import javax.swing.*;

public class TwoDGui {
    JFrame frame;
    JButton quitButton, squareButton, circleButton, triangleButton, rectangleButton;

    TwoDGui(){
        frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("2-D Shapes");
        frame.setSize(600,400);

        squareButton = new JButton("Square");
        squareButton.setBounds(50,50,100,50);
        squareButton.addActionListener((event)-> new Shape().getSquare());

        circleButton = new JButton("Circle");
        circleButton.setBounds(150,50,100,50);
        circleButton.addActionListener((event)-> new Shape().getCircle());

        triangleButton = new JButton("Triangle");
        triangleButton.setBounds(50,100,100,50);
        triangleButton.addActionListener((event)-> new Shape().getTriangle());

        rectangleButton = new JButton("Rectangle");
        rectangleButton.setBounds(150,100,100,50);
        rectangleButton.addActionListener((event)-> new Shape().getRectangle());

        quitButton = new JButton("Quit");
        quitButton.setBounds(50,150,100,50);
        quitButton.addActionListener((event)->frame.dispose());

        frame.add(squareButton);
        frame.add(circleButton);
        frame.add(triangleButton);
        frame.add(rectangleButton);
        frame.add(quitButton);

        frame.setVisible(true);
    }
}
