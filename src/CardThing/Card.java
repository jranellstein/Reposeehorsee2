
package CardThing;
public class Card {
    String suit;
    int value;
    public Card(){
    }
    public Card(String givenSuit, int givenValue){
        suit = givenSuit;
        value = givenValue;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }
    public void setValue(int value) {
        if(value < 1 && value > 13){
            System.out.println("Not valid.");
        }
        else{
            this.value = value;
        }
    }
    public int getValue() {
        return value;
    }
    
}
