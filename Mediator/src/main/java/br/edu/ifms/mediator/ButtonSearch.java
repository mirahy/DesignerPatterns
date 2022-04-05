/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author aluno
 */
public class ButtonSearch extends JButton implements Command{

    private Mediator mediator;

    public ButtonSearch(ActionListener listener, Mediator mediator) {
       super("Search");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerSearch(this);
    }
    
    @Override
    public void execute() {
        mediator.search();
    }
    
}
