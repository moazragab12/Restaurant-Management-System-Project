/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.example.projectpart1;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;

public abstract class Items implements Comparable<Items> {
       private double price;
    protected static ArrayList<String>menuitems;
    protected static ArrayList<Double>price_menuitems;
    protected static ArrayList<String>type_menuitems;

    public abstract void additem(String type,String item,double price);
    public abstract void removeitem(String item);
    //public abstract  void changeprice(String item, double new_price);
    public abstract double getprice (String item);
    public abstract void search (String item);
    public  double getprice(){
        return price;
    }
    @Override
    public int compareTo(Items item){

        if(this.price>item.price){
            return 1;
        }
        else if(this.price<item.price){
            return -1;
        }
        else{
            return 0;
        }
    }

}


