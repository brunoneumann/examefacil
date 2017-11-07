/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.swing;

import br.com.examefacil.controller.ExameControl;
import br.com.examefacil.controller.UsuarioControl;
import javax.swing.JButton;
import javax.swing.JLabel;
import br.com.examefacil.view.ExameView;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author bruno
 */
public class TelaExame extends javax.swing.JDialog implements ExameView{

    
    
    public TelaExame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPAreaExame = new javax.swing.JPanel();
        jBCancelar = new javax.swing.JButton();
        jBIncluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBFecha = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLIDExame = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTDataAtendimento = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            jTDataAtendimento = new javax.swing.JFormattedTextField(data);
        } catch (Exception e) {

        }
        jLabel5 = new javax.swing.JLabel();
        jTHoraEntrada = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter hora = new javax.swing.text.MaskFormatter("##:##");
            jTHoraEntrada = new javax.swing.JFormattedTextField(hora);
        } catch (Exception e) {

        }
        jLabel6 = new javax.swing.JLabel();
        jTHoraSaida = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter hora = new javax.swing.text.MaskFormatter("##:##");
            jTHoraSaida = new javax.swing.JFormattedTextField(hora);
        } catch (Exception e) {

        }
        jLIDPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservacoes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exame");
        setAlwaysOnTop(true);

        jPAreaExame.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/incluir.png"))); // NOI18N
        jBIncluir.setText("Incluir");
        jBIncluir.setEnabled(false);
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

        jBFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fechar.png"))); // NOI18N
        jBFecha.setText("Fechar");
        jBFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAreaExameLayout = new javax.swing.GroupLayout(jPAreaExame);
        jPAreaExame.setLayout(jPAreaExameLayout);
        jPAreaExameLayout.setHorizontalGroup(
            jPAreaExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAreaExameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAreaExameLayout.setVerticalGroup(
            jPAreaExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAreaExameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAreaExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBIncluir)
                    .addComponent(jBEditar)
                    .addComponent(jBGravar)
                    .addComponent(jBExcluir)
                    .addComponent(jBFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Paciente");

        jTPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPacienteMouseClicked(evt);
            }
        });

        jLabel4.setText("Data Atendimento");

        jLabel5.setText("Hora Entrada");

        jLabel6.setText("Hora Saída");

        jLabel1.setText("Observações");

        jTObservacoes.setColumns(20);
        jTObservacoes.setRows(5);
        jScrollPane1.setViewportView(jTObservacoes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLIDExame, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jTHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIDExame, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPAreaExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPAreaExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
            this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        ExameControl control = new ExameControl();
        control.salvar(this);
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed

    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBFechaActionPerformed

    private void jTPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPacienteMouseClicked
        
        new DialogBuscarPaciente(this, rootPaneCheckingEnabled, this).setVisible(true);
        
    }//GEN-LAST:event_jTPacienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFecha;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JLabel jLIDExame;
    private javax.swing.JLabel jLIDPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPAreaExame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDataAtendimento;
    private javax.swing.JTextField jTHoraEntrada;
    private javax.swing.JTextField jTHoraSaida;
    private javax.swing.JTextArea jTObservacoes;
    private javax.swing.JTextField jTPaciente;
    // End of variables declaration//GEN-END:variables

    @Override
    public JButton jBIncluir() {
        return jBIncluir;
    }

    @Override
    public JButton jBEditar() {
        return jBEditar;
    }

    @Override
    public JButton jBCancelar() {
        return jBCancelar;
    }

    @Override
    public JButton jBGravar() {
        return jBGravar;
    }

    @Override
    public JButton jBExcluir() {
        return jBExcluir;
    }

    @Override
    public JButton jBFechar() {
        return jBFecha;
    }

    @Override
    public String getPaciente() {
        return jTPaciente.getText();
    }

    @Override
    public String getData() {
        return jTDataAtendimento.getText();
    }

    @Override
    public String getHoraAtendimeto() {
        return jTHoraEntrada.getText();
    }

    @Override
    public String getHoraSaida() {
        return jTHoraSaida.getText();
    }

    @Override
    public JLabel jLIDExame() {
        return jLIDExame;
    }

    @Override
    public JTextField jTPaciente() {
        return jTPaciente;
    }

    @Override
    public JTextField jTDataAtendimento() {
        return jTDataAtendimento;
    }

    @Override
    public JTextField jTHoraEntrada() {
        return jTHoraEntrada;
    }

    @Override
    public JTextField jTHoraSaida() {
        return jTHoraSaida;
    }

   
    @Override
    public JLabel JLIDPaciente() {
        return jLIDPaciente;
    }

    @Override
    public JTextArea jTObservacoes() {
        return jTObservacoes;
    }

    @Override
    public String getObservacoes() {
        return jTObservacoes().getText();
    }
}
