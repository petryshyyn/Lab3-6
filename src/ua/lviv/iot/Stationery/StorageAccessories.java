package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Folder;
import ua.lviv.iot.Stationery.Enams.Quality;

public class StorageAccessories extends Stationary {
    private String materialOfBag;
    private double priceByToolbar;
    private Folder typeOfFolder;

    public StorageAccessories(String typeOfGoods, String manufactureOfGoods, int priceOfGoods, Quality qualityOfGoods, String materialOfBag, double priceByToolbar, Folder typeOfFolder) {
        super(typeOfGoods, manufactureOfGoods, priceOfGoods, qualityOfGoods);
        this.materialOfBag = materialOfBag;
        this.priceByToolbar = priceByToolbar;
        this.typeOfFolder = typeOfFolder;
    }

    public String getMaterialOfBag() {
        return materialOfBag;
    }

    public double getPriceByToolbar() {
        return priceByToolbar;
    }

    public Folder getTypeOfFolder() {
        return typeOfFolder;
    }

    public void setMaterialOfBag(String materialOfBag) {
        this.materialOfBag = materialOfBag;
    }

    public void setPriceByToolbar(double priceByToolbar) {
        this.priceByToolbar = priceByToolbar;
    }

    public void setTypeOfFolder(Folder typeOfFolder) {
        this.typeOfFolder = typeOfFolder;
    }
}
