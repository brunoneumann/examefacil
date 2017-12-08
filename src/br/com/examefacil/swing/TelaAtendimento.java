/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.examefacil.swing;

import br.com.examefacil.bean.Atendimento;
import br.com.examefacil.controller.AtendimentoControl;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import br.com.examefacil.view.AtendimentoView;
import br.com.examefacil.view.TelaPrincipalView;
import com.toedter.calendar.JDateChooser;
import java.util.Date;

/**
 *
 * @author bruno
 */

public class TelaAtendimento extends javax.swing.JDialog implements AtendimentoView {
    
    public TelaPrincipalView viewPrincipal;
    
    public TelaAtendimento(java.awt.Frame parent, boolean modal, Atendimento atendimento, TelaPrincipalView viewPrincipal) {

        super(parent, modal);
        this.viewPrincipal = viewPrincipal;
        initComponents();
        jLIDAtendimento.setVisible(false); 
        jLIDPaciente.setVisible(false);
        jLIDUsuario.setVisible(false);
        

        new AtendimentoControl(viewPrincipal).init(this, atendimento);

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
        jBGravar = new javax.swing.JButton();
        jBFecha = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLIDPaciente = new javax.swing.JLabel();
        jTPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservacoes = new javax.swing.JTextArea();
        jLIDAtendimento = new javax.swing.JLabel();
        jLIDUsuario = new javax.swing.JLabel();
        jDtDataAtendimento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exame");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(600, 500));

        jPAreaExame.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gravar.png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
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
                .addComponent(jBGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAreaExameLayout.setVerticalGroup(
            jPAreaExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAreaExameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAreaExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGravar)
                    .addComponent(jBFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPaciente.setName("Paciente"); // NOI18N
        jTPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPacienteMouseClicked(evt);
            }
        });
        jTPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPacienteKeyPressed(evt);
            }
        });

        jLabel4.setText("Data Atendimento");

        jLabel5.setText("Hora Entrada");

        jTHoraEntrada.setName("Hora de entrada"); // NOI18N

        jLabel6.setText("Hora Saída");

        jTHoraSaida.setName(""); // NOI18N

        jLabel1.setText("Observações");

        jTObservacoes.setColumns(20);
        jTObservacoes.setRows(5);
        jScrollPane1.setViewportView(jTObservacoes);

        jDtDataAtendimento.setDateFormatString("dd/MM/yyyy");
        jDtDataAtendimento.setName("Data de atendimento"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLIDAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jDtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTHoraSaida)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIDAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDtDataAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTHoraEntrada)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTHoraSaida)))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setText("Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPAreaExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPAreaExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed

        AtendimentoControl control = new AtendimentoControl(viewPrincipal);

        if(control.salvar(this)){
            this.dispose();
        }
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBFechaActionPerformed

    private void jTPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPacienteMouseClicked
        
        new DialogBuscarPaciente(this, rootPaneCheckingEnabled, this).setVisible(true);
        
    }//GEN-LAST:event_jTPacienteMouseClicked

    private void jTPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPacienteKeyPressed
        new DialogBuscarPaciente(this, rootPaneCheckingEnabled, this).setVisible(true);
    }//GEN-LAST:event_jTPacienteKeyPressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFecha;
    private javax.swing.JButton jBGravar;
    private com.toedter.calendar.JDateChooser jDtDataAtendimento;
    private javax.swing.JLabel jLIDAtendimento;
    private javax.swing.JLabel jLIDPaciente;
    private javax.swing.JLabel jLIDUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPAreaExame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTHoraEntrada;
    private javax.swing.JTextField jTHoraSaida;
    private javax.swing.JTextArea jTObservacoes;
    private javax.swing.JTextField jTPaciente;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public JButton jBGravar() {
        return jBGravar;
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
    public String getHoraAtendimeto() {
        return jTHoraEntrada.getText();
    }
    
    @Override
    public String getHoraSaida() {
        return jTHoraSaida.getText();
    }
    
    @Override
    public JTextField jTPaciente() {
        return jTPaciente;
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

    @Override
    public JLabel jLIDAtendimento() {
        return jLIDAtendimento;
    }

    @Override
    public JLabel jLIDUsuario() {
        return jLIDUsuario;
    }

    @Override
    public JDateChooser jDtDataAtendimento() {
        return jDtDataAtendimento;
    }

    @Override
    public Date getData() {
        return jDtDataAtendimento.getDate();
    }
}
