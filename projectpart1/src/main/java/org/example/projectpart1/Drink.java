package org.example.projectpart1;

public class Drink extends Items {
    private double price=50;
    private  String name;
   Drink(){
       super.setprice(price);
   }
    Drink(Double price)
    { this.price=price;
        super.setprice(price);
    }
    Drink(Double price ,String name)
    { this(price);
        this.name=name;
    }
    @Override
    public void additem(String type, String item, double price) {

    }

    @Override
    public void removeitem(String item) {

    }

    @Override
    public void changeprice(String item, double new_price) {

    }


    @Override
    public void search(String item) {

    }

    @Override
    public Double getHeighestPrice(Items items) {
        return 0.0;
    }
}
