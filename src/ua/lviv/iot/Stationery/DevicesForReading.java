package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Book;
import ua.lviv.iot.Stationery.Enams.Quality;

public class DevicesForReading extends Stationary {
    private boolean lamp;
    private boolean glasses;
    private Book typeOfBook;

    public DevicesForReading(String typeOfGoods, String manufactureOfGoods, int priceOfGoods, Quality quality, boolean lamp, boolean glasses, Book typeOfBook) {
        super(typeOfGoods,manufactureOfGoods,priceOfGoods, quality);
        this.lamp = lamp;
        this.glasses = glasses;
        this.typeOfBook = typeOfBook;
    }

    public boolean getLamp() {
        return lamp;
    }

    public boolean getGlasses() {
        return glasses;
    }

    public Book getTypeOfBook() {
        return typeOfBook;
    }

    public void setLamp(boolean lamp) {
        this.lamp = lamp;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public void setTypeOfBook(Book typeOfBook) {
        this.typeOfBook = typeOfBook;
    }
}
