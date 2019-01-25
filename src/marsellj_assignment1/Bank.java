package marsellj_assignment1;
/*
 * Name:  Justin Marsella
 * Assignment:  Assignment 1 Question 2
 * Program: Computer Programmer

 * This is the Bank class that is instantiated into the main class that is used 
 * to configure you two bank accounts however you want.
 */
public class Bank {
    /*
    * Necessary instance variables are declared here
    */
    Account c;
    Account s;
    /*
    * Default constructor is defined here, passing in default values to the
    * instantiated chequing and savings account objects
    */
    public Bank(){
        this.c = new Account(0);
        this.s = new Account(0);
    }
    /*
    * Constructor with set parameters is defined here and instantiating the two
    * account objects here
    */
    public Bank(double cBalance, double sBalance){
        this.c = new Account(cBalance);
        this.s = new Account(sBalance);
    }
    /*
    * This is the method that will deposit the amount entered as a parameter into
    * the account, also entered into the parameter, as long as a valid account is
    * entered
    */
    public void deposit(double amount, String account){
        if(account.equals("s")){
            this.s.deposit(amount);
            System.out.println("Deposited $" + amount + " into savings account.");
        }
        else if(account.equals("c")){
            this.c.deposit(amount);
            System.out.println("Deposited $" + amount + " into chequing account.");
        }
        else{
            System.out.println("Not valid!");
        }
    }
    /*
    * This is the method that will withdraw the amount entered as a parameter from
    * the account, also entered into the parameter, as long as a valid account is
    * entered
    */
    public void withdraw(double amount, String account){
        if(account.equals("s")){
            this.s.withdraw(amount);
            System.out.println("Withdrew $" + amount + " into savings account.");
        }
        else if(account.equals("c")){
            this.c.withdraw(amount);
            System.out.println("Withdrew $" + amount + " into chequing account.");
        }
        else{
            System.out.println("Not valid!");
        }
    }
    /*
    * This is the method that will transfer the amount entered as a parameter into
    * the account, also entered into the parameter, from the other account, as long 
    * as a valid account is entered
    */
    public void transfer(double amount, String account){
        if(account.equals("s")){
            this.c.withdraw(amount);
            this.s.deposit(amount);
            System.out.println("Transfered $" + amount + " from chequing to savings account.");
        }
        else if(account.equals("c")){
            this.s.withdraw(amount);
            this.c.deposit(amount);
            System.out.println("Transfered $" + amount + " from savings to chequing account.");
        }
        else{
            System.out.println("Not valid!");
        }
    }
    /*
    * This is the method that will print the current balances of both accounts
    */
    public void printBalances(){
        System.out.println("Current savings balance: $" + this.s.getBalance());
        System.out.println("Current chequing balance: $" + this.c.getBalance());
    }
    /*
    * This is the method that will calculate the interest of the account entered
    * in as a parameter and take the rate and years also entered in as parameters,
    * and calculate the interest
    */
    public void calculateInterest(double rate, double years, String account){
        if(account.equals("s")){
            this.s.setRate(rate);
            this.s.setYears(years);
            System.out.println("Current interest for savings account is $" + this.s.getInterest());
        }
        else if(account.equals("c")){
            this.c.setRate(rate);
            this.c.setYears(years);
            System.out.println("Current interest for chequing account is $" + this.c.getInterest());
        }
        else{
            System.out.println("Not valid!");
        }
    }
}
