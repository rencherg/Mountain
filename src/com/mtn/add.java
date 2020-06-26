package com.mtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class add {
    JFrame aframe = new JFrame("Add");
    JLabel welcome = new JLabel("Add a name");
    JTextField addbox = new JTextField(10);
    JButton doit = new JButton("Add Name");

    void add() {

        aframe.setLayout(new FlowLayout());
        aframe.setSize(200, 200);

        aframe.add(welcome);
        aframe.add(addbox);
        aframe.add(doit);

        aframe.setVisible(true);

        //aframe.setIconImage(IMG_2927.JPG);

    }

}
