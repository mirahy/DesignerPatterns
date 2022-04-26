/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.flyweigth;

import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class ShapeFactory {
    
    @SuppressWarnings("uncheckend")
    private static final HashMap circleMap = new HashMap();
    
    public static Shape getCircle ( String color ) {
        Circle circle = (Circle)circleMap.get(color);
        
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating cirlce of color : " + color);
            
        }
        return circle;
    }
    
}
