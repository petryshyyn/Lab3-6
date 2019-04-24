package ua.lviv.iot.StationeryManager;

import ua.lviv.iot.Stationery.Enams.Quality;
import ua.lviv.iot.Stationery.Enams.Notebook;
import ua.lviv.iot.Stationery.Enams.Book;
import ua.lviv.iot.Stationery.Enams.Folder;
import ua.lviv.iot.Stationery.Stationary;
import ua.lviv.iot.Stationery.Writing;
import ua.lviv.iot.Stationery.StorageAccessories;
import ua.lviv.iot.Stationery.DevicesForReading;
import ua.lviv.iot.StationeryManager.StationeryManagerImpl;

import java.util.List;
import java.util.ArrayList;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {

        StationeryManagerImpl manager = new StationeryManagerImpl();
        List<Stationary> list = new ArrayList<>();

        Stationary devicesForReading = new DevicesForReading(
                "Linz", "Mizar", 200, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR);

        Stationary storageAccessories = new StorageAccessories(
                "Box", "Optima", 180,
                Quality.GOOD, "Cardboard", 30.5d,
                Folder.COLOR);

        Stationary writing = new Writing(
                "Pen", "Cabinet", 100, Quality.BEST,
                20.5d, 10.5d, Notebook.BRAND);

        list.add(devicesForReading);
        list.add(writing);
        list.add(storageAccessories);

        manager.addStationary(new DevicesForReading(
                "Linz", "Mizar", 200, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR));

        manager.addStationary(new StorageAccessories(
                "Box", "Optima", 180,
                Quality.GOOD, "Cardboard", 30.5d,
                Folder.COLOR));

        manager.addStationary(new Writing(
                "Pen", "Cabinet", 100, Quality.BEST,
                20.5d, 10.5d, Notebook.BRAND));

        manager.sortByPrice(list, true);
        manager.sortByPrice(list, false);
        manager.sortByType(list, true);
        manager.sortByType(list, false);
        System.out.println("\n\n");
        System.out.println(manager.findForSchoolChildren(Quality.NORMAL));
        System.out.println("\n" + manager.findForSeniorPupil(Quality.GOOD));
        System.out.println("\n" + manager.findForStudent(Quality.BEST));
    }
}
