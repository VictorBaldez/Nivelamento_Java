package org.example.sumary.ProjetoOOP.Programs;
import org.example.sumary.ProjetoOOP.Entities.CarMethods;
import org.example.sumary.ProjetoOOP.Entities.CarOptions;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        CarOptions dealership = new CarOptions();
        System.out.println("This is a Premium Automotive Dealership, what brand do are you looking for?.\n ");
        dealership.BrandList();
        CarMethods user = new CarMethods();
        user.setCar_brand(input.nextLine());
        dealership.brandModels(user.getCar_brand());
        user.setModel(input.nextLine());
        dealership.modelsInfo(user.getModel());

    }
}
