/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 *
 * @author dell
 */
public class Tables {
   private static int count=1;
    private int table_no=1;
    private String table_status;
    private int capactiy_table ;
    //constructor
    public Tables() {
        table_no=count;
        count++;
    }
    public Tables(String table_status, int capactiy_table) {
        this.table_status = table_status;
        this.capactiy_table = capactiy_table;
         table_no=count;
        count++;
    }
    //setter and getter
    public int getTable_no() {
        return table_no;
    }
    public String getTable_status() {
        return table_status;
    }
    public int getCapactiy_table() {
        return capactiy_table;
    }
    
    //reserved method
    public void reserve_table(){
     if (this.table_status =="empty" ) 
     {
     this.table_status = "reserved";
    System.out.println ("you reserved table no "+ this.table_no );
    
     }
     else 
     {
     System.out.println ("sorry rhis table not available");
     
     }
     
    
    }
   //change to empty status 
    public void toempty(){
     this.table_status ="empty";
    }
    
    
}
