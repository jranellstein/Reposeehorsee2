/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;
public class Employee extends Person{
    public Employee(){
        this("(02) Invoke Enployees overloaded constructor");
        System.out.println("(03) Employee's no-arg constructor is invoked");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
