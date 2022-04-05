/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.mediator;

import javax.swing.JLabel;

/**
 *
 * @author aluno
 */
public class LabelDisplay extends JLabel{
    
    private Mediator mediator;

    public LabelDisplay(Mediator mediator) {
        super("Label test");
        this.mediator = mediator;
        mediator.registerDisplay(this);
    }
    
    
    
}
