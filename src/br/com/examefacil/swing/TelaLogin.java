/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.swing;

import br.com.examefacil.bean.Usuario;
import br.com.examefacil.controller.UsuarioControl;
import br.com.examefacil.tools.Util;
import br.com.examefacil.view.LoginView;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Henrique
 */
public class TelaLogin extends javax.swing.JFrame implements LoginView{

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin(){
        initComponents();
        setLocationRelativeTo( null );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("E-mail ");

        jTUsuario.setText("bruno");
        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        jPSenha.setText("123");
        jPSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenhaActionPerformed(evt);
            }
        });

        jBEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gravar.png"))); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jBEntrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jBEntrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        Usuario u = new UsuarioControl().testaAcesso(jTUsuario.getText(), jPSenha.getText());
        
        if(u!=null){
            new TelaPrincipal(u).setVisible(true);
            /*TelaPrincipalView view = new TelaPrincipal();
            usuarioLogado = u;
            TelaPrincipalControl control = new TelaPrincipalControl();
            control.habilitaMenus(view);
            control.carregaPermissoes(view, usuarioLogado.getIdusuario());*/
            this.dispose();
        } else {
            Util.Error("Usuário não encontrado!");
        }
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jPSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getUsuario() {
        return jTUsuario().getText();
    }

    @Override
    public String getSenha() {
        return jPSenha().getText();
    }

    @Override
    public JFrame jILogin() {
        return jILogin();
    }

    @Override
    public JTextField jTUsuario() {
        return jTUsuario;
    }

    @Override
    public JPasswordField jPSenha() {
        return jPSenha;
    }

    @Override
    public JButton jBEntrar() {
        return jBEntrar;
    }
}
