package WorkerAbstract;
import WorkerThing.*;
import java.util.Scanner;
public class WorkerTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What type of worker are you?");
        String worker = input.next();
        if(worker.equalsIgnoreCase("Hourly")){
            System.out.println("Whats your Name?");
            String name = input.next();
            System.out.println("Whats your pay?");
            double pay = input.nextDouble();
            System.out.println("How many hours you work?");
            int hours = input.nextInt();
            m(new HourlyWorker(name, pay, hours));
        }
        else if(worker.equalsIgnoreCase("Salaried")){
            System.out.println("Whats your Name?");
            String name = input.next();
            System.out.println("Whats your pay?");
            double pay = input.nextDouble();
            m(new SalariedWorker(name, pay));
        }
        else{
            System.out.println("Not Valid!");
        }
    }
    public static void m(Worker x){
        System.out.println(x.toString());
    }
}
