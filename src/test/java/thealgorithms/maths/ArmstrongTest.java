package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ArmstrongTest {
    @Test
    void testIsArmstrong() {
        assertFalse(Armstrong.isArmstrong(5));
    }
}