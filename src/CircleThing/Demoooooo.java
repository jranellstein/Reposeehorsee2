/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleThing;

/**
 *
 * @author Justin
 */
public class Demoooooo{
    public static void main(String args[]){
        Circle c1 = new Circle();
        c1.setRadius(16.7);
        double area = c1.getArea();
        System.out.format("%.2f\n", area);
        Circle c2 = new Circle(6,"red");
        System.out.println(c2);
        Shape s = new Circle(5, "yellow");
        
//        Room r1 = new Room();
//        r1.setLength(4.5);
//        r1.setWidth(5.7);
//        System.out.println("\n" + r1.getDimensions());
//        System.out.format("%.2f",r1.getArea());

//        Circle[] circleArray = new Circle[10];
//        double area;
//        for(int i = 0; i < 10; i++){
//            circleArray[i] = new Circle(6);
//            area = circleArray[i].getArea();
//            System.out.println(circleArray[i]);
//        }
        
    }
}
