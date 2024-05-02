/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;
import static java.lang.Math.ceil;
import java.util.ArrayList;
import java.util.Collections;


public class Receptionist extends Stuff implements  TableCanReserve{
     ArrayList<String> tabLi;
        
    private int tableId ;
      int flag=0;
    
  // tab.setTab_status(tabLi);
    public Receptionist(int NoTable) {
        this.tabLi = new ArrayList<>(Collections.nCopies( NoTable, "empty"));
    
    }
    public Receptionist(int salary, String roles, int dayoff, int NoTable ) {
        super(salary, roles, dayoff);
        this.tabLi = new ArrayList<>(Collections.nCopies( NoTable, "empty"));
    }
    
    // to reserve any table 
     public int reserve (int no_of_people){
         this.TableCanReserve(no_of_people);
         if (tabLi.contains("empty")){
        
     //System.out.println(" table");
      
         // System.out.println("table"+(tabLi.indexOf("empty")+1));
          tableId = tabLi.indexOf("empty")+1;
          tabLi.set(tabLi.indexOf("empty"), "occupied") ;
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
    
 public void displaytab(){ 
      for(int i=0 ; i< tabLi.size() ; i++  ){    
      System.out.println("\t"+tabLi.get(i));
     }}  
    
 public void removeReserve(int NoTable)
 { tabLi.set(NoTable-1,"empty");
  }
 public void TableCanReserve(int no_of_people)
 {   flag =0;
 for(int i= 0; i<tabLi.size();i++){
    if(tabLi.get(i).equals("empty"))
    flag++;   
 }
 if (flag ==0){
     System.out.println("you can't make order");
        
 }
 else {
     System.out.println("you can make order");
      
 }
}
}