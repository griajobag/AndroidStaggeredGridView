package com.putuguna.staggeredgridview;

/**
 * Created by putuguna on 31/01/17.
 */

public class CarModel {

    private int carImage;
    private String carName;
    private String carPrice;
    private int carQty;
    private String carAvailable;

    public CarModel(int carImage, String carName, String carPrice, int carQty, String carAvailable) {
        this.carImage = carImage;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carQty = carQty;
        this.carAvailable = carAvailable;
    }

    public CarModel() {
    }

    public int getCarImage() {
        return carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarQty() {
        return carQty;
    }

    public void setCarQty(int carQty) {
        this.carQty = carQty;
    }

    public String getCarAvailable() {
        return carAvailable;
    }

    public void setCarAvailable(String carAvailable) {
        this.carAvailable = carAvailable;
    }
}
