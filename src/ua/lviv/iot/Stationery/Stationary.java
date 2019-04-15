package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Quality;

public class Stationary {

    private String typeOfGoods;
    private String manufactureOfGoods;
    private int priceOfGoods;
    private Quality qualityOfGoods;

    public Stationary(){

    }

    public Stationary(String typeOfGoods, String manufactureOfGoods, int priceOfGoods, Quality qualityOfGoods) {
        this.typeOfGoods = typeOfGoods;
        this.manufactureOfGoods = manufactureOfGoods;
        this.priceOfGoods = priceOfGoods;
        this.qualityOfGoods = qualityOfGoods;
    }

    public String toString() {
        return String.format("Type of goods : %s\nManufacture of goods : %s\nPrice of Goods : %s\n", typeOfGoods, manufactureOfGoods, priceOfGoods);
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public String getManufactureOfGoods() {
        return manufactureOfGoods;
    }

    public int getPriceOfGoods() {
        return priceOfGoods;
    }

    public Quality getQualityOfGoods(){
        return qualityOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    public void setManufactureOfGoods(String manufactureOfGoods) {
        this.manufactureOfGoods = manufactureOfGoods;
    }

    public void setPriceOfGoods (int priceOfGoods) {
        this.priceOfGoods = priceOfGoods;
    }

    public void setQualityOfGoods (Quality qualityOfGoods){
        this.qualityOfGoods = qualityOfGoods;
    }
}
