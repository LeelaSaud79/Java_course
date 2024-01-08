/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dell
 */

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
public class Frame extends JFrame{
    Container c;
    public Frame(){
         setSize(500, 700);
//        jf.setLocation(150, 150);
        setLocationRelativeTo(null);
        setTitle("Leela");
        c = this.getContentPane();
        c.setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    public static void main(String []args){
        
        new Frame();
    }
}

    
    
