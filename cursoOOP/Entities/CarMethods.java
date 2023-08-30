package org.example.sumary.cursoOOP.Entities;

public class CarMethods {
    private String car_brand,model,license_plate;
    private float price,consumption,insurance;
    public void CarStringThings(String car_brand, String model){
        this.car_brand = car_brand;
        this.model = model;

    }
    public void CarFloatThings(float price, float consumption, float insurance){
        this.price = price;
        this.consumption = consumption;
        this.insurance = insurance;
    }
    public String getCar_brand() {
        return car_brand;
    }

    public String getModel(){return model;}
    public String getLicense_plate() {
        return license_plate;
    }

    public float getConsumption() {
        return consumption;
    }

    public float getInsurance() {
        return insurance;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }
    public void setModel(String model){this.model = model;}
    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}


