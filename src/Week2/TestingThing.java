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
import java.util.Scanner;
public class TestingThing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String thing = "Hello World";
        char[] hah = new char[thing.length()];
        for(int i = 0; i < thing.length(); i++){
            hah[i] = thing.charAt(i);
        }
        for(int i = 0; i < thing.length(); i++){
            System.out.print(hah[i]);
        }
        System.out.println();
        for(int i = thing.length()-1; i >= 0; i--){
            System.out.print(hah[i]);
        }
        Block b1 = new Block('F', "Green");
        Block b2 = new Block();
        b2.setLetter('G');
        b2.setColor("Black");
        b1.setLetter('J');
        System.out.println("\n" + b1);
        System.out.println(b2);
        
        
        Student[] list = new Student[5];
        for(int i = 0; i < list.length; i++){
            list[i]=new Student();
            System.out.println("Please enter name");
            list[i].setName(input.nextLine());
        }
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i].getName());
        }
    }
}
