/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mdi;

import javax.swing.JFrame;

/**
 *
 * @author Bruno
 */
public class Mdi extends JFrame {
     
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
   
            }
        });
    }
}
