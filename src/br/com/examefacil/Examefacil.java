/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil;


import br.com.examefacil.swing.TelaPrincipal;
import br.com.examefacil.tools.Util;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


/**
 *
 * @author bruno
 */
public class Examefacil {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    
                    new TelaPrincipal().setVisible(true);
                    
                } catch (Exception ex) {
                    Util.Aviso("Look and Feel não suportado: "+ex.getMessage());
                }
            }
        });
        
    }
    
}
