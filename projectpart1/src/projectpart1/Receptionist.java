/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

import static projectpart1.Resturant.getTables;

/**
 *
 * @author dell
 */
public class Receptionist extends Stuff{
    
   
   Tables[] tables = getTables();
   int flag = 0 ;
     //constructor
    public Receptionist() {
    }

    public Receptionist(int salary, String roles, int dayoff) {
        super(salary, roles, dayoff);
    }
    
    // to reserve any table 
 public void reserve (int no_of_people){
             flag =0;
      for (int i=0 ;i< 4 ;i++){
          //System.out.println(flag);
             if (flag>=4){
             System.out.println ("sorry rhis table not available");
             break;}
             if (no_of_people <=5) { 
                
                int m=tables[i].reserve_table();
                     if (m> 0){
                        System.out.println ("you reserved table no "+ m );
                        break; }
                     else {  
                        flag++;  
                        } }
            else if (no_of_people <=10  &&  no_of_people >5) {
            //  flag=0;
                    if (flag <=2){
                     int m= tables[i].reserve_table();       
                          if (m ==0){ 
                          flag ++;
                          continue ; }
                    System.out.println ("you reserved  two table no "+ m+"and"+tables[i+1].reserve_table() );
                     break; }
                     else 
                         {
                              System.out.println ("sorry rhis table not available");
                              break; }
             }
        }
    }
   // to canncelled reserve or change table status
 public void change_status (int table_no){
     
      for (int i=0 ;i< 4 ;i++){
      if ( table_no == i+1)
 {
  tables[i].toempty();
  flag--;
 }
 }
 
 
 }
}