/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 * @author dell
 */


/**
 * Represents an employee in the restaurant system, inheriting from the Person class.
 */
public class Stuff extends Person {
    private int salary;
    private int ID = 1;
    private static int count = 1;
    private String roles;
    private int dayoff;

    /**
     * Default constructor for the Stuff class.
     */
    public Stuff() {
        ID = count;
        count++;

    }

    /**
     * Constructs a new employee with the given salary, roles, and days off.
     *
     * @param salary The salary of the employee.
     * @param roles The roles assigned to the employee.
     * @param dayoff The number of days off for the employee.
     */
    public Stuff(int salary, String roles, int dayoff) {
        this.salary = salary;
        this.roles = roles;
        this.dayoff = dayoff;
        ID = count;
        count++;
    }

    /**
     * Constructs a new employee with the given name, address, contact number, salary, roles, and days off.
     *
     * @param name The name of the employee.
     * @param address The address of the employee.
     * @param contactNumber The contact number of the employee.
     * @param salary The salary of the employee.
     * @param roles The roles assigned to the employee.
     * @param dayoff The number of days off for the employee.
     */
    public Stuff(String name, String address, int contactNumber, int salary, String roles, int dayoff) {
        super(name, address, contactNumber);
        this.salary = salary;
        this.roles = roles;
        this.dayoff = dayoff;
        ID = count;
        count++;
    }


    /**
     * Returns the salary of the employee.
     *
     * @return The salary of the employee.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The new salary of the employee.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Returns the ID of the employee.
     *
     * @return The ID of the employee.
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets the ID of the employee.
     *
     * @param ID The new ID of the employee.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Returns the roles of the employee.
     *
     * @return The roles of the employee.
     */
    public String getRoles() {
        return roles;
    }

    /**
     * Sets the roles of the employee.
     *
     * @param roles The new roles of the employee.
     */

    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * Returns the number of days off for the employee.
     *
     * @return The number of days off for the employee.
     */
    public int getDayoff() {
        return dayoff;
    }


    /**
     * Sets the number of days off for the employee.
     *
     * @param dayoff The new number of days off for the employee.
     */
    public void setDayoff(int dayoff) {
        this.dayoff = dayoff;
    }


}
