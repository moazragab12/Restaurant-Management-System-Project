/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 *
 * @author dell
 */
public class Stuff {
   private int salary ;
   private int ID=1;
   private static int count=1;
   private String roles;
   private int dayoff;

    public Stuff() {
        ID=count;
        count++;
      
    }

    public Stuff(int salary, String roles, int dayoff) {
        this.salary = salary;
        this.roles = roles;
        this.dayoff = dayoff;
       ID=count;
        count++;
    }
    
    
    //getter and setter
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public int getDayoff() {
        return dayoff;
    }

    public void setDayoff(int dayoff) {
        this.dayoff = dayoff;
    }
     
    
    
}
