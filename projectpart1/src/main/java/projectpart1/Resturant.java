/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 * @author dell
 */
public class Resturant {

    private String name;
    private String address;
    public static int tablesNumber;
    // private Tables[] tables;
    private Stuff employees;

    /**
     * Constructs a new restaurant with the given name and address.
     *
     * @param name    The name of the restaurant.
     * @param address The address of the restaurant.
     */
    public Resturant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Constructs a new restaurant with the given name, address, and number of tables.
     *
     * @param name         The name of the restaurant.
     * @param address      The address of the restaurant.
     * @param tablesNumber The number of tables in the restaurant.
     */
    public Resturant(String name, String address, int tablesNumber) {
        this.name = name;
        this.address = address;
        this.tablesNumber = tablesNumber;
    }

    /**
     * Constructs a new restaurant with the given name, address, number of tables, and employees.
     *
     * @param name         The name of the restaurant.
     * @param address      The address of the restaurant.
     * @param tablesNumber The number of tables in the restaurant.
     * @param employees    The employees working in the restaurant.
     */
    public Resturant(String name, String address, int tablesNumber, Stuff employees) {
        this.name = name;
        this.address = address;
        this.tablesNumber = tablesNumber;
        this.employees = employees;

    }

//    public Resturant(String name, String address, int tablesNumber,  Stuff employees) {
//        this(name, address);
//        if(employees!=null)
//            this.employees = employees;
//        else System.out.println("Employees is Null");
//
//        if(tablesNumber<0) System.out.println("Invalid Number of Tables, enter Positive number");
//        else {
//            this.tables = new Tables[tablesNumber];
//            for(int i=0; i<tablesNumber; i++) {
//                tables[i] = new Tables("empty");
//            }
//        }

    /**
     * Gets the name of the restaurant.
     *
     * @return The name of the restaurant.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the restaurant.
     *
     * @param name The name of the restaurant.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the restaurant.
     *
     * @return The address of the restaurant.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the restaurant.
     *
     * @param address The address of the restaurant.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the number of tables in the restaurant.
     *
     * @return The number of tables in the restaurant.
     */
    public static int getTablesNumber() {
        return tablesNumber;
    }

    /**
     * Sets the number of tables in the restaurant.
     *
     * @param tablesNumber The number of tables in the restaurant.
     */
    protected void setTablesNumber(int tablesNumber) {
        this.tablesNumber = tablesNumber;
    }


    /**
     * Gets the employees working in the restaurant.
     *
     * @return The employees working in the restaurant.
     */
    public Stuff getEmployees() {
        return employees;
    }

    /**
     * Sets the employees working in the restaurant.
     *
     * @param employees The employees working in the restaurant.
     */
    public void setEmployees(Stuff employees) {
        this.employees = employees;
    }
}

