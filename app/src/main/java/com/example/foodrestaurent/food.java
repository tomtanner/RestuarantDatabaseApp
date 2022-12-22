package com.example.foodrestaurent;

import android.graphics.Bitmap;


public class food {
    String food_name;
    double food_price;
    int quantity;
    Bitmap bm;
    public food(String food_name, double food_price, int quantity, Bitmap bm){
        this.food_name = food_name;
        this.food_price = food_price;
        this.quantity=quantity;
        this.bm=bm;
    }


    public String getFood_name() {
        return food_name;
    }


    public double getFood_price() {
        return food_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Bitmap getBm() {
        return bm;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public void setFood_price(double food_price) {
        this.food_price = food_price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setBm(Bitmap bm) {
        this.bm = bm;
    }

}
