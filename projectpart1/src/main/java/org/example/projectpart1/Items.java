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

    public abstract void additem(String type,String item,double price);
    public abstract void removeitem(String item);
    public abstract  void changeprice(String item, double new_price);
    public abstract void search (String item);
    public  final double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }
    @Override
    public int compareTo(Items item){

        if(this.getprice()>item.getprice()){
            return 1;
        }
        else if(this.getprice()<item.getprice()){
            return -1;
        }
        else{
            return 0;
        }
    }

    public abstract Double getHeighestPrice(Items items);
}


