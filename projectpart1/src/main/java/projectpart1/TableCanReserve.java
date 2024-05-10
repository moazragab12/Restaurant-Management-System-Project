/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 * This package contains classes related to  console Testing.
 */
package projectpart1;

/**
 *
 * @author dell
 */

/**
 * An interface representing tables that can be reserved.
 * This interface provides a method for reserving tables based on the number of people.
 */
public interface TableCanReserve {
    // Maximum number of tables that can be reserved
   static final  int maxNoOfTables = 25;
    /**
     * Reserves a table based on the number of people.
     *
     * @param no_of_people The number of people for whom the table is being reserved.
     */
  void  TableCanReserve(int no_of_people) ;
   
}
