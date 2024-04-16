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

public interface Items {
   

    public abstract void additem(String type,String item,double price);
    public abstract void removeitem(String item);
    public void changeprice(String item, double new_price);
    public double getprice (String item);
    public void search (String item);
}


