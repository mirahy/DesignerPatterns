/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.abstracfactory;

/**
 *
 * @author aluno
 */
public class Demo {
    
    private static App configureApp () {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        
        if(osName.contains("mac")){
            factory = new MacOsFactory();
        }else{
            factory = new WindowsFactory();
        }
        
        app = new App(factory);
        return app;
    }
    
    
    public static void main(String[] args) {
        App app = configureApp();
        app.paint();
    }

    
}
