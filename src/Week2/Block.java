/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;


public class Block {
    char letter;
    String color;
    public Block(){
    }
    public Block(char letter, String color){
        this.letter = letter;
        this.color = color;
    }
    public char getLetter() {
        return letter;
    }
    public String getColor() {
        return color;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return letter + " " + color;
    }
}
