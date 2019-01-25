/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

public class Tester {
    public static void main(String[] args) {
        Square thing = new Square();
        thing.setSide(5.0);
        System.out.format("%.2f %.2f", thing.calcArea(), thing.calcPerimeter());
    }
}
