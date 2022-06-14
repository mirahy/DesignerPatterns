/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.agenda.facade;

import br.edu.ifms.agenda.dao.ContatoDao;
import br.edu.ifms.agenda.model.Contato;
import br.edu.ifms.agenda.view.Agenda;
import br.edu.ifms.agenda.view.ListaAgenda;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class ContatoFacade {

    private ContatoDao dao;

    public ContatoFacade(ContatoDao dao) {
        this.dao = dao;
    }

    public ContatoFacade() {
        this(new ContatoDao());
    }

    public Agenda abrirFormulario(JFrame frame, ContatoFacade facade) {
        Agenda dialog = new Agenda(frame, true, facade);
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        return dialog;

    }
    
    public Agenda editarFormulario(
            JFrame frame,
            ContatoFacade facade,
            Long id) {
        Agenda dialog = abrirFormulario(frame, facade);
        dialog.setId(id);
        return dialog;
    }
    
    public void carregarDados(
            Long id,
            JTextField txtId,
            JTextField txtNome,
            JTextField txtTelefone,
            JTextField txtEmail) {
        Contato c = dao.buscarPorId(id);
        txtId.setText(c.getId().toString());
        txtNome.setText(c.getNome());
        txtTelefone.setText(c.getTelefone());
        txtEmail.setText(c.getEmail());
    }
    

    public boolean salvar(
            JTextField txtId,
            JTextField txtNome,
            JTextField txtTelefone,
            JTextField txtEmail
    ) {
        boolean isId = txtId.getText().matches("\\d+");
        Long id = isId ? Long.parseLong(txtId.getText()) : null;

        Contato cliente = new Contato();
        cliente.setId(id);
        cliente.setNome(txtNome.getText());
        cliente.setTelefone(txtTelefone.getText());
        cliente.setEmail(txtEmail.getText());

        if (!isId) {
            dao.inserir(cliente);
        } else {
            dao.alterar(cliente);
        }

        return Boolean.TRUE;

    }

    public Boolean excluir(JFrame frame, Long id) {
        if (JOptionPane.showConfirmDialog(frame, "Deseja excluir esse registro?",
                "Excluir", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            dao.excluir(id);

            JOptionPane.showMessageDialog(frame, "Registro excluídocom sucesso!",
                    "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return true;
    }

}
