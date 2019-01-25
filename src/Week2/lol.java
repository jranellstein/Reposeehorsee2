/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Patricia
 */
public class lol {
    public static void main(String[] args) {
        Distance d1 = new Distance(10, 500);
        Distance d2 = new Distance(20, 200);
        Distance d3 = new Distance();
        d3 = d1.add(d2);
        System.out.println(d3);
        
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 6);
        Complex c3 = new Complex();
        c3 = c1.add(c2);
        System.out.println(c3);
    }
}
