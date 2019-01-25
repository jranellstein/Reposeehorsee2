package marsellj_assignment1;
/*
 * Name:  Justin Marsella
 * Assignment:  Assignment 1 Question 2
 * Program: Computer Programmer

 * This program is meant to be a bank program where you are able to set an 
 * initial balance in a chequing and savings account, and configure it however 
 * you want until you are satisfied.
 */
import java.util.Scanner;
public class Assign1_Q2 {
    public static void main(String[] args) {
        //Scanner is initialized
        Scanner input = new Scanner(System.in);
        //Necessary variables are initialized with default values
        String command = "";
        String account = "";
        double cash = 0;
        System.out.println("Hello! Welcome to your banking program!");
        //Bank class is instantiated
        Bank justinBank = new Bank(2000.00, 4000.00);
        //Infinite loop loops until command "exit" is entered
        while(true){
            //User is prompted to either enter one of the following commands below
            //which will keep looping until "exit" is entered
            System.out.println("What would you like do to?");
            System.out.println("(Deposit/Withdraw/Transfer/Check Balance/Calculate Interest/Exit)");
            command = input.nextLine();
            //If command "deposit" is entered, user will be prompted to enter which
            //account they wish to deposit in, and how much, then the deposit method
            //from the bank class is called
            if(command.equalsIgnoreCase("Deposit")){
                System.out.println("Which account do you wish to deposit in?");
                account = input.next();
                System.out.println("How much do you wish to deposit?");
                cash = input.nextDouble();
                justinBank.deposit(cash, account);
                input.nextLine();
            }
            //If command "withdraw" is entered, user will be prompted to enter which
            //account they wish to withdraw from, and how much, then the withdraw method
            //from the bank class is called
            else if(command.equalsIgnoreCase("Withdraw")){
                System.out.println("Which account do you wish to withdraw from?");
                account = input.next();
                System.out.println("How much do you wish to withdraw?");
                cash = input.nextDouble();
                justinBank.withdraw(cash, account);
                input.nextLine();
            }
            //If command "Transfer" is entered, user will be prompted to enter which
            //account they wish to transfer to, and how much, then the transfer method
            //from the bank class is called
            else if(command.equalsIgnoreCase("Transfer")){
                System.out.println("Which account do you wish to transfer to?");
                account = input.next();
                System.out.println("How much do you wish to transfer?");
                cash = input.nextDouble();
                justinBank.transfer(cash, account);
                input.nextLine();
            }
            //If command "check balance" is entered, the printBalances method is called
            //from the bank class
            else if(command.equalsIgnoreCase("Check Balance")){
                justinBank.printBalances();
            }
            //If command "calculate interest" is entered, user will be prompted 
            //to enter which account they wish to calculate, and the rate, and  
            //finally, the number of years, then the calculateInterest method from 
            //the bank class is called
            else if(command.equalsIgnoreCase("Calculate Interest")){
                System.out.println("Which account do you wish to calculate?");
                account = input.next();
                System.out.println("What is the rate?");
                double rate = input.nextDouble();
                System.out.println("What is the number of years?");
                double years = input.nextDouble();
                justinBank.calculateInterest(rate, years, account);
                input.nextLine();
            }
            //If command "Exit" is entered, loop will break
            else if(command.equalsIgnoreCase("Exit")){
                break;
            }
            //If anything else is entered, user will be re-prompted to enter again
            else{
                System.out.println("Invalid command!");
            } 
        } 
        //Exit message is here
        System.out.println("Thank you for using your banking program!");
    }
}
