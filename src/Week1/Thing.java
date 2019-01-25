
package Week1;


public class Thing {
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 1; i <= 7; i+=2){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        int thingy = 3;
        for(int i = 1; i <= 7; i+=2){
            thingy--;
            for(int k = thingy; k >= 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        int thingy2 = 4;
        for(int i = 1; i <= 5; i++){
            thingy2--;
            for(int k = thingy2; k >= 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int l = i - 1; l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
