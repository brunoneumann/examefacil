/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package br.com.examefacil.controller;

import br.com.examefacil.bean.Acesso;
import br.com.examefacil.bean.Paciente;
import br.com.examefacil.dao.PacienteDAO;
import br.com.examefacil.swing.TelaPrincipal;
import br.com.examefacil.tools.Util;
import br.com.examefacil.view.PacienteView;
import com.towel.el.FieldResolver;
import com.towel.el.factory.FieldResolverFactory;
import com.towel.swing.table.ObjectTableModel;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author bruno
 */
public class PacienteControl {

    public PacienteControl() {
    }

    public void init(PacienteView view) {
        atualizaTabelaPacientes(view);

        /* Desabilita aba editar */
        view.jTabPaciente().setEnabledAt(1, false);
        view.jLIDPaciente().setVisible(false);

        carregaPermissaoIncluir(view);
    }

    public void carregaPermissaoIncluir(PacienteView view) {
        List<Acesso> permissoes = new AcessoControl().listaAcessosUsuario(TelaPrincipal.usuarioLogado.getIdusuario());
        for (Acesso a : permissoes) {
            if (a.getPagina().equals("paciente")) {
                view.jBIncluir().setEnabled(a.isIncluir());
                break;
            }
        }
    }

    public void carregaPermissaoAlterarExcluir(PacienteView view) {
        List<Acesso> permissoes = new AcessoControl().listaAcessosUsuario(TelaPrincipal.usuarioLogado.getIdusuario());
        for (Acesso a : permissoes) {
            if (a.getPagina().equals("paciente")) {
                view.jBeditar().setEnabled(a.isAlterar());
                view.jBExcluir().setEnabled(a.isExcluir());
                break;
            }
        }
    }

    public void atualizaTabelaPacientes(PacienteView view) {
        view.JTABPacientes().setModel(tableModelPacientes(view));
        view.JTABPacientes().setColumnModel(tableColumnPacientes(view));
    }

    public boolean salvar(PacienteView view) {
        if (validaCampos(view)) {
            Paciente paciente = new Paciente();
            if (view.jLIDPaciente().getText() != null) {
                paciente.setIdpaciente(Integer.parseInt(view.jLIDPaciente().getText()));
            }
            paciente.setNome(view.getNome());
            paciente.setCpf(view.getCPF());
            paciente.setEmail(view.getEmail());

            boolean result = new PacienteDAO().save(paciente);
            if (result) {
                limparTextos(view);
                desabilitaBotoesEditar(view);
                atualizaTabelaPacientes(view);
            }
            return result;
        } else {
            return false;
        }
    }

    public boolean excluir(PacienteView view) {
        if (Util.Confirma("Deseja realmente excluir este paciente?\n"
                + "Nome: " + view.JTABPacientes().getModel().getValueAt(view.JTABPacientes().getSelectedRow(), 1))) {

            boolean result = new PacienteDAO().delete(pacienteSelecionado(view));
            if (result) {
                atualizaTabelaPacientes(view);
            }
        }
        alteraEstadoEditarExcluir(view, false);
        return false;
    }

    public Paciente get(int id) {
        return new PacienteDAO().get(id);
    }

    public List<Paciente> listar() {
        return new PacienteDAO().list();
    }

    public List<Paciente> listar(String parametro) {
        return new PacienteDAO().list(parametro);
    }

    public Paciente pacienteSelecionado(PacienteView view) {
        int selected = view.JTABPacientes().getSelectedRow();
        return get((int) view.JTABPacientes().getModel().getValueAt(selected, 0));
    }

    public void carregarDados(PacienteView view) {
        Paciente p = pacienteSelecionado(view);
        if (p != null) {
            habilitaBotoesEditar(view);
            view.jLIDPaciente().setText(p.getIdpaciente() + "");
            view.jTNomePaciente().setText(p.getNome());
            view.jTCPF().setText(p.getCpf());
            view.JTEmail().setText(p.getEmail());
        }
    }

    public TableModel tableModelPacientes(PacienteView view) {
        FieldResolverFactory frf = new FieldResolverFactory(Paciente.class);
        FieldResolver frID = frf.createResolver("idpaciente", "ID");
        FieldResolver frNome = frf.createResolver("nome", "Nome");
        FieldResolver frCPF = frf.createResolver("cpf", "CPF");
        FieldResolver frEmail = frf.createResolver("email", "E-mail");

        ObjectTableModel<Paciente> model
                = new ObjectTableModel<Paciente>(
                        new FieldResolver[]{frID, frNome, frCPF, frEmail});

        model.setEditableDefault(false);
        model.setData(this.listar(view.jTPesquisarPaciente().getText()));
        return model;
    }

    public TableColumnModel tableColumnPacientes(PacienteView view) {
        TableColumnModel coluna = view.JTABPacientes().getColumnModel();
        coluna.getColumn(0).setPreferredWidth(5);
        coluna.getColumn(1).setPreferredWidth(150);
        coluna.getColumn(2).setPreferredWidth(50);
        coluna.getColumn(3).setPreferredWidth(50);
        return coluna;
    }

    public void novoPaciente(PacienteView view) {
        habilitaBotoesEditar(view);
        view.jLIDPaciente().setText(null);
    }

    public void alteraEstadoEditarExcluir(PacienteView view, boolean action) {
        view.jBExcluir().setEnabled(action);
        view.jBeditar().setEnabled(action);

        carregaPermissaoAlterarExcluir(view);
    }

    public void limparTextos(PacienteView view) {
        view.jTNomePaciente().setText("");
        view.jTCPF().setText("");
        view.JTEmail().setText("");
    }

    public void habilitaBotoesEditar(PacienteView view) {
        view.jBIncluir().setEnabled(false);
        view.jBExcluir().setEnabled(false);
        view.jBPesquisar().setEnabled(false);
        view.jBeditar().setEnabled(false);
        view.jBGravar().setEnabled(true);
        view.jBCancelar().setEnabled(true);
        view.jTPesquisarPaciente().setEnabled(false);
        view.jTabPaciente().setSelectedIndex(1);
        view.jCInclusaoAutomatica().setSelected(false);
        view.jTabPaciente().setEnabledAt(0, false);
        view.jTabPaciente().setEnabledAt(1, true);
    }

    public void desabilitaBotoesEditar(PacienteView view) {
        if (!view.jCInclusaoAutomatica().isSelected()) {
            view.jBIncluir().setEnabled(true);
            view.jBExcluir().setEnabled(false);
            view.jBPesquisar().setEnabled(true);
            view.jBeditar().setEnabled(false);
            view.jTPesquisarPaciente().setEnabled(true);
            view.jBGravar().setEnabled(false);
            view.jBCancelar().setEnabled(false);
            view.jTabPaciente().setSelectedIndex(0);
            view.jTabPaciente().setEnabledAt(0, true);
            view.jTabPaciente().setEnabledAt(1, false);
        }
    }

    public boolean validaCampos(PacienteView view) {

        if (view.jTNomePaciente().getText().equals("")
                || view.jTNomePaciente().getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe um valor válido no campo: " + view.jTNomePaciente().getName() + "", "Erro de validação", JOptionPane.ERROR_MESSAGE);

            return false;
        } else if (view.jTCPF().getText().equals("")
                || view.jTCPF().getText().equals(" ")) {

            JOptionPane.showMessageDialog(null, "Informe um valor válido no campo: " + view.jTCPF().getName() + "", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!validaCPF(view.getCPF())) {
            JOptionPane.showMessageDialog(null, "O CPF informado é inválido", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (view.JTEmail().getText().equals("")
                || view.JTEmail().getText().equals(" ")) {

            JOptionPane.showMessageDialog(null, "Informe um valor válido no campo: " + view.JTEmail().getName() + "", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!validarEmail(view.getEmail())) {

            JOptionPane.showMessageDialog(null, "O E-mail informado não é válido", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            return true;
        }

    }

    public static boolean validaCPF(String strCpf) {

        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;
        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;
        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();
            d1 = d1 + (11 - nCount) * digitoCPF;
            d2 = d2 + (12 - nCount) * digitoCPF;
        }
        resto = (d1 % 11);
        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }
        d2 += 2 * digito1;
        resto = (d2 % 11);
        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }
        String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
        return nDigVerific.equals(nDigResult);
    }
    public static boolean validarEmail(String email)
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
}
