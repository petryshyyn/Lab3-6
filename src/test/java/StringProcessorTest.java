import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.lviv.iot.StringProcessor;

public class StringProcessorTest {
    private String TextForTheTest;

    @BeforeEach
    void setUp() {
        TextForTheTest = "Which programming language(s) are you best?";
    }

    @Test
    void stringProcessorTest() {
        StringBuilder stringBuilder = new StringBuilder();
        StringProcessor stringProcessor = new StringProcessor();
        stringBuilder.append(stringProcessor.checkingVowel(TextForTheTest));
        assertEquals("Which programming language(s) best? ",
                stringProcessor.showResults(stringBuilder));
    }
}
