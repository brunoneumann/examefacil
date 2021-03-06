/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.swing;

import br.com.examefacil.controller.TipoExameControl;
import br.com.examefacil.view.TipoExameView;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Henrique
 */
public class TelaTipoExame extends javax.swing.JFrame implements TipoExameView{

    /**
     * Creates new form TipoExames
     */
    public TelaTipoExame() {
        initComponents();
        //setLocationRelativeTo( null );
        new TipoExameControl().init(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTipoExame = new javax.swing.JPanel();
        jBCancelar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBIncluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jTPesquisar = new javax.swing.JTextField();
        jBFechar = new javax.swing.JButton();
        jCInclusaoAutomatica = new javax.swing.JCheckBox();
        jTabTipoExame = new javax.swing.JTabbedPane();
        jPVisualizar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABTipoExame = new javax.swing.JTable();
        jEditar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTTipoExame = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCAreaExame = new javax.swing.JComboBox<>();
        jLIDTipoExame = new javax.swing.JLabel();
        jTDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipos de Exame");

        jPTipoExame.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setEnabled(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/incluir.png"))); // NOI18N
        jBIncluir.setText("Incluir");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });

        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setEnabled(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gravar.png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.setEnabled(false);
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excluir.png"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.setEnabled(false);
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jTPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPesquisarActionPerformed(evt);
            }
        });

        jBFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fechar.png"))); // NOI18N
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

        javax.swing.GroupLayout jPTipoExameLayout = new javax.swing.GroupLayout(jPTipoExame);
        jPTipoExame.setLayout(jPTipoExameLayout);
        jPTipoExameLayout.setHorizontalGroup(
            jPTipoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoExameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTipoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTipoExameLayout.createSequentialGroup()
                        .addComponent(jBIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBFechar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPTipoExameLayout.createSequentialGroup()
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCInclusaoAutomatica))))
        );
        jPTipoExameLayout.setVerticalGroup(
            jPTipoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoExameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTipoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBIncluir)
                    .addComponent(jBEditar)
                    .addComponent(jBGravar)
                    .addComponent(jBExcluir)
                    .addComponent(jBFechar))
                .addGap(18, 18, 18)
                .addGroup(jPTipoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTipoExameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCInclusaoAutomatica))
        );

        jTABTipoExame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTABTipoExame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTABTipoExameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTABTipoExame);

        javax.swing.GroupLayout jPVisualizarLayout = new javax.swing.GroupLayout(jPVisualizar);
        jPVisualizar.setLayout(jPVisualizarLayout);
        jPVisualizarLayout.setHorizontalGroup(
            jPVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        jPVisualizarLayout.setVerticalGroup(
            jPVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVisualizarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabTipoExame.addTab("Visualizar", jPVisualizar);

        jLabel1.setText("Tipo de Exame");

        jTTipoExame.setName("Tipo de Exame"); // NOI18N

        jLabel2.setText("Descrição");

        jLabel3.setText("Area do Exame");

        jCAreaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAreaExameActionPerformed(evt);
            }
        });

        jTDescricao.setColumns(20);
        jTDescricao.setRows(5);
        jTDescricao.setName("Descrição"); // NOI18N

        javax.swing.GroupLayout jEditarLayout = new javax.swing.GroupLayout(jEditar);
        jEditar.setLayout(jEditarLayout);
        jEditarLayout.setHorizontalGroup(
            jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTDescricao)
                    .addGroup(jEditarLayout.createSequentialGroup()
                        .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jEditarLayout.createSequentialGroup()
                                .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jEditarLayout.createSequentialGroup()
                                        .addComponent(jCAreaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLIDTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jEditarLayout.setVerticalGroup(
            jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLIDTipoExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCAreaExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabTipoExame.addTab("Editar", jEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTipoExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabTipoExame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabTipoExame)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        new TipoExameControl().novoTipoExame(this);
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        // TODO add your handling code here:
       setVisible(false);
       
        
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        jCInclusaoAutomatica.setSelected(false);
        new TipoExameControl().desabilitaBotoesEditar(this);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
           new TipoExameControl().carregarDados(this);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
       TipoExameControl control = new TipoExameControl();
        control.salvar(this); 
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jCInclusaoAutomaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCInclusaoAutomaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCInclusaoAutomaticaActionPerformed

    private void jCAreaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAreaExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAreaExameActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        new TipoExameControl().atualizaTabelaTipoExame(this);
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        new TipoExameControl().excluir(this);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTABTipoExameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTABTipoExameMouseClicked
        new TipoExameControl().alteraEstadoEditarExcluir(this, true);
    }//GEN-LAST:event_jTABTipoExameMouseClicked

    private void jTPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTipoExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTipoExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTipoExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTipoExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipoExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox<String> jCAreaExame;
    private javax.swing.JCheckBox jCInclusaoAutomatica;
    private javax.swing.JPanel jEditar;
    private javax.swing.JLabel jLIDTipoExame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPTipoExame;
    private javax.swing.JPanel jPVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTABTipoExame;
    private javax.swing.JTextArea jTDescricao;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTTipoExame;
    private javax.swing.JTabbedPane jTabTipoExame;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getNome() {
        return jTTipoExame().getText();
    }

    @Override
    public String getDescricao() {
        return jTDescricao().getText();
    }

    @Override
    public int getIdareaexame() {
        return jCAreaExame.getSelectedIndex();
    }

    @Override
    public JTextField jTTipoExame() {
        return jTTipoExame;
    }

    @Override
    public JTextArea jTDescricao() {
        return jTDescricao;
    }

    @Override
    public JComboBox jCAreaExame() {
        return jCAreaExame;
    }



    @Override
    public JTextField jTPesquisar() {
        return jTPesquisar;
    }

    @Override
    public JButton jBIncluir() {
        return jBIncluir;
    }

    @Override
    public JButton jBExcluir() {
        return jBExcluir;
    }

    @Override
    public JButton jBPesquisar() {
        return jBPesquisar;
    }

    @Override
    public JButton jBEditar() {
        return jBEditar;
    }

    @Override
    public JButton jBGravar() {
        return jBGravar;
    }

    @Override
    public JButton jBCancelar() {
        return jBCancelar;
    }

    @Override
    public JTabbedPane jTabTipoExame() {
        return jTabTipoExame;
    }

    @Override
    public JCheckBox jCInclusaoAutomatica() {
        return jCInclusaoAutomatica;
    }

    @Override
    public JLabel jLIDTipoExame() {
        return jLIDTipoExame;
    }

    @Override
    public JTable jTABTipoExame() {
        return jTABTipoExame;
    }
}
