/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;
public enum Coin {
    PENNY(1, "cent"),
    NICKEL(5, "cents"),
    DIME(10, "cents"),
    QUARTER(25, "cents"),
    LOONIE(1, "dollar"),
    TOONIE(2, "dollars");
    private int value;
    private String coinType;
    private Coin(int x, String y){
        value = x;
        coinType = y;
    }
    public int getValue(){
        return value;
    }
    public String getCoinTyper(){
        return coinType;
    }
    public String toString(){
       return "You have " + value + " " + coinType; 
    }
}
