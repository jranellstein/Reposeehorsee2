package marsellj_assignment1;
/*
 * Name:  Justin Marsella
 * Assignment:  Assignment 1 Question 2
 * Program: Computer Programmer

 * This program is the account class that is instantiated in the bank class twice 
 * as the chequing and savings account that will be used in the main class.
 */
public class Account {
    /*
    * Necessary instance variables are declared here
    */
    double balance;
    double rate;
    double years;
    double total;
    /*
    * Default constructor is defined here
    */
    public Account(){
    }
    /*
    * Constructor with a set parameter is defined here
    */
    public Account(double balance){
        this.balance = balance;
    }
    /*
    * This method returns the current balance to the user, I do not believe
    * both getters and setters for instance variables are necessary because when 
    * I have one, I never need to use the other, I only use one or the other for 
    * all instance variables
    */
    public double getBalance() {
        return this.balance;
    }
    /*
    * This is the method that sets up the rate, necessary for calculating
    * interest
    */
    public void setRate(double rate) {
        this.rate = rate / 100;
    }
    /*
    * This is the method that sets up the year, necessary for calculating
    * interest
    */
    public void setYears(double years) {
        this.years = years;
    }
    /*
    * This is the method that adds the number in the parameter to the balance,
    * it then returns the current balance
    */
    public double deposit(double addNum){
        this.balance += addNum;
        return this.balance;
    }    
    /*
    * This is the method that subtracts the number in the parameter from the 
    * balance, it checks to make sure the number you want to subtract is valid
    * and doesent go into the negative, if it does then a 5 dollar penalty is 
    * set, otherwise it will normally subtract from the balance, it then return 
    * the current balance
    */
    public double withdraw(double wthdNum){
        if(this.balance < wthdNum){
            System.out.println("Insufficient funds!");
            this.balance -= 5;
            if(this.balance < 0){
                this.balance = 0;
            }
        }
        else{
            this.balance -= wthdNum;
        }
        return this.balance;
    }  
    /*
    * This is the method that returns the interest of the current balance
    */
    public double getInterest(){
        return this.balance * this.rate * this.years;
    }
}
