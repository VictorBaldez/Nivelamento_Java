package org.example.sumary.cursoOOP.Programs;
import org.example.sumary.cursoOOP.Entities.ShoppingCarItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Comparator;
import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("This is a Premium Automotive Dealership, please select one of our brands.\n ");
        String[] brands = {
                "|Ferrari|", "|Mercedes|", "|Ford|", "|Porsche|", "|BMW|",
                "|Audi|", "|Toyota|", "|Chevrolet|", "|Honda|", "|Nissan|",
                "|Volkswagen|", "|Mazda|", "|Subaru|", "|Lamborghini|", "|Jaguar|"
        };
        List<String> brandList = new ArrayList<>();
        for (String brand : brands) {
            brandList.add(brand);
        }
        brandList.sort(Comparator.comparingInt(String::length));

        System.out.println("Car brands:");
        for (int i = 0; i < brandList.size(); i += 5) {
            for (int j = i; j < i + 5 && j < brandList.size(); j++) {
                System.out.printf("%-15s", brandList.get(j));
            }
            System.out.println();

        }
        ShoppingCarItem user = new ShoppingCarItem();
        String userBrand = input.nextLine();
        user.setcarBrand(userBrand);
        System.out.println(user.getcarBrand());
    }
}
