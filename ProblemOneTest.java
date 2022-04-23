import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemOneTest {

    @org.junit.jupiter.api.Test
    void Odd() {
        var watermelon = new ProblemOne();
        assertFalse(ProblemOne.watermelon(5));

    }

    @org.junit.jupiter.api.Test
    void Even() {
        var watermelon = new ProblemOne();
        assertTrue(ProblemOne.watermelon(14));

    }

    @org.junit.jupiter.api.Test
    void BiggerThan100() {
        var watermelon = new ProblemOne();
        assertThrows(IllegalArgumentException.class, () -> {
            ProblemOne.watermelon(130);});

    }

    @org.junit.jupiter.api.Test
    void Negativeodd() {
        var watermelon = new ProblemOne();
        assertThrows(IllegalArgumentException.class, () -> {
            ProblemOne.watermelon(-7);});

    }

    @org.junit.jupiter.api.Test
    void Negativeeven() {
        var watermelon = new ProblemOne();
        assertThrows(IllegalArgumentException.class, () -> {
            ProblemOne.watermelon(-24);});

    }

}