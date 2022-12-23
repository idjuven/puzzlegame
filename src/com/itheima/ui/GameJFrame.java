package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        //interface size
        this.setSize(603, 680);
        //title for the interface
        this.setTitle("PuzzleGame V1.0");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        this.setVisible(true);
    }

}
