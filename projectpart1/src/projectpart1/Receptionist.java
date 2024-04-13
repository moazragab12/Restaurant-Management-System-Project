/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 *
 * @author dell
 */
public class Receptionist extends Stuff{
    
    
    Tables t1 =new Tables ("empty" , 2);
    Tables t2 =new Tables ("empty" , 3);
    Tables t3 =new Tables ("empty" , 4);
    Tables t4 =new Tables ("empty" , 5);

    public Receptionist() {
    }

    public Receptionist(int salary, String roles, int dayoff) {
        super(salary, roles, dayoff);
    }
    
    // to reserve any table 
 public void reserve (int no_of_people){
 if ( no_of_people ==2 ||no_of_people ==1)
 {
  t1.reserve_table();
 }
 else if ( no_of_people ==3 ||no_of_people ==2 ||no_of_people ==1)
 {
 t2.reserve_table();
 } 
   else if ( no_of_people ==4 ||no_of_people ==3 ||no_of_people ==2 ||no_of_people ==1)
 {
t3.reserve_table();
 }
  else if ( no_of_people ==5||no_of_people ==4 ||no_of_people ==3 ||no_of_people ==2 ||no_of_people ==1)
 {
 t4.reserve_table();
 }
 }
   // to canncelled reserve or change table status
 public void change_status (int table_no){
 if ( table_no == t1.getTable_no())
 {
  t1.toempty();
 }
 else if ( table_no ==t2.getTable_no())
 {
 t2.toempty();
 } 
   else if ( table_no ==t3.getTable_no())
 {
t3.toempty();
 }
  else if ( table_no ==t4.getTable_no())
 {
 t4.toempty();
 }
 }
 
 
 
}
