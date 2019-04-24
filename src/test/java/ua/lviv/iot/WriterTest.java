package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
import ua.lviv.iot.StationeryManager.StationeryWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WriterTest {
    private File file = new File("output.csv");
    private StationeryWriter writer = new StationeryWriter();
    private List<Stationary> list = new ArrayList<>();
    private StationeryManagerImpl manager = new StationeryManagerImpl();

    @BeforeEach
     final void setUp(){
        list = new ArrayList<>();

        DevicesForReading devicesForReading = new DevicesForReading(
                "Linz", "Mizar", 200, Quality.NORMAL,
                true, false, Book.PUBLICATIONS_YEAR);
        StorageAccessories storageAccessories = new StorageAccessories(
                "Box", "Optima", 180,
                Quality.GOOD, "Cardboard", 30.5d,
                Folder.COLOR);
        Writing writing = new Writing(
                "Pen", "Cabinet", 100, Quality.BEST,
                20.5d, 10.5d, Notebook.BRAND);

        list.add(devicesForReading);
        list.add(storageAccessories);
        list.add(writing);
    }

    @Test
    final void testWriteToFile() throws IOException {
        writer.writeToFile(list, file);
        Assertions.assertNotEquals(file.length(), 0);
    }
}
