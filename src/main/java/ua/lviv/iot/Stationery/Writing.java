package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Notebook;
import ua.lviv.iot.Stationery.Enams.Quality;

public class Writing extends Stationary {
    private double priceByPencil;
    private double priceByPen;
    private Notebook typeOfNotebooks;

    public Writing(
            final String typeOfGoodsParam, final String manufactureOfGoodsParam,
            final int priceOfGoodsParam, final Quality qualityOfGoodsParam,
            final double priceByPencilParam, final double priceByPenParam,
            final Notebook typeOfNotebooksParam) {
        super(typeOfGoodsParam, manufactureOfGoodsParam,
                priceOfGoodsParam, qualityOfGoodsParam);
        priceByPencil = priceByPencilParam;
        priceByPen = priceByPenParam;
        typeOfNotebooks = typeOfNotebooksParam;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "Price by pencil, " + "Price by pen, " + "Type of notebooks";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.getPriceByPencil() + ", " + this.getPriceByPen() + ", " + this.getTypeOfNotebooks();
    }

    public final double getPriceByPencil() {
        return priceByPencil;
    }

    public final void setPriceByPencil(final double priceByPencilParam) {
        priceByPencil = priceByPencilParam;
    }

    public final double getPriceByPen() {
        return priceByPen;
    }

    public final void setPriceByPen(final double priceByPenParam) {
        priceByPen = priceByPenParam;
    }

    public final Notebook getTypeOfNotebooks() {
        return typeOfNotebooks;
    }

    public final void setTypeOfNotebooks(final Notebook typeOfNotebooksParam) {
        typeOfNotebooks = typeOfNotebooksParam;
    }
}
