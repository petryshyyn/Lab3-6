package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Stationery.DevicesForReading;
import ua.lviv.iot.Stationery.Enams.Book;
import ua.lviv.iot.Stationery.Enams.Folder;
import ua.lviv.iot.Stationery.Enams.Notebook;
import ua.lviv.iot.Stationery.Enams.Quality;
import ua.lviv.iot.Stationery.Stationary;
import ua.lviv.iot.Stationery.StorageAccessories;
import ua.lviv.iot.Stationery.Writing;
import ua.lviv.iot.StationeryManager.StationeryManagerImpl;

import java.util.ArrayList;
import java.util.List;

class TestApp {
    private StationeryManagerImpl manager = new StationeryManagerImpl();
    private List<Stationary> list = new ArrayList<>();

    @BeforeEach
    final void addList() {
        manager.addStationary(new DevicesForReading("Linz", "Mizar", 200, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR));
        manager.addStationary(new StorageAccessories("Box", "Optima", 180, Quality.GOOD, "Cardboard", 30.5d, Folder.COLOR));
        manager.addStationary(new Writing("Pen", "Cabinet", 100, Quality.BEST, 20.5d, 10.5d, Notebook.BRAND));
        Stationary devicesForReading = new DevicesForReading("Linz", "Mizar", 200, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR);
        Stationary storageAccessories = new StorageAccessories("Box", "Optima", 180, Quality.GOOD, "Cardboard", 30.5d,
                Folder.COLOR);
        Stationary writing = new Writing("Pen", "Cabinet", 100, Quality.BEST, 20.5d, 10.5d, Notebook.BRAND);
        list.add(devicesForReading);
        list.add(storageAccessories);
        list.add(writing);
    }

    @Test
    @DisplayName("Sort by price test in ascending")
    final void sortByPriceByAscending() {
        manager.sortByPrice(list, true);
        Assertions.assertEquals(100, list.get(0).getPriceOfGoods());
        Assertions.assertEquals(180, list.get(1).getPriceOfGoods());
        Assertions.assertEquals(200, list.get(2).getPriceOfGoods());
    }

    @Test
    @DisplayName("Sort by price test in descending")
    final void sortByPriceByDescending() {
        manager.sortByPrice(list, false);
        Assertions.assertEquals(100, list.get(2).getPriceOfGoods());
        Assertions.assertEquals(180, list.get(1).getPriceOfGoods());
        Assertions.assertEquals(200, list.get(0).getPriceOfGoods());
    }

    @Test
    @DisplayName("Sort by type test in ascending")
    final void sortByTypeAscending() {
        manager.sortByType(list, true);
        Assertions.assertEquals("Box", list.get(0).getTypeOfGoods());
        Assertions.assertEquals("Linz", list.get(1).getTypeOfGoods());
        Assertions.assertEquals("Pen", list.get(2).getTypeOfGoods());
    }

    @Test
    @DisplayName("Sort by type test in descending")
    final void sortByTypeDescending() {
        manager.sortByType(list, false);
        Assertions.assertEquals("Box", list.get(2).getTypeOfGoods());
        Assertions.assertEquals("Linz", list.get(1).getTypeOfGoods());
        Assertions.assertEquals("Pen", list.get(0).getTypeOfGoods());
    }

    @Test
    @DisplayName("Add null element to list of stationary")
    final void testListWithNewNullElement() {
        manager.addStationary(null);
        Assertions.assertEquals(3, list.size());
    }

    @Test
    @DisplayName("Test findForSchoolChildren")
    final void testFindForSchoolChildren() {
        Assertions.assertEquals(list.get(0).getQualityOfGoods(), manager.findForSchoolChildren(Quality.NORMAL).get(0).getQualityOfGoods());
    }

    @Test
    @DisplayName("Test findForSeniorPupil")
    final void testFindForSeniorPupil() {
        Assertions.assertEquals(list.get(1).getQualityOfGoods(), manager.findForSeniorPupil(Quality.GOOD).get(0).getQualityOfGoods());
    }

    @Test
    @DisplayName("Test findForStudent")
    final void testFindForStudent() {
        Assertions.assertEquals(list.get(2).getQualityOfGoods(), manager.findForSeniorPupil(Quality.BEST).get(0).getQualityOfGoods());
    }

    @Test
    @DisplayName("Test Set New List Of Stationary")
    final void testSetNewListOfStationary() {
        list = new ArrayList<>();
        list.add(new DevicesForReading("Linz", "Mizar", 200, Quality.NORMAL, true, false, Book.PUBLICATIONS_YEAR));
        list.add(new StorageAccessories("Box", "Optima", 180, Quality.GOOD, "Cardboard", 30.5d, Folder.COLOR));
        list.add(new Writing("Pen", "Cabinet", 100, Quality.BEST, 20.5d, 10.5d, Notebook.BRAND));
        Assertions.assertEquals(3, list.size());
    }
}
