package ua.lviv.iot.StationeryManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import ua.lviv.iot.Stationery.Stationary;

public class StationeryWriter {

    public StationeryWriter() {

    }

    public final void writeToFile(final List<Stationary> list, final File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).getHeaders());
                bufferedWriter.newLine();
                bufferedWriter.write(list.get(i).toCSV());
                if (i <= list.size()) {
                    bufferedWriter.newLine();
                }
            }
        }
    }
}
