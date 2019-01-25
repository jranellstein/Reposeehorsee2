/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

/**
 *
 * @author Patricia
 */
public class Room {
    private double length;
    private double width;
    
    public Room() {
    }
    public double getLength(){
        return length;
    }
    public void setLength(double x){
        length = x;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double x){
        width = x;
    }
    public String getDimensions(){
        return "The room is " + length + " x " + width;
    }
    public double getArea(){
        return length * width;
    }
}
