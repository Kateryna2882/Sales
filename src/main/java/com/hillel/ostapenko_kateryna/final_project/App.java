package com.hillel.ostapenko_kateryna.final_project;

import com.hillel.ostapenko_kateryna.final_project.controllers.ProductController;
import com.hillel.ostapenko_kateryna.final_project.models.Product;
import com.hillel.ostapenko_kateryna.final_project.views.SalesView;

public class App {

    public static void main(String[] args) {


        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        controller.runApp();
    }
}
