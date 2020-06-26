package com.mtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

public class edit {
    String[] mynames = {"Grant", "Nathan", "Taylor", "Gracie", "Jennifer", "Alan", "Paul", "Jolene", "Don", "Connie", "Ryan", "Laura", "Craig", "Kara", "Bryce", "Kimmy", "Ginger", "Steven", "Dale", "Heather", "Jason", "Heather", "Glen", "Angie", "Becky", "Mike"};

    JLabel welcome = new JLabel("Edit");
    JLabel status = new JLabel("?");
    JFrame eframe = new JFrame("Edit");
    JTextField txtf = new JTextField(10);
    JComboBox dropdown = new JComboBox(mynames);
    JButton doit2 = new JButton("Edit Selected Record");


    public void edit() {

        eframe.setSize(200, 200);

        eframe.setLayout(new FlowLayout());

        eframe.add(welcome);
        eframe.add(txtf);
        eframe.add(dropdown);
        eframe.add(status);
        eframe.add(doit2);

        eframe.setVisible(true);

    }
}

