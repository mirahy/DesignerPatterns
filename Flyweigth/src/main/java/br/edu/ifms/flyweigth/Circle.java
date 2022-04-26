/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.flyweigth;

/**
 *
 * @author aluno
 */
public class Circle implements Shape{
    
    private String color;
    private int x, y , radius;
    
    public Circle (String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System . out . println ( " Circle : Draw () [ Color : " + color + " , x : " + x + " , y : " + y + " ,radius : " + radius ) ;
    }
       
    
}
