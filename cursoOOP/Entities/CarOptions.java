package org.example.sumary.cursoOOP.Entities;
import org.apache.commons.lang3.text.WordUtils;
import java.util.*;


public class CarOptions {
    private Map<String, String[]> brandToModels = new HashMap<>();
    private Map<String, Float> modelToPrice = new HashMap<>();
    private Map<String, Float> modelToConsumption = new HashMap<>();
    private Map<String, Float> modelToInsurance = new HashMap<>();

    private String[] brands = {
            "|FERRARI|", "|MERCEDES|", "|FORD|", "|PORSCHE|", "|BMW|",
            "|AUDI|", "|TOYOTA|", "|CHEVROLET|", "|HONDA|", "|NISSAN|",
            "|VOLKSWAGEN|", "|MAZDA|", "|SUBARU|", "|LAMBORGHINI|", "|JAGUAR|"
    };
    public CarOptions() {
        // Inicializando o mapa com as marcas modelos correspondentes e informações
        //Models
        brandToModels.put("|Ferrari|", new String[]{"812 Superfast", "Portofino", "GTC4Lusso"});
        brandToModels.put("|Mercedes|", new String[]{"AMG GT", "C-Class", "GLE"});
        brandToModels.put("|Ford|", new String[]{"Mustang", "Focus", "Explorer"});
        brandToModels.put("|Porsche|", new String[]{"911", "Cayenne", "Panamera"});
        brandToModels.put("|Bmw|", new String[]{"M4", "3 Series", "X5"});
        brandToModels.put("|Audi|", new String[]{"R8", "A4", "Q5"});
        brandToModels.put("|Toyota|", new String[]{"Supra", "Camry", "Rav4"});
        brandToModels.put("|Chevrolet|", new String[]{"Camaro", "Malibu", "Suburban"});
        brandToModels.put("|Honda|", new String[]{"Civic Type R", "Accord", "CR-V"});
        brandToModels.put("|Nissan|", new String[]{"GT-R", "Maxima", "Murano"});
        brandToModels.put("|Volkswagen|", new String[]{"Golf GTI", "Passat", "Tiguan"});
        brandToModels.put("|Mazda|", new String[]{"MX-5 Miata", "Mazda3", "CX-5"});
        brandToModels.put("|Subaru|", new String[]{"WRX STI", "Legacy", "Outback"});
        brandToModels.put("|Lamborghini|", new String[]{"Aventador", "Urus", "Huracan"});
        brandToModels.put("|Jaguar|", new String[]{"F-Type", "XJ", "F-Pace"});
        //Price
        modelToPrice.put("812 SUPERFAST", 350000.0f);
        modelToPrice.put("PORTOFINO", 250000.0f);
        modelToPrice.put("GTC4LUSSO", 300000.0f);
        modelToPrice.put("AMG GT", 300000.0f);
        modelToPrice.put("C-CLASS", 60000.0f);
        modelToPrice.put("GLE", 70000.0f);
        modelToPrice.put("MUSTANG", 40000.0f);
        modelToPrice.put("FOCUS", 25000.0f);
        modelToPrice.put("EXPLORER", 35000.0f);
        modelToPrice.put("911", 150000.0f);
        modelToPrice.put("CAYENNE", 80000.0f);
        modelToPrice.put("PANAMERA", 100000.0f);
        modelToPrice.put("M4", 60000.0f);
        modelToPrice.put("3 SERIES", 45000.0f);
        modelToPrice.put("X5", 70000.0f);
        modelToPrice.put("R8", 200000.0f);
        modelToPrice.put("A4", 40000.0f);
        modelToPrice.put("Q5", 50000.0f);
        modelToPrice.put("SUPRA", 60000.0f);
        modelToPrice.put("CAMRY", 30000.0f);
        modelToPrice.put("RAV4", 35000.0f);
        modelToPrice.put("CAMARO", 40000.0f);
        modelToPrice.put("MALIBU", 30000.0f);
        modelToPrice.put("SUBURBAN", 50000.0f);
        modelToPrice.put("CIVIC TYPE R", 35000.0f);
        modelToPrice.put("ACCORD", 30000.0f);
        modelToPrice.put("CR-V", 28000.0f);
        modelToPrice.put("GT-R", 150000.0f);
        modelToPrice.put("MAXIMA", 35000.0f);
        modelToPrice.put("MURANO", 40000.0f);
        modelToPrice.put("GOLF GTI", 30000.0f);
        modelToPrice.put("PASSAT", 35000.0f);
        modelToPrice.put("TIGUAN", 40000.0f);
        modelToPrice.put("MX-5 MIATA", 25000.0f);
        modelToPrice.put("MAZDA3", 28000.0f);
        modelToPrice.put("CX-5", 32000.0f);
        modelToPrice.put("WRX STI", 35000.0f);
        modelToPrice.put("LEGACY", 30000.0f);
        modelToPrice.put("OUTBACK", 35000.0f);
        modelToPrice.put("AVENTADOR", 500000.0f);
        modelToPrice.put("URUS", 250000.0f);
        modelToPrice.put("HURACAN", 300000.0f);
        modelToPrice.put("F-TYPE", 60000.0f);
        modelToPrice.put("XJ", 80000.0f);
        modelToPrice.put("F-PACE", 55000.0f);
        //Consumption
        modelToConsumption.put("812 SUPERFAST", 8.5f);
        modelToConsumption.put("PORTOFINO", 9.0f);
        modelToConsumption.put("GTC4LUSSO", 10.0f);
        modelToConsumption.put("AMG GT", 10.0f);
        modelToConsumption.put("C-CLASS", 7.0f);
        modelToConsumption.put("GLE", 8.0f);
        modelToConsumption.put("MUSTANG", 12.0f);
        modelToConsumption.put("FOCUS", 9.0f);
        modelToConsumption.put("EXPLORER", 11.0f);
        modelToConsumption.put("911", 10.0f);
        modelToConsumption.put("CAYENNE", 9.0f);
        modelToConsumption.put("PANAMERA", 10.0f);
        modelToConsumption.put("M4", 8.0f);
        modelToConsumption.put("3 SERIES", 7.0f);
        modelToConsumption.put("X5", 9.0f);
        modelToConsumption.put("R8", 11.0f);
        modelToConsumption.put("A4", 6.0f);
        modelToConsumption.put("Q5", 8.0f);
        modelToConsumption.put("SUPRA", 9.0f);
        modelToConsumption.put("CAMRY", 7.0f);
        modelToConsumption.put("RAV4", 8.0f);
        modelToConsumption.put("CAMARO", 10.0f);
        modelToConsumption.put("MALIBU", 7.0f);
        modelToConsumption.put("SUBURBAN", 12.0f);
        modelToConsumption.put("CIVIC TYPE R", 9.0f);
        modelToConsumption.put("ACCORD", 8.0f);
        modelToConsumption.put("CR-V", 7.0f);
        modelToConsumption.put("GT-R", 12.0f);
        modelToConsumption.put("MAXIMA", 9.0f);
        modelToConsumption.put("MURANO", 8.0f);
        modelToConsumption.put("GOLF GTI", 8.0f);
        modelToConsumption.put("PASSAT", 7.0f);
        modelToConsumption.put("TIGUAN", 9.0f);
        modelToConsumption.put("MX-5 MIATA", 6.0f);
        modelToConsumption.put("MAZDA3", 7.0f);
        modelToConsumption.put("CX-5", 8.0f);
        modelToConsumption.put("WRX STI", 10.0f);
        modelToConsumption.put("LEGACY", 9.0f);
        modelToConsumption.put("OUTBACK", 8.0f);
        modelToConsumption.put("AVENTADOR", 16.0f);
        modelToConsumption.put("URUS", 12.0f);
        modelToConsumption.put("HURACAN", 14.0f);
        modelToConsumption.put("F-TYPE", 9.0f);
        modelToConsumption.put("XJ", 10.0f);
        modelToConsumption.put("F-PACE", 8.0f);
        //Insurance ...
        modelToInsurance.put("812 SUPERFAST", 17500.0f);
        modelToInsurance.put("PORTOFINO", 12500.0f);
        modelToInsurance.put("GTC4LUSSO", 15000.0f);
        modelToInsurance.put("AMG GT", 15000.0f);
        modelToInsurance.put("C-CLASS", 3000.0f);
        modelToInsurance.put("GLE", 3500.0f);
        modelToInsurance.put("MUSTANG", 2000.0f);
        modelToInsurance.put("FOCUS", 1250.0f);
        modelToInsurance.put("EXPLORER", 1750.0f);
        modelToInsurance.put("911", 7500.0f);
        modelToInsurance.put("CAYENNE", 4000.0f);
        modelToInsurance.put("PANAMERA", 5000.0f);
        modelToInsurance.put("M4", 3000.0f);
        modelToInsurance.put("3 SERIES", 2250.0f);
        modelToInsurance.put("X5", 3500.0f);
        modelToInsurance.put("R8", 10000.0f);
        modelToInsurance.put("A4", 2000.0f);
        modelToInsurance.put("Q5", 2500.0f);
        modelToInsurance.put("SUPRA", 3000.0f);
        modelToInsurance.put("CAMRY", 1500.0f);
        modelToInsurance.put("RAV4", 1750.0f);
        modelToInsurance.put("CAMARO", 2000.0f);
        modelToInsurance.put("MALIBU", 1500.0f);
        modelToInsurance.put("SUBURBAN", 2500.0f);
        modelToInsurance.put("CIVIC TYPE R", 1750.0f);
        modelToInsurance.put("ACCORD", 1500.0f);
        modelToInsurance.put("CR-V", 1400.0f);
        modelToInsurance.put("GT-R", 7500.0f);
        modelToInsurance.put("MAXIMA", 1750.0f);
        modelToInsurance.put("MURANO", 2000.0f);
        modelToInsurance.put("GOLF GTI", 1500.0f);
        modelToInsurance.put("PASSAT", 1750.0f);
        modelToInsurance.put("TIGUAN", 2000.0f);
        modelToInsurance.put("MX-5 MIATA", 1250.0f);
        modelToInsurance.put("MAZDA3", 1400.0f);
        modelToInsurance.put("CX-5", 1600.0f);
        modelToInsurance.put("WRX STI", 1750.0f);
        modelToInsurance.put("LEGACY", 1500.0f);
        modelToInsurance.put("OUTBACK", 1750.0f);
        modelToInsurance.put("AVENTADOR", 25000.0f);
        modelToInsurance.put("URUS", 12500.0f);
        modelToInsurance.put("HURACAN", 15000.0f);
        modelToInsurance.put("F-TYPE", 3000.0f);
        modelToInsurance.put("XJ", 4000.0f);
        modelToInsurance.put("F-PACE", 2750.0f);
    }
    public void BrandList(){
        List<String> brandList = new ArrayList<>();
        for (String brand : brands) {
            brandList.add(brand);
        }
        brandList.sort(Comparator.comparingInt(String::length));

        System.out.println("Car brands:");
        for (int i = 0; i < brandList.size(); i += 5) {
            for (int j = i; j < i + 5 && j < brandList.size(); j++) {
                System.out.printf("%-15s", brandList.get(j));
                String x = brandList.get(j);
            }
            System.out.println();
        }
    }
    public void brandModels(String selectedBrand) {
        String formattedBrand = "|" + WordUtils.capitalize(selectedBrand.toLowerCase()) + "|";
        String[] models = brandToModels.get(formattedBrand);

        if (models != null) {
            System.out.println("Models for " + selectedBrand.toUpperCase() + ":");
            for (String model : models) {
                System.out.printf("%-10s||\n",model);
            }
        } else {
            System.err.println("No models found for " + selectedBrand);
        }
    }
    public void modelsInfo(String selectedModel) {
        String formattedModel = selectedModel.toUpperCase(); // Convert to uppercase
        Float modelPrice = modelToPrice.get(formattedModel);
        Float modelConsumption = modelToConsumption.get(formattedModel);
        Float modelInsurance = modelToInsurance.get(formattedModel);

        if (modelPrice != null) {
            System.out.println("Model information for " + formattedModel + ":");
            System.out.printf("Price: USD %.2f\n", modelPrice);
            System.out.printf("Consumption: %.2f Km/l\n", modelConsumption);
            System.out.printf("Insurance value monthly: USD %.2f\n", modelInsurance);
        } else {
            System.err.println("No information found for " + formattedModel);
        }
    }
}
