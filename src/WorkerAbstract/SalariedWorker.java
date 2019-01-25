/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkerAbstract;

import WorkerThing.*;

public class SalariedWorker extends Worker{
    public SalariedWorker(){
    }
    public SalariedWorker(String name, double salaryRate){
        super(name, salaryRate);
    }
    public double calculatePay(){
        return 40 * super.getSalaryRate();
    }
    public String toString(){
        return super.name + ", your total weekly salary is $" + calculatePay();    
    }
}
