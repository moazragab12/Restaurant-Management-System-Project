/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;
import static java.lang.Math.ceil;
import java.util.ArrayList;
import java.util.Collections;


public class Receptionist extends Stuff{
     ArrayList<String> tabLi;
        
     
     
     
  // tab.setTab_status(tabLi);
    public Receptionist(int NoTable) {
        this.tabLi = new ArrayList<>(Collections.nCopies( NoTable, "empty"));
    
    }

        int flag=0;
    public Receptionist(int salary, String roles, int dayoff, int NoTable ) {
        super(salary, roles, dayoff);
        this.tabLi = new ArrayList<>(Collections.nCopies( NoTable, "empty"));
    }
    // to reserve any table 
    public void reserve (int no_of_people){
    if (tabLi.contains("empty")){
     //System.out.println(" table");
      if(no_of_people<=5){
          System.out.println("table"+(tabLi.indexOf("empty")+1));
    tabLi.set(tabLi.indexOf("empty"), "occupied") ;
      }
      else{ 
        //  System.out.println(" here");
     for(int i= 0; i<tabLi.size();i++){
    if(tabLi.get(i).equals("empty"))
    {flag++;
   // System.out.println("f"+flag+"i"+i);
    }

   } 
       if(flag<=ceil(no_of_people/5)){
     System.out.println("not fount");
       }
//       flag=0;
//        break;}
       else{
        for(int y=0;y<ceil(no_of_people/5);y++){
             // System.out.println(" here22");
              System.out.println("table"+(tabLi.indexOf("empty")+1));
             tabLi.set(tabLi.indexOf("empty"), "occupied") ;
        }}      
    } flag=0;
    }
    else {
    System.out.println("no table");}
    }
     public void displaytab(){ 
      for(int i=0 ; i< tabLi.size() ; i++  ){    
      System.out.println("\t"+tabLi.get(i));
     }}  
    
 public void removeReserve(int NoTable)
 { tabLi.set(NoTable-1,"empty");
  }
 public void TableCanReserve()
 { for(int i= 0; i<tabLi.size();i++){
    if(tabLi.get(i).equals("empty"))
    { System.out.println("table"+(i+1));
  }
 
}
 }}