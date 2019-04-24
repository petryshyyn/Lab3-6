package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Folder;
import ua.lviv.iot.Stationery.Enams.Quality;


@SuppressWarnings("ALL")
public class StorageAccessories extends Stationary {
    private String materialOfBag;
    private double priceByToolbar;
    private Folder typeOfFolder;

    public StorageAccessories(
            final String typeOfGoodsParam, final String manufactureOfGoodsParam,
            final int priceOfGoodsParam, final Quality qualityOfGoodsParam,
            final String materialOfBagParam, final double priceByToolbarParam,
            final Folder typeOfFolderParam) {
        super(typeOfGoodsParam, manufactureOfGoodsParam,
                priceOfGoodsParam, qualityOfGoodsParam);
        materialOfBag = materialOfBagParam;
        priceByToolbar = priceByToolbarParam;
        typeOfFolder = typeOfFolderParam;
    }

    public final String getMaterialOfBag() {
        return materialOfBag;
    }

    public final double getPriceByToolbar() {
        return priceByToolbar;
    }

    public final Folder getTypeOfFolder() {
        return typeOfFolder;
    }

    public final void setMaterialOfBag(final String materialOfBagParam) {
        this.materialOfBag = materialOfBagParam;
    }

    public final void setPriceByToolbar(final double priceByToolbarParam) {
        this.priceByToolbar = priceByToolbarParam;
    }

    public final void setTypeOfFolder(final Folder typeOfFolderParam) {
        this.typeOfFolder = typeOfFolderParam;
    }
}
