/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projectpart1;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;

public abstract class Items {
    
    protected ArrayList<String>menuitems;
    protected ArrayList<Double>price_menuitems;
    protected ArrayList<String>type_menuitems;

    public abstract void additem(String type,String item,double price);
    public abstract void removeitem(String item);
    public abstract void changeprice(String item, double new_price);
    public abstract double getprice (String item);
    public abstract void search (String item);
}


