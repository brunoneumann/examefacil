/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.swing;

import br.com.examefacil.Examefacil;

/**
 *
 * @author Henrique
 */
public class TelaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TipoExames
     */
    public TelaUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPUsuario = new javax.swing.JPanel();
        jBCancelar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBIncluir = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jTPesquisar = new javax.swing.JTextField();
        jBFechar = new javax.swing.JButton();
        jCInclusaoAutomatica = new javax.swing.JCheckBox();
        jTabUsuario = new javax.swing.JTabbedPane();
        jPVisualizar = new javax.swing.JPanel();
        jLTipoExame = new javax.swing.JList<>();
        jEditar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPSenha = new javax.swing.JPasswordField();
        jCTipoAcesso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TipoExame");

        jPUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBCancelar.setText("Cancelar");
        jBCancelar.setEnabled(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");

        jBIncluir.setText("Incluir");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBGravar.setText("Gravar");
        jBGravar.setEnabled(false);

        jBExcluir.setText("Excluir");

        jTPesquisar.setText("Descrição");

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jCInclusaoAutomatica.setText("Inclusão Automática");
        jCInclusaoAutomatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCInclusaoAutomaticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPUsuarioLayout = new javax.swing.GroupLayout(jPUsuario);
        jPUsuario.setLayout(jPUsuarioLayout);
        jPUsuarioLayout.setHorizontalGroup(
            jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPUsuarioLayout.createSequentialGroup()
                        .addComponent(jBIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBeditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBFechar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPUsuarioLayout.createSequentialGroup()
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCInclusaoAutomatica))))
        );
        jPUsuarioLayout.setVerticalGroup(
            jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBIncluir)
                    .addComponent(jBeditar)
                    .addComponent(jBGravar)
                    .addComponent(jBExcluir)
                    .addComponent(jBFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCInclusaoAutomatica))
        );

        jLTipoExame.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout jPVisualizarLayout = new javax.swing.GroupLayout(jPVisualizar);
        jPVisualizar.setLayout(jPVisualizarLayout);
        jPVisualizarLayout.setHorizontalGroup(
            jPVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVisualizarLayout.createSequentialGroup()
                .addComponent(jLTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPVisualizarLayout.setVerticalGroup(
            jPVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTipoExame, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        jTabUsuario.addTab("Visualizar", jPVisualizar);

        jLabel1.setText("Nome do Usuário");

        jLabel2.setText("E-mail");

        jLabel3.setText("Senha");

        jCTipoAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Tipo de Acesso");

        javax.swing.GroupLayout jEditarLayout = new javax.swing.GroupLayout(jEditar);
        jEditar.setLayout(jEditarLayout);
        jEditarLayout.setHorizontalGroup(
            jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jTNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jTEmail)
                        .addComponent(jLabel3)
                        .addComponent(jPSenha)
                        .addComponent(jCTipoAcesso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jEditarLayout.setVerticalGroup(
            jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCTipoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabUsuario.addTab("Editar", jEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        jBIncluir.setEnabled(false);
        jBExcluir.setEnabled(false);
        jBPesquisar.setEnabled(false);
        jBeditar.setEnabled(false);
        jBFechar.setEnabled(false);
        jTPesquisar.setEnabled(false);
        jBGravar.setEnabled(true);
        jBCancelar.setEnabled(true);
        jTabUsuario.setSelectedIndex(1);
        

        
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        // TODO add your handling code here:
       setVisible(false);
       
        
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        jBIncluir.setEnabled(true);
        jBExcluir.setEnabled(true);
        jBPesquisar.setEnabled(true);
        jBeditar.setEnabled(true);
        jBFechar.setEnabled(true);
        jTPesquisar.setEnabled(true);
        jBGravar.setEnabled(false);
        jBCancelar.setEnabled(false);
        jTNomeUsuario.setText("");
        jTEmail.setText("");
        jPSenha.setText("");
        jTabUsuario.setSelectedIndex(0);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        
        /*Código para trazer as informações do registro selecionado*/
        
        jBIncluir.setEnabled(false);
        jBExcluir.setEnabled(false);
        jBPesquisar.setEnabled(false);
        jBeditar.setEnabled(false);
        jBFechar.setEnabled(false);
        jTPesquisar.setEnabled(false);
        jBGravar.setEnabled(true);
        jBCancelar.setEnabled(true);
        jTabUsuario.setSelectedIndex(1);
        
        
        
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jCInclusaoAutomaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCInclusaoAutomaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCInclusaoAutomaticaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JCheckBox jCInclusaoAutomatica;
    private javax.swing.JComboBox<String> jCTipoAcesso;
    private javax.swing.JPanel jEditar;
    private javax.swing.JList<String> jLTipoExame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPanel jPUsuario;
    private javax.swing.JPanel jPVisualizar;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNomeUsuario;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTabbedPane jTabUsuario;
    // End of variables declaration//GEN-END:variables
}
