package com.hillel.ostapenko_kateryna.final_project.models;

import com.hillel.ostapenko_kateryna.final_project.base.Fiscal;
import com.hillel.ostapenko_kateryna.final_project.base.Income;

public class Product implements Income, Fiscal {
    private final double tax_percent = 5;
    private String name;
    private int quantity;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax_percent() {
        return tax_percent;
    }


    @Override
    public double incomeCalculation() {
        return quantity * price;
    }

    @Override
    public double netIncomeCalculation() {
        return incomeCalculation() * (100 - tax_percent) * 0.01;

    }

    @Override
    public double getIncomeTaxCalculation() {
        return incomeCalculation() * tax_percent * 0.01;
    }

}
