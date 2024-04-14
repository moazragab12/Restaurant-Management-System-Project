/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Tables {
   private static int count=1;
    private int table_no=1;
    private String table_status;
    private static final int capactiy_table =5;
  
    
    //constructor
    public Tables() {
        table_no=count;
        count++;
    }
    
    
    
    
    
    
//    public Tables(String table_status, int capactiy_table) {
//        this.table_status = table_status;
//        
//         table_no=count;
//        count++;
//    }

    public Tables(String table_status) {
        this.table_status = table_status; 
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
    public int reserve_table(){
     if (this.table_status == "empty" ) 
     {
     this.table_status = "reserved";
    return this.table_no ;
    
     }
     else 
     {
    return 0;
     }
    }
   //change to empty status 
    public void toempty(){
     this.table_status ="empty";
    }
}
