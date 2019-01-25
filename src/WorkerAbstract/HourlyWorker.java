/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkerAbstract;

import WorkerThing.*;

public class HourlyWorker extends Worker{
    int hours;
    public HourlyWorker(){
    }
    public HourlyWorker(String name, double salaryRate, int hours){
        super(name, salaryRate);
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public double calculatePay(){
        return this.hours * super.getSalaryRate();
    }
    public String toString(){
        return super.name + ", your total weekly salary is $" + calculatePay();    
    }
}
