package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Quality;

@SuppressWarnings("ALL")
public class Stationary {
    private String typeOfGoods;
    private String manufactureOfGoods;
    private int priceOfGoods;
    private Quality qualityOfGoods;

    public Stationary() {

    }

    public Stationary(
            final String typeOfGoodsParam, final String manufactureOfGoodsParam,
            final int priceOfGoodsParam, final Quality qualityOfGoodsParam) {
        typeOfGoods = typeOfGoodsParam;
        manufactureOfGoods = manufactureOfGoodsParam;
        priceOfGoods = priceOfGoodsParam;
        qualityOfGoods = qualityOfGoodsParam;
    }

    public final String toString() {
        return "Type of goods: " + typeOfGoods
                + "\nManufacture of goods : " + manufactureOfGoods
                + "\nPrice of Goods : " + priceOfGoods;
    }

    public final String getTypeOfGoods() {
        return typeOfGoods;
    }

    public final String getManufactureOfGoods() {
        return manufactureOfGoods;
    }

    public final int getPriceOfGoods() {
        return priceOfGoods;
    }

    public final Quality getQualityOfGoods() {
        return qualityOfGoods;
    }

    public final void setTypeOfGoods(final String typeOfGoodsParam) {
        typeOfGoods = typeOfGoodsParam;
    }

    public final void setManufactureOfGoods(
            final String manufactureOfGoodsParam) {
        manufactureOfGoods = manufactureOfGoodsParam;
    }

    public final void setPriceOfGoods(final int priceOfGoodsParam) {
        priceOfGoods = priceOfGoodsParam;
    }

    public final void setQualityOfGoods(final Quality qualityOfGoodsParam) {
        qualityOfGoods = qualityOfGoodsParam;
    }
}

