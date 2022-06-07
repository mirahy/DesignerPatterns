/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.agenda.database;

import br.edu.ifms.agenda.dao.ContatoDao;
import br.edu.ifms.agenda.model.Contato;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class ContatoTableModel extends AbstractTableModel{

   private ContatoDao dao;
    private List<Contato> lista;
    private String[] colunas = {"Id", "Nome", "Telefone", "E-mail"};
    
    public ContatoTableModel() {
        dao = new ContatoDao();
        lista = dao.listar();
    }
    
    public void refresh(String nome) {
        lista.clear();
        lista.addAll(dao.buscarPorNome(nome));
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Contato obj = lista.get(row);
        switch (col) {
            case 0: return obj.getId();
            case 1: return obj.getNome();
            case 2: return obj.getTelefone();
            case 3: return obj.getEmail();
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        if (columnIndex == 0) {
            return Long.class;
        }
        return String.class;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
}
