package com.hillel.ostapenko_kateryna.final_project.views;

import com.hillel.ostapenko_kateryna.final_project.models.Product;
import com.hillel.ostapenko_kateryna.final_project.utils.Validator;

import java.util.Scanner;

// View
public class SalesView {
    private final Product model;
    String title;
    String orange;
    int quantity;
    double price;
    Scanner scanner;

    public SalesView( Product model) {
        this.model = model;
    }
    public void getInputs() {
        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.println(title);
        model.setName(Validator.validateName(scanner));


        title = "Введите количество: ";
        System.out.println(title);
        model.setQuantity(Validator.validateQuantityInput(scanner));


        title = "Введите цену: ";
        System.out.println(title);
        model.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

