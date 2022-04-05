/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.mediator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author aluno
 */
public class MediatorExample extends JFrame implements ActionListener{
    
    private Mediator mediator = new Mediator();

    public MediatorExample() throws HeadlessException {
        super("Teste de Mediação");
        JPanel p = new JPanel();
        p.add(new ButtonView(this, mediator));
        p.add(new ButtonBook(this, mediator));
        p.add(new ButtonSearch(this, mediator));
        
        Container c = getContentPane();
        c.add(new LabelDisplay(mediator), BorderLayout.NORTH);
        c.add(p, BorderLayout.SOUTH);
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        setVisible(true);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof Command){
            Command c = (Command) e.getSource();
            c.execute();
        }
    }
    
    public static void main(String[] args) {
        new MediatorExample();
    }
      
    
}
