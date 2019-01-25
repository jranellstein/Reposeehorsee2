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
public class Shape {
    String color;
    public Shape(){
    }
    public Shape(String c){
        color = c;
    }
    public String toString(){
        return super.toString()+"The color is " + color;
    }
}
