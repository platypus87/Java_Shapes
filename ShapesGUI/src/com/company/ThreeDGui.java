package com.company;

import javax.swing.*;

public class ThreeDGui {
    JFrame frame;
    JButton quitButton, cubeButton, sphereButton, coneButton, torusButton, cylinderButton;

    ThreeDGui(){
        frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("3-D Shapes");
        frame.setSize(600,400);

        cubeButton = new JButton("Cube");
        cubeButton.setBounds(50,50,100,50);
        cubeButton.addActionListener((event)-> new Shape().getCube());

        sphereButton = new JButton("Sphere");
        sphereButton.setBounds(150,50,100,50);
        sphereButton.addActionListener((event)-> new Shape().getSphere());

        coneButton = new JButton("Cone");
        coneButton.setBounds(50,100,100,50);
        coneButton.addActionListener((event)-> new Shape().getCone());

        torusButton = new JButton("Torus");
        torusButton.setBounds(150,100,100,50);
        torusButton.addActionListener((event)-> new Shape().getTorus());

        cylinderButton = new JButton("Cylinder");
        cylinderButton.setBounds(50,150,100,50);
        cylinderButton.addActionListener((event)-> new Shape().getCylinder());

        quitButton = new JButton("Quit");
        quitButton.setBounds(250,150,100,50);
        quitButton.addActionListener((event)->frame.dispose());

        frame.add(cubeButton);
        frame.add(sphereButton);
        frame.add(coneButton);
        frame.add(torusButton);
        frame.add(cylinderButton);
        frame.add(quitButton);

        frame.setVisible(true);
    }
}
