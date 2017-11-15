/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.examefacil.renderer;

import br.com.examefacil.bean.Atender;
import br.com.examefacil.bean.Atender;
import br.com.examefacil.dao.AtenderDAO;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author bruno
 */
public class ExamesComboModel extends AbstractListModel<Atender> implements ComboBoxModel<Atender> {

    private List<Atender> lista;

    /* Seleciona um objeto na caixa de seleção */
    private Atender selecionado;

    public ExamesComboModel() {
        /* Popula a lista */
        popular();

        /* Define o objeto selecionado */
        setSelectedItem(lista.get(0));
    }

    /* Captura o tamanho da listagem */
    public int getSize() {
        int totalElementos = lista.size();
        return totalElementos;
    }

    /* Captura um elemento da lista em uma posição informada */
    public Atender getElementAt(int indice) {
        Atender a = lista.get(indice);
        return a;
    }

    /* Marca um objeto na lista como selecionado */
    public void setSelectedItem(Object item) {
        selecionado = (Atender) item;
    }

    /* Captura o objeto selecionado da lista */
    public Object getSelectedItem() {
        return selecionado;
    }

    private void popular() {
        try {
            AtenderDAO dao = new AtenderDAO();
            lista = dao.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}