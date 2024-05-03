/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 *
 * @author dell
 */
public class Resturant {
   
    private String name;
    private String address;
    public static int tablesNumber;
   // private Tables[] tables;
    private Stuff employees;

    public Resturant(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public Resturant(String name, String address,int tablesNumber) {
        this.name = name;
        this.address = address;
        this.tablesNumber = tablesNumber;
    }

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getTablesNumber() {
        return tablesNumber;
    }

    protected void setTablesNumber(int tablesNumber) {
        this.tablesNumber = tablesNumber;
    }



    public Stuff getEmployees() {
        return employees;
    }

    public void setEmployees(Stuff employees) {
        this.employees = employees;
    }
}

