package com.mtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class view {
    String enter = "\n";
    JFrame vframe = new JFrame("View");
    JLabel view = new JLabel("View Existing Records.");
    JTextArea records = new JTextArea("This is the mountain.", 10, 10);

    JScrollPane scrollpane = new JScrollPane(records, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    public void view(String names[]) {

        vframe.setSize(160, 230);
        vframe.setLayout(new FlowLayout());
        vframe.add(view);
        JScrollBar mybar = new JScrollBar();

        String blank = " ";
        records.append(blank);

        for(String rcd : names) {
            records.append(rcd);
            records.append(enter);
        }

        //vframe.add(records);
        vframe.add(scrollpane);
        vframe.setVisible(true);

        //scrollpane.setVisible(true);
        //vframe.add(mybar);

    }
}
