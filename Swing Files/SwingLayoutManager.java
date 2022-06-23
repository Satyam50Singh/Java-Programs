/**
 * commands to run swing program are same as the command used to run java program 
 * 
 * javac ClassName.java
 * java ClassName
 * 
 * */

import java.awt.*;
import javax.swing.*;

public class SwingLayoutManager extends JFrame{
    SwingLayoutManager() {
        JButton b1 = new JButton("Button 1");
        add(b1);
        JButton b2 = new JButton("Button 2");
        add(b2);
        JButton b3 = new JButton("Button 3");
        add(b3);
        JButton b4 = new JButton("Button 1");
        add(b4);
        JButton b5 = new JButton("Button 2");
        add(b5);
        JButton b6 = new JButton("Button 3");
        add(b6);
        JButton b7 = new JButton("Button 1");
        add(b7);
        JButton b8 = new JButton("Button 2");
        add(b8);
        JButton b9 = new JButton("Button 3");
        add(b9);
        setLayout(new GridLayout(3, 3, 10, 10));
    }
    public static void main(String[] args){
        SwingLayoutManager frame = new SwingLayoutManager();
        frame.setVisible(true);
        frame.setBounds(10, 10, 480, 250);
        frame.setTitle("Tic Tac Toe");
    }    
}


