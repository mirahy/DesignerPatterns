/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.abstracfactory;

/**
 *
 * @author aluno
 */
public class App {
    
    private GUIFactory factory;

    public App(GUIFactory factory) {
        this.factory = factory;
    }
    
    void paint(){
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        
        button.paint();
        checkBox.paint();
    }
    
}
