/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkerAbstract;

import WorkerThing.*;

public abstract class Worker {
    String name;
    double salaryRate;
    public Worker(){
    }
    public Worker(String name, double salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalaryRate() {
        return salaryRate;
    }
    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
    public abstract double calculatePay();
}
