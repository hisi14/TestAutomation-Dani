import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsDemo {

    int a; // Deklaration der Variable a als int
    String s; // Deklaration der Variable s als String

    @BeforeEach
    void setUp() {
        // wird vor jedem Testcase ausgeführt (gekennzeichnet mit "@Test")
        // dient dazu, um für jeden Test benötigte Ressourcen zur Verfügung zu stellen
        // zB: eine Instanz einer Klasse => new Calculator()
        // oder Parameter die für jeden Test nötig sind

        a = 1; // a ist bei jedem Durchlauf 1
        s = "Hallo Welt"; // s ist bei jedem Test "Hallo Welt"

    }

    @Test
    void assertEqualsTest() {
        /*
          assertEquals(expected, actual)
          nimmt einen erwarteten Wert entgegen (was erwartet sich der Programmierer)
          und einen aktuellen Wert (den Wert den die zu testenden Methode retourniert)
          => kurz gesagt, es werden 2 Werte miteinander verglichen
         */
        int actual = 2 - a;
        int expected = 1;
        assertEquals(expected, actual); // Aus der Berechnung 2 - a erwarten wir uns das Ergebnis 1
    }

    @Test
    void assertTrueTest() {
        /*
          assertTrue(Bedingung)
          Es wird überprüft, ob eine Bedingung auch zutrifft
         */
        String expected = "hallo welt";
        String lowerCase = this.s.toLowerCase();
        assertTrue(expected.equals(lowerCase));
        assertTrue(a > 0);
    }

    @Test
    void assertFalseTest() {
        /*
          assertFalse(Bedingung)
          Es wird überprüft, ob eine Bedingung nicht zutrifft
          sprich, das Gegenteil von assertTrue()
         */
        String expected = "hallo welt";
        String upperCase = this.s.toUpperCase();
        assertFalse(expected.equals(upperCase));
        assertFalse(a < 0);
    }


    @AfterEach
    void tearDown() {
        // wird nach jedem Testcase ausgeführt
        // kann sehr oft vernachlässigt werden, da einzelne Testcases nicht lange laufen
        // und die setUp() Methode bereinigte Daten zur Verfügung stellt
    }
}
