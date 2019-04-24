package ua.lviv.iot;

import java.util.List;
import java.util.ArrayList;

import ua.lviv.iot.Stationery.Enams.Quality;
import ua.lviv.iot.Stationery.Enams.Notebook;
import ua.lviv.iot.Stationery.Enams.Book;
import ua.lviv.iot.Stationery.Enams.Folder;
import ua.lviv.iot.Stationery.Stationary;
import ua.lviv.iot.Stationery.Writing;
import ua.lviv.iot.Stationery.StorageAccessories;
import ua.lviv.iot.Stationery.DevicesForReading;
import ua.lviv.iot.StationeryManager.StationeryManagerImpl;

@SuppressWarnings("ALL")
public final class Main {

    private Main() {

    }

    public static void main(final String[] args) {

        final int priceOfDevicesForReading = 200;
        final int priceOfStorageAccessories = 180;
        final int priceOfWriting = 100;
        final double priceByToolbar = 30.5d;
        final double priceByPencil = 20.5d;
        final double priceByPen = 10.5d;

        StationeryManagerImpl manager = new StationeryManagerImpl();
        List<Stationary> list = new ArrayList<Stationary>();

        Stationary devicesForReading = new DevicesForReading(
                "linz", "Mizar", priceOfDevicesForReading, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR);

        Stationary storageAccessories = new StorageAccessories(
                "Box", "Optima", priceOfStorageAccessories,
                Quality.GOOD, "Cardboard", priceByToolbar,
                Folder.COLOR);

        Stationary writing = new Writing(
                "Pen", "Cabinet", priceOfWriting, Quality.BEST,
                priceByPencil, priceByPen, Notebook.BRAND);

        list.add(devicesForReading);
        list.add(writing);
        list.add(storageAccessories);

        manager.addStationary(new DevicesForReading(
                "linz", "Mizar", priceOfDevicesForReading, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR));

        manager.addStationary(new StorageAccessories(
                "Box", "Optima", priceOfStorageAccessories,
                Quality.GOOD, "Cardboard", priceByToolbar,
                Folder.COLOR));

        manager.addStationary(new Writing(
                "Pen", "Cabinet", priceOfWriting, Quality.BEST,
                priceByPencil, priceByPen, Notebook.BRAND));

        manager.sortByPrice(list, true);
        manager.sortByPrice(list, false);
        manager.sortByType(list, true);
        manager.sortByType(list, false);

        System.out.println(manager.findForSchoolChildren(Quality.NORMAL));
        System.out.println(manager.findForSeniorPupil(Quality.GOOD));
        System.out.println(manager.findForStudent(Quality.BEST));
    }
}
