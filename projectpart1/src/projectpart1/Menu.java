/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpart1;

/**
 *
 * @author dell
 */
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
public class Menu extends Items implements Comparable<Menu>{
    protected ArrayList<String>menuitems = new ArrayList<>();
    protected ArrayList<Double>price_menuitems=new ArrayList<>();
    protected ArrayList<String>type_menuitems = new ArrayList<>();

   public Menu() {}

   public Menu(ArrayList<String> type_menuitems,ArrayList<String> menuitems,ArrayList<Double> price_menuitems){
    this.setMenuitems( menuitems);
    this.setPrice_menuitems( price_menuitems);
    this.setType_menuitems(type_menuitems);
    }
    
    
    // setter and getter menuitems  
    public ArrayList<String> getMenuitems() {
        return menuitems;
    }
     private void setMenuitems(ArrayList<String> menuitems) {
        this.menuitems = menuitems;
    }

    
//    setter and getter price_menuitems
    public ArrayList<Double> getPrice_menuitems() {
        return price_menuitems;
    }
    private void setPrice_menuitems(ArrayList<Double> price_menuitems) {
       this.price_menuitems = price_menuitems;
    }   

     
//    setter and getter type_menuitems   
    public ArrayList<String> getType_menuitems() {
        return type_menuitems;
    }
    public void setType_menuitems(ArrayList<String> type_menuitems) {
        this.type_menuitems = type_menuitems;
    }
    
    
 @Override
    public void additem(String type,String item,double price) {
 int lastIndex = type_menuitems.lastIndexOf(type);
 
 int m=0;
    if (lastIndex != -1) {
        for (int i = type_menuitems.indexOf(type); i <= lastIndex; i++) {
            if (type.equals(type_menuitems.get(i)) && item.equals(menuitems.get(i))) {
              if(price_menuitems.get(i)==price){
                 System.out.println("Item already exists in the menu.");
                 m=1;
                return; }// Exit the method if item already exists
              else {this.changeprice(item, price);
              m=1;
              return;}}}}
    if(m==0){
      if(lastIndex == -1) {lastIndex= menuitems.size()-1;}
           menuitems.add(lastIndex+1,item);    
           price_menuitems.add(lastIndex+1,price);
           type_menuitems.add(lastIndex+1,type);
    }
    }  
    

    
    
    

    @Override
    public void removeitem(String item) {
    int i=menuitems.indexOf(item);
    menuitems.remove(item);
    price_menuitems.remove(i);
    type_menuitems.remove(i);
    
    }
    
  
   public void displayMenu(){
   System.out.println("Menu");
   System.out.println(type_menuitems.get(0));
   System.out.println("\t"+menuitems.get(0)+"\t"+ price_menuitems.get(0));
   for(int i=1 ; i< menuitems.size() ; i++  ){
     if ( !((type_menuitems.get(i)).equals(type_menuitems.get(i-1))) ) 
        System.out.println(type_menuitems.get(i)); 
  System.out.println("\t"+menuitems.get(i)+"\t"+ price_menuitems.get(i));
         

}
}   
    
    @Override
    public void changeprice(String item, double new_price){
    price_menuitems.set(menuitems.indexOf(item), new_price);
    }   
    
    
    @Override
    public double getprice (String item){
    int i=menuitems.indexOf(item);
    return price_menuitems.get(i);
    
    }
     
    @Override
    public void search (String item){
        int flag=0;
        for(int i=0 ; i< menuitems.size() ; i++  )
        { if (item.equals(menuitems.get(i)))
            flag=1;
        }
        if(flag==0)
            System.out.println("The menu does not contain this element.");
        else 
            System.out.println("The menu does contain "+item +" and this price " +this.getprice(item) );
             
        
     } 

    @Override
    public int compareTo(Menu other) {
        double price=this.price_menuitems.isEmpty() ? 0 : this.price_menuitems.get(0);
        double otherPrice = other.price_menuitems.isEmpty() ? 0 : other.price_menuitems.get(0);
        // Compare prices
        if (price < otherPrice) {
            return -1;
        } else if (price > otherPrice) {
            return 1;
        } else {
            return 0;
        }
    }



    void Sortprice( Menu o ) {
        Menu x = new Menu();
        x.menuitems.addAll(o.menuitems);
        x.price_menuitems.addAll(o.price_menuitems);
        x.type_menuitems.addAll(o.type_menuitems);
        Collections.sort(o.price_menuitems); 
        for(int i=0;i<o.price_menuitems.size();i++){
            int index= x.price_menuitems.indexOf(o.price_menuitems.get(i));
            System.out.println(type_menuitems.get(index)+"\t"+menuitems.get(index)+"\t"+price_menuitems.get(i));
        }
    }

  
}
