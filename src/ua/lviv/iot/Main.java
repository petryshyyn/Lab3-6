package ua.lviv.iot;

import ua.lviv.iot.Stationery.Stationary;
import ua.lviv.iot.Stationery.DevicesForReading;
import ua.lviv.iot.Stationery.StorageAccessories;
import ua.lviv.iot.Stationery.Writing;
import ua.lviv.iot.StationeryManager.StationeryManagerImpl;
import ua.lviv.iot.Stationery.Enams.Quality;
import ua.lviv.iot.Stationery.Enams.Folder;
import ua.lviv.iot.Stationery.Enams.Book;
import ua.lviv.iot.Stationery.Enams.Notebook;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StationeryManagerImpl manager = new StationeryManagerImpl();
        List<Stationary> list = new ArrayList<>();

        Stationary devicesForReading = new DevicesForReading(
                "linz","Mizar", 200, Quality.NORMAL, true, false, Book.PUBLICATIONS_YEAR);

        Stationary storageAccessories = new StorageAccessories(
                "Box", "Optima", 180, Quality.GOOD, "Cardboard", 30, Folder.COLOR);

        Stationary writing = new Writing(
                "Pen", "Cabinet", 100,Quality.BEST, 20, 10, Notebook.BRAND);

        list.add(devicesForReading);
        list.add(writing);
        list.add(storageAccessories);

        manager.sortByPrice(list, true);
        manager.sortByPrice(list, false);
        manager.sortByType(list, true);
        manager.sortByType(list, false);

        System.out.println(manager.findForSchoolChildren(Quality.NORMAL));
        System.out.println(manager.findForSeniorPupil(Quality.GOOD));
        System.out.println(manager.findForStudent(Quality.BEST));
    }
}
