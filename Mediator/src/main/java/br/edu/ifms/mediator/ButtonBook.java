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
public class ButtonBook extends JButton implements Command{

    private Mediator mediator;

    public ButtonBook(ActionListener listener, Mediator mediator) {
       super("Book");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerBook(this);
    }
    
    @Override
    public void execute() {
        mediator.book();
    }
    
}
