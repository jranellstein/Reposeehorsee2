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
public class Complex {
    int real;
    int imag;
    public Complex(){
    }
    public Complex(int x, int y){
        this.real = x;
        this.imag = y;
    }
    public Complex add(Complex obj){
        Complex temp = new Complex();
        temp.real = this.real + obj.real;
        temp.imag = this.imag + obj.imag;
        return temp;
    }
    public Complex mul(Complex obj){
        Complex temp = new Complex();
        temp.real=(this.real*obj.real)-(this.imag*obj.imag);
        temp.imag=(this.real*obj.imag)+(this.imag*obj.real);
        return temp;
    }
    public String toString(){
        return real + " + " + imag + "i";
    }
    
}
