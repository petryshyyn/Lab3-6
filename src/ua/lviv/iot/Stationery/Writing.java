package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Notebook;
import ua.lviv.iot.Stationery.Enams.Quality;

public class Writing extends Stationary {
    private double priceByPencil;
    private double priceByPen;
    private Notebook typeOfNotebooks;

    public Writing(String typeOfGoods, String manufactureOfGoods, int priceOfGoods, Quality qualityOfGoods, double priceByPencil, double priceByPen, Notebook typeOfNotebooks) {
        super(typeOfGoods,manufactureOfGoods,priceOfGoods, qualityOfGoods);
        this.priceByPencil = priceByPencil;
        this.priceByPen = priceByPen;
        this.typeOfNotebooks = typeOfNotebooks;
    }

    public double getPriceByPencil() {
        return priceByPencil;
    }

    public void setPriceByPencil(double priceByPencil) {
        this.priceByPencil = priceByPencil;
    }

    public double getPriceByPen() {
        return priceByPen;
    }

    public void setPriceByPen(double priceByPen) {
        this.priceByPen = priceByPen;
    }

    public Notebook getTypeOfNotebooks() {
        return typeOfNotebooks;
    }

    public void setTypeOfNotebooks(Notebook typeOfNotebooks) {
        this.typeOfNotebooks = typeOfNotebooks;
    }
}
