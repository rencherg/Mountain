package com.mtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class delete {
    String[] names = {"Grant", "Nathan", "Taylor", "Gracie", "Jennifer", "Alan", "Paul", "Jolene", "Don", "Connie", "Ryan", "Laura", "Craig", "Kara", "Bryce", "Kimmy", "Ginger", "Steven", "Dale", "Heather", "Jason", "Heather", "Glen", "Angie", "Becky", "Mike"};

    JFrame dframe = new JFrame("Delete");
    JComboBox dropdown = new JComboBox(names);
    JLabel welcome = new JLabel("Delete Menu");
    JButton button = new JButton("Delete Selected Record");

    void delete() {

        dframe.setLayout(new FlowLayout());

        dframe.setSize(200, 100);

        dframe.add(welcome);
        dframe.add(dropdown);
        dframe.add(button);


        dframe.setVisible(true);
    }
}
