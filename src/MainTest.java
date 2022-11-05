import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testingMethod() {
        var t = Main.h(1, 3);
        assertEquals(0.2, t);
    }
}