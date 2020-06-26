package com.mtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pane {

    JLabel welcome = new JLabel("Multiple Panels");

    JFrame mframe = new JFrame("Multiple Panels");

    JPanel pane1 = new JPanel();
    JPanel pane2 = new JPanel();
    JLabel pane3 = new JLabel();

    JLabel l1 = new JLabel("P1");
    JLabel l2 = new JLabel("P2");
    JButton l3 = new JButton("P3");


    public void pane() {

        JLayeredPane layeredpn = new JLayeredPane();

        mframe.setSize(200, 200);

        mframe.setLayout(new FlowLayout());

        pane1.setSize(100, 100);
        pane2.setSize(100, 100);
        pane3.setBounds(20, 20, 50, 50);

        pane3.setBackground(Color.gray);

        pane1.add(l1);
        pane1.add(l2);
        pane1.add(l3);

        //layeredpn.add(pane1, new Integer(1));
        //layeredpn.add(pane2, new Integer(2));
        layeredpn.add(pane3, new Integer(3));

        mframe.add(layeredpn);

        mframe.setVisible(true);
    }
}
