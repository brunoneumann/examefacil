/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.swing;

import br.com.examefacil.controller.BuscaPacienteControl;
import br.com.examefacil.controller.PacienteControl;
import br.com.examefacil.controller.UsuarioControl;
import br.com.examefacil.tools.Util;
import br.com.examefacil.view.BuscaPacienteView;
import br.com.examefacil.view.PacienteView;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author bruno
 */
public class DialogBuscarPaciente extends javax.swing.JDialog implements BuscaPacienteView{

    TelaExame telaExame;
    
    public DialogBuscarPaciente(java.awt.Dialog parent, boolean modal, TelaExame telaExame) {
        super(parent, modal);
        initComponents();
        this.telaExame = telaExame;
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

        jButton3 = new javax.swing.JButton();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jBSelecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABPacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fechar.png"))); // NOI18N
        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gravar.png"))); // NOI18N
        jBSelecionar.setText("Selecionar Paciente");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
            }
        });

        jTABPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTABPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTABPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTABPacientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSelecionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSelecionar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
            new BuscaPacienteControl().atualizaTabelaPacientes(this);       
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jTABPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTABPacientesMouseClicked


    }//GEN-LAST:event_jTABPacientesMouseClicked

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
        if(JTABPacientes().getSelectedRow()>-1){
            new BuscaPacienteControl().selecionarPaciente(JTABPacientes().getSelectedRow(), jTABPacientes, telaExame);
            this.dispose();
        } else {
            Util.Aviso("Selecione um paciente");
        }
    }//GEN-LAST:event_jBSelecionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTABPacientes;
    private javax.swing.JTextField jTPesquisar;
    // End of variables declaration//GEN-END:variables

    @Override
    public JButton jBPesquisar() {
        return jBPesquisar;
    }

    @Override
    public JButton jBFechar() {
        return jBFechar();
    }

    @Override
    public JButton jBSelecionar() {
        return jBSelecionar;
    }

    @Override
    public JTextField jTPesquisar() {
        return jTPesquisar;
    }

    @Override
    public JTable JTABPacientes() {
        return jTABPacientes;
    }
}
