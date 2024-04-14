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
    private int tablesNumber=4;
    protected static Tables[] tables ={new Tables("empty") ,new Tables("empty"),new Tables("empty"),new Tables("empty")};
    private Stuff employees;
    //constructor
    public Resturant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Resturant(String name, String address,  Stuff employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.tables = new Tables[tablesNumber];
//        for(int i=0; i<tablesNumber; i++) {
//            tables[i] = new Tables("empty");
//        }
    }

    public String getName() {
        return name;
    }
    //setter and getter
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTablesNumber() {
        return tablesNumber;
    }

    public void setTablesNumber(int tablesNumber) {
        this.tablesNumber = tablesNumber;
    }

    public static Tables[] getTables() {
        return tables;
    }

    public void setTables(Tables[] tables) {
        this.tables = tables;
    }

    public Stuff getEmployees() {
        return employees;
    }

    public void setEmployees(Stuff employees) {
        this.employees = employees;
    }
}
