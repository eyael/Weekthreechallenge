package com.company;

public class InvoicecItem {
    private String Name;
    private double price;
    private String quantity;
    private boolean taxable;


    public InvoicecItem() {

    }

    public InvoicecItem(String name, double price, String quantity, boolean taxable) {
        Name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
}



