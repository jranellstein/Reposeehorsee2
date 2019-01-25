/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunTime;

/**
 *
 * @author Justin
 */
import Week1.Circle;
public class UrBad {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(21.76);
        System.out.format("%.2f", c1.getArea());
    }
}
