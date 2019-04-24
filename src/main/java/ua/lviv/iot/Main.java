package ua.lviv.iot;

import java.io.IOException;

public class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try {
            StringProcessor stringProcessor = new StringProcessor();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stringProcessor.checkingVowel(stringProcessor.readInputText()));
            System.out.print(stringProcessor.showResults(stringBuilder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
