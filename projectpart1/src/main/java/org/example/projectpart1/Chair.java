package org.example.projectpart1;

import org.jetbrains.annotations.NotNull;

public  class Chair extends Items {
  double price=300;


    Chair()
  {
      super.setprice(price);
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
