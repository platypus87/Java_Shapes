package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Shape {
    public Shape() {
    }
/*
Need to ask user for dimensions for each shape
and then draw them according to the parameters
 */
    void getSquare() {
        JFrame frame = new JFrame("Square");
        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel sideLabel = new JLabel("Side Length: ");
        JTextField sideText = new JTextField("Enter Side length");
        sideText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                sideText.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JTextField areaText = new JTextField("The area is: ");

        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(50,150,100,50);
        quitButton.addActionListener((event)->frame.dispose());

        JButton areaButton = new JButton("Calculate Area");
        areaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int side=0, area=0;
                try {
                    side = Integer.parseInt(sideText.getText());
                }catch (Exception err){
                    areaText.setText("Try Again");
                }
                area = side * side;
                areaText.setText("Area: "+area);
            }
        });
        sideLabel.setText("Side: ");
        frame.setSize(700,100);

        frame.add(panel);
        panel.add(sideLabel);
        panel.add(sideText);
        panel.add(areaText);
        panel.add(areaButton);
        panel.add(quitButton);

        frame.setVisible(true);
    }
     void getCircle(){
         JFrame frame = new JFrame("Circle");
         JPanel panel = new JPanel();
         frame.setLayout(new FlowLayout(FlowLayout.CENTER));
         JLabel radiusLabel = new JLabel("Radius: ");
         JTextField radiusText = new JTextField("Enter radius");
         radiusText.addMouseListener(new MouseListener() {
             @Override
             public void mouseClicked(MouseEvent e) {

             }

             @Override
             public void mousePressed(MouseEvent e) {
                radiusText.setText("");
             }

             @Override
             public void mouseReleased(MouseEvent e) {

             }

             @Override
             public void mouseEntered(MouseEvent e) {
                    radiusText.setText("");
             }

             @Override
             public void mouseExited(MouseEvent e) {

             }
         });

         JTextField areaText = new JTextField("The area is: ");

         JButton quitButton = new JButton("Quit");
         quitButton.setBounds(50,150,100,50);
         quitButton.addActionListener((event)->frame.dispose());

         JButton areaButton = new JButton("Calculate Area");
         areaButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 double radius=0, area =0;
                 try {
                     radius = Integer.parseInt(radiusText.getText());

                 }catch (Exception err){
                     areaText.setText("Try Again");
                 }
                 area = radius * radius * Math.PI;
                 areaText.setText("Area: "+area);
             }
         });
         radiusLabel.setText("Radius: ");
         frame.setSize(700,100);

         frame.add(panel);
         panel.add(radiusLabel);
         panel.add(radiusText);
         panel.add(areaText);
         panel.add(areaButton);
         panel.add(quitButton);

         frame.setVisible(true);

    }
    void getRectangle(){
        JFrame frame = new JFrame("Rectangle");
        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lengthLabel = new JLabel("Length: ");
        JTextField lengthText = new JTextField("Enter length");
        lengthText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lengthText.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JLabel widthLabel = new JLabel("Width: ");
        JTextField widthText = new JTextField("Enter Width");
        widthText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                widthText.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JTextField areaText = new JTextField("The area is: ");

        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(50,150,100,50);
        quitButton.addActionListener((event)->frame.dispose());

        JButton areaButton = new JButton("Calculate Area");
        areaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length=0, width=0, area=0;
                try {
                    length = Integer.parseInt(lengthText.getText());
                    width = Integer.parseInt(widthText.getText());
                }catch (Exception err){
                    areaText.setText("Try Again");
                }
                area = length*width;
                areaText.setText("Area: "+area);
            }
        });
        lengthLabel.setText("Length: ");
        frame.setSize(700,100);
        //sideLabel.setBounds(10,10,200,10);

        frame.add(panel);
        panel.add(lengthLabel);
        panel.add(lengthText);
        panel.add(widthLabel);
        panel.add(widthText);
        panel.add(areaText);
        panel.add(areaButton);
        panel.add(quitButton);

        frame.setVisible(true);
    }

    void getTriangle(){
        JFrame frame = new JFrame("Triangle");
        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel baseLabel = new JLabel("Base: ");
        JTextField baseText = new JTextField("Enter Base");
        baseText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                baseText.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JLabel heightLabel = new JLabel("Height: ");
        JTextField heightText = new JTextField("Enter Height");
        heightText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                heightText.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JTextField areaText = new JTextField("The area is: ");

        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(50,150,100,50);
        quitButton.addActionListener((event)->frame.dispose());

        JButton areaButton = new JButton("Calculate Area");
        areaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base=0, height=0, area=0;
                try {
                    base = Double.parseDouble(baseText.getText());
                    height = Double.parseDouble(heightText.getText());
                }catch (Exception err){
                    areaText.setText("Try Again");
                }
                area = (base*height)/2;
                areaText.setText("Area: "+area);
            }
        });
        baseLabel.setText("Base: ");
        frame.setSize(700,100);

        frame.add(panel);
        panel.add(baseLabel);
        panel.add(baseText);
        panel.add(heightLabel);
        panel.add(heightText);
        panel.add(areaText);
        panel.add(areaButton);
        panel.add(quitButton);

        frame.setVisible(true);
    }

    void getCube() {
        JFrame frame = new JFrame("Cube");
        frame.setSize(700,100);
        ImageIcon icon = new ImageIcon("src/cube.png");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }

    void getTorus() {
        JFrame frame = new JFrame("Torus");
        frame.setSize(400,400);
        ImageIcon icon = new ImageIcon("src/torus.png");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }

    void getCylinder() {
        JFrame frame = new JFrame("Cylinder");
        frame.setSize(400,400);
        ImageIcon icon = new ImageIcon("src/cylinder.png");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }
    void getSphere() {
        JFrame frame = new JFrame("Sphere");
        frame.setSize(400,400);
        ImageIcon icon = new ImageIcon("src/sphere.png");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }

    void getCone() {
        JFrame frame = new JFrame("Cone");
        frame.setSize(400,400);
        ImageIcon icon = new ImageIcon("src/cone.png");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }
}
