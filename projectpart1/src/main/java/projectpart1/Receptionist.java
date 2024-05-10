/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a receptionist responsible for managing table reservations.
 * <p>
 * This class provides methods to reserve and remove reservations for tables,
 * as well as to check whether the receptionist can reserve a table for a given number of people.
 * </p>
 */
public class Receptionist extends Stuff implements TableCanReserve {
    ArrayList<String> tabLi;

    private int tableId;

    /**
     * Constructs a new Receptionist object with default values.
     */
    public Receptionist() {
    }

    /**
     * Constructs a new Receptionist object with the specified attributes.
     *
     * @param name          The name of the receptionist.
     * @param address       The address of the receptionist.
     * @param contactNumber The contact number of the receptionist.
     * @param salary        The salary of the receptionist.
     * @param roles         The roles of the receptionist.
     * @param dayoff        The number of days off of the receptionist.
     * @param NoTable       The number of tables the receptionist can manage.
     */
    public Receptionist(String name, String address, int contactNumber, int salary, String roles, int dayoff, int NoTable) {
        super(name, address, contactNumber, salary, roles, dayoff);
        this.tabLi = new ArrayList<>(Collections.nCopies(NoTable, "empty"));
    }

    /**
     * Constructs a new Receptionist object with the specified number of tables.
     *
     * @param NoTable The number of tables the receptionist can manage.
     */
    public Receptionist(int NoTable) {
        this.tabLi = new ArrayList<>(Collections.nCopies(NoTable, "empty"));

    }

    /**
     * Constructs a new Receptionist object with the specified salary, roles, day off, and number of tables.
     *
     * @param salary  The salary of the receptionist.
     * @param roles   The roles of the receptionist.
     * @param dayoff  The number of days off of the receptionist.
     * @param NoTable The number of tables the receptionist can manage.
     */
    public Receptionist(int salary, String roles, int dayoff, int NoTable) {
        super(salary, roles, dayoff);
        if (NoTable > 25) {
            System.out.println("Invalid Number of Table ,Sir ");
        } else this.tabLi = new ArrayList<>(Collections.nCopies(NoTable, "empty"));
    }

    /**
     * Reserves a table for the specified number of people.
     *
     * @param no_of_people The number of people for the reservation.
     * @return The ID of the reserved table, or 0 if no table is available.
     */
    public int reserve(int no_of_people) {
        this.TableCanReserve(no_of_people);
        if (tabLi.contains("empty")) {

            //System.out.println(" table");

            // System.out.println("table"+(tabLi.indexOf("empty")+1));
            tableId = tabLi.indexOf("empty") + 1;
            tabLi.set(tabLi.indexOf("empty"), "occupied");
            return tableId;

        }
        return 0;
    }
//    public int reserve (int no_of_people){
//
//
//    if (tabLi.contains("empty")){
//
//     //System.out.println(" table");
//      if(no_of_people<=5){
//         // System.out.println("table"+(tabLi.indexOf("empty")+1));
//          tableId = tabLi.indexOf("empty")+1;
//          tabLi.set(tabLi.indexOf("empty"), "occupied") ;
//          return tableId;
//      }
//      else{
//        //  System.out.println(" here");
//     for(int i= 0; i<tabLi.size();i++){
//    if(tabLi.get(i).equals("empty"))
//    {flag++;
//   // System.out.println("f"+flag+"i"+i);
//    }
//
//   }
//       if(flag<=ceil(no_of_people/5)){
//     System.out.println("not fount");
//       }
////       flag=0;
////        break;}
//       else{
//        for(int y=0;y <ceil(no_of_people/5);y++){
//             // System.out.println(" here22");
//              System.out.println("table"+(tabLi.indexOf("empty")+1));
//             tabLi.set(tabLi.indexOf("empty"), "occupied") ;
//        }}
//    } flag=0;
//    }
//    else {
//    System.out.println("no table");}
//         return 0;
//    }
//

    /**
     * Displays the status of all tables managed by the receptionist.
     */
    public void displaytab() {
        for (int i = 0; i < tabLi.size(); i++) {
            System.out.println("\t" + tabLi.get(i));
        }
    }

    /**
     * Removes the reservation of the specified table.
     *
     * @param NoTable The ID of the table to remove the reservation from.
     */
    public void removeReserve(int NoTable) {
        tabLi.set(NoTable - 1, "empty");
    }

    /**
     * Checks if the receptionist can reserve a table for the specified number of people.
     *
     * @param no_of_people The number of people for the reservation.
     */
    public void TableCanReserve(int no_of_people) {
        int flag = 0;
        for (int i = 0; i < tabLi.size(); i++) {
            if (tabLi.get(i).equals("empty")) flag++;
        }
        if (flag == 0) {
            System.out.println("you can't make order");

        } else {
            System.out.println("you can make order");

        }
    }
}
