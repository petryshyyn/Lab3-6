package ua.lviv.iot;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class StringProcessor {
    public final String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please type your text: ");
        return br.readLine();
    }

    public final String checkingVowel(final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        final Pattern pattern = Pattern.compile("[aeiou]+", Pattern.CASE_INSENSITIVE);
        String[] outputString = string.split("\\s+");

        for (String i : outputString) {
            String words = pattern.matcher(i).replaceAll("");
            if (words.length() >= (i.length() - words.length())) {
                stringBuilder.append(i).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public final String showResults(final StringBuilder stringBuilder) {
        return stringBuilder.toString();
    }
}
