/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.mediator;

/**
 *
 * @author aluno
 */
public class Mediator {
    
    private ButtonView buttonView;
    private ButtonBook buttonBook;
    private ButtonSearch buttonSearch;
    private LabelDisplay labelDisplay;
    
    public  void registerView(ButtonView buttonView){
        this.buttonView = buttonView;
    }
    
    public  void registerBook(ButtonBook buttonBook){
        this.buttonBook = buttonBook;
    }
    
    public void registerSearch(ButtonSearch buttonSearch) {
        this.buttonSearch = buttonSearch;
    }
    
    public void registerDisplay(LabelDisplay labelDisplay) {
        this.labelDisplay = labelDisplay;
    }
    
    public void view(){
        buttonView.setEnabled(false);
        buttonBook.setEnabled(true);
        buttonSearch.setEnabled(true);
        labelDisplay.setText("Viewing...");
    }
    
    public void book(){
        buttonBook.setEnabled(false);
        buttonView.setEnabled(true);
        buttonSearch.setEnabled(true);
        labelDisplay.setText("Booking...");
    }

    public void search() {
        buttonSearch.setEnabled(false);
        buttonBook.setEnabled(true);
        buttonView.setEnabled(true);
        labelDisplay.setText("Seraching...");
    }

    

    
}
