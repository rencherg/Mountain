package com.mtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainint {

    //main interface
    String[] mynames = {"Grant", "Nathan", "Taylor", "Gracie", "Jennifer", "Alan", "Paul", "Jolene", "Don", "Connie", "Ryan", "Laura", "Craig", "Kara", "Bryce", "Kimmy", "Ginger", "Steven", "Dale", "Heather", "Jason", "Heather", "Glen", "Angie", "Becky", "Mike"};
    //JLabel welcome = new JLabel("Welcome");
    //JLabel info = new JLabel("Take a click");
    Rectangle paneldim = new Rectangle(35, 35, 100, 100);
    JLayeredPane layeredp = new JLayeredPane();




    void mainint() {


        //frame
        JFrame thisframe = new JFrame("Mountain");
        thisframe.setSize(200, 240);
        thisframe.setDefaultCloseOperation(thisframe.EXIT_ON_CLOSE);
        thisframe.setLayout(new FlowLayout());

        //panel
        JLabel mainpanel = new JLabel();
        mainpanel.setBackground(Color.green);
        mainpanel.setBounds(paneldim);

        //buttons
        JButton view = new JButton("View");
        JButton add = new JButton("Add");
        JButton edit = new JButton("Edit");
        JButton delete = new JButton("Delete");
        JButton pane = new JButton("Pane");

        //toolbar
        JToolBar mybar = new JToolBar();
        mybar.setFloatable(false);

        //Button action listeners
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //info.setText("view selected");

                //create and call view
                view myview = new view();
                myview.view(mynames);
            }
        });

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //info.setText("add selected");

                add myadd = new add();
                myadd.add();
            }
        });

        edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //info.setText("edit selected");

                edit myedit = new edit();
                myedit.edit();
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //info.setText("delete selected");

                delete mydelete = new delete();
                mydelete.delete();
            }
        });

        pane.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //info.setText("pane selected");

                pane mypane = new pane();

                mypane.pane();
            }
        });

        //adding to toolbar
        mybar.add(view);
        mybar.add(add);
        mybar.add(edit);
        mybar.add(delete);
        mybar.add(pane);

        //adding to layered pane
        layeredp.add(mainpanel, 1);

        //adding to main frame
        thisframe.add(mybar);
        thisframe.add(layeredp);

        //thisframe.add(welcome);
        //thisframe.add(info);

        //doesn't work
        mainint.setIconImage(thisframe);



        thisframe.setResizable(false);
        thisframe.setVisible(true);

    }

    public static void setIconImage(JFrame window)
    {
        try {
            //InputStream imageInputStream = window.getClass().getResourceAsStream("/res/IMG_2927.JPG");
            //BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            //window.setIconImage(bufferedImage);
            Image im = Toolkit.getDefaultToolkit().getImage("com/mtn/IMG_2927.png");
            window.setIconImage(im);
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
