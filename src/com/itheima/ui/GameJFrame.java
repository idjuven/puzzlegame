package com.itheima.ui;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        initJFrame();


        initJMenuBar();


        this.setVisible(true);
    }

    private void initJMenuBar() {
        //initialize user manu
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about");

        JMenuItem replayItem = new JMenuItem("restart game");
        JMenuItem reLoginItem = new JMenuItem("Login again");
        JMenuItem closeItem = new JMenuItem("close game");
        JMenuItem accountItem = new JMenuItem("public account");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //interface size
        this.setSize(603, 680);
        //title for the interface
        this.setTitle("PuzzleGame V1.0");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
