/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.swing;

import br.com.examefacil.controller.AtendimentoDatasets;
import br.com.examefacil.dao.AtenderDAO;
import br.com.examefacil.dao.AtendimentoDAO;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author bruno
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard(String dataInicial, String dataFinal) {
        initComponents();
        
        ChartPanel chartPanelAtendimentosPorStatus = new ChartPanel(
                new AtendimentoDatasets()
                        .createChartAtendimentosPorStatus(new AtendimentoDAO().listaQtdeAtendimentosPorStatus(dataInicial, dataFinal)));
        chartPanelAtendimentosPorStatus.setPreferredSize(new java.awt.Dimension(250, 100));
        
        ChartPanel chartPanelAtendimentosPorTipoExame = new ChartPanel(
                new AtendimentoDatasets()
                    .createChartAtendimentosPorTipoExame(new AtenderDAO().listaQtdeAtendimentosPorTipoExame(dataInicial, dataFinal)));
        chartPanelAtendimentosPorTipoExame.setPreferredSize(new java.awt.Dimension(250, 100));
        
        ChartPanel chartPanelAtendimentosPorData = new ChartPanel(
                new AtendimentoDatasets()
                    .createChartAtendimentosPorData(new AtendimentoDAO().listaQtdeAtendimentosPorData(dataInicial, dataFinal)));
        chartPanelAtendimentosPorData.setPreferredSize(new java.awt.Dimension(250, 100));
        
        ChartPanel chartPanelAtendimentosPorAreaExame = new ChartPanel(
                new AtendimentoDatasets()
                    .createChartAtendimentosPorAreaExame(new AtenderDAO().listaQtdeAtendimentosPorAreaExame(dataInicial, dataFinal)));
        chartPanelAtendimentosPorAreaExame.setPreferredSize(new java.awt.Dimension(250, 100));
        
        JPanel panel = new JPanel();
        panel.setSize(new java.awt.Dimension(800, 600));
        panel.setLayout(new java.awt.GridLayout(2,2));
        panel.add(chartPanelAtendimentosPorStatus);
        panel.add(chartPanelAtendimentosPorTipoExame);
        panel.add(chartPanelAtendimentosPorData);
        panel.add(chartPanelAtendimentosPorAreaExame);
        
        this.setContentPane(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
