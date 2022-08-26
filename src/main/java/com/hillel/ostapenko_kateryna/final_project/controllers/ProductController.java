package com.hillel.ostapenko_kateryna.final_project.controllers;

import com.hillel.ostapenko_kateryna.final_project.models.Product;
import com.hillel.ostapenko_kateryna.final_project.views.SalesView;
public class ProductController {
    Product model;
    SalesView view;
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();


        String output = ("Наименование товара: " + model.getName() + "\n" +
                "Общий доход (грн.): " + model.incomeCalculation() + "\n" +
                "Сумма налога (грн.): " + model.getIncomeTaxCalculation() + "\n" +
                "Чистый доход (грн.): " + model.netIncomeCalculation());

        view.getOutput(output);
    }
}


