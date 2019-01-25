/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleThing;

/**
 *
 * @author Patricia
 */

public class Circle extends Shape {
    double radius = 1;
    public Circle(){
    }
    public Circle(double x){
        radius = x;
    }
    public Circle(double x, String c){
        super(c);
        radius = x;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double i){
        radius = i;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "Radius is " + radius;
    }
    
}
