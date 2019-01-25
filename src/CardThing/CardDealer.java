
package CardThing;
public class CardDealer {
    public static void main(String[] args) {
        Card ha = new Card("Hearts", 9);
        System.out.println(ha.getValue() + " of " + ha.getSuit());
    }
}
