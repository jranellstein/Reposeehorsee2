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
public class Distance {
    int km;
    int m;
    public Distance(){
    }
    public Distance(int km, int m){
        this.km = km;
        this.m = m;
    }
    public Distance add (Distance obj){
        Distance temp = new Distance();
        temp.km = this.km + obj.km;
        temp.m = this.m + obj.m;
        return temp;
    }
    public String toString(){
        return "The distance is " + km + "." + m;
    }
}
