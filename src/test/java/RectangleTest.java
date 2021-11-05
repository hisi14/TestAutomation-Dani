import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2.0, 3.0);
    }

    @Test
    @DisplayName("Check InputParameter")
    void testInvalidInputParameter() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 2));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(2, 0));
    }

    @Test
    @DisplayName("Berechnet den Flächeninhalt der Rechtecks")
    void calculateArea() {
        assertEquals(6, rectangle.calculateArea());
        rectangle.height = 9;
        rectangle.width = 10;
        assertEquals(90, rectangle.calculateArea());
    }

    @Test
    @DisplayName("Berechnet den Umfang des Rechtecks")
    void calculateScope() {
        // assertAll() -> Gruppierter Test
        // alle Tests werden ausgeführt und gemeinsam reported
        assertAll("scope of rectangle",
                  () -> assertEquals(10, this.rectangle.calculateScope()),
                  () -> assertEquals(38, new Rectangle(9, 10).calculateScope()));
    }
}
