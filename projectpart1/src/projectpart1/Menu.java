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

public class Menu implements Items{
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
    int i=type_menuitems.lastIndexOf(type);
    menuitems.add(i+1,item);    
    price_menuitems.add(i+1,price);
    type_menuitems.add(i+1,type);
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
      System.out.println("Dishs");
      for(int i=0 ; i< menuitems.size() ; i++  ){
        if(type_menuitems.get(i)=="drink"&&type_menuitems.get(i-1)!="drink")
          System.out.println("Drinks");
      System.out.println("\t"+menuitems.get(i)+"\t"+ price_menuitems.get(i));
     }}   
    
    @Override
    public void changeprice(String item, double new_price){
    price_menuitems.set(menuitems.indexOf(item), new_price);
    }   
    
    public double getprice (String item){
    int i=menuitems.indexOf(item);
    return price_menuitems.get(i);
    
    }
    
}
