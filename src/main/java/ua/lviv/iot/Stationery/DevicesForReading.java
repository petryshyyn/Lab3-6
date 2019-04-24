package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Book;
import ua.lviv.iot.Stationery.Enams.Quality;

public class DevicesForReading extends Stationary {

    private boolean lamp;
    private boolean glasses;
    private Book typeOfBook;

    public DevicesForReading(
           final String typeOfGoodsParam, final String manufactureOfGoodsParam,
           final int priceOfGoodsParam, final Quality qualityParam,
           final boolean lampParam, final boolean glassesParam,
           final Book typeOfBookParam) {
        super(typeOfGoodsParam, manufactureOfGoodsParam,
                priceOfGoodsParam, qualityParam);
        lamp = lampParam;
        glasses = glassesParam;
        typeOfBook = typeOfBookParam;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "Lamp, " + "Glasses, " + "Type of book";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.getLamp() + ", " + this.getGlasses() + ", " + this.getTypeOfBook();
    }

    public final boolean getLamp() {
        return lamp;
    }

    public final boolean getGlasses() {
        return glasses;
    }

    public final Book getTypeOfBook() {
        return typeOfBook;
    }

    public final void setLamp(final boolean lampParam) {
        lamp = lampParam;
    }

    public final void setGlasses(final boolean glassesParam) {
        glasses = glassesParam;
    }

    public final void setTypeOfBook(final Book typeOfBookParam) {
        typeOfBook = typeOfBookParam;
    }
}
