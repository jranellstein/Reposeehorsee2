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
public class Square {
    private double side;
    public Square(){
    }
    public double getSide() {
        return side;
    }
    public void setSide(double x) {
        side = x;
    }
    public double calcArea(){
        return side * side;
    }
    public double calcPerimeter(){
        return side * 4;
    }
}
