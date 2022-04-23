import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThrows;

class Problem2Test {

    @org.junit.jupiter.api.Test
    void first_case() {

        var Problem2 = new Problem2();
        int x[] = {9, 3, -12};
        int y[] = {18, 2, -20};
        int z[] = {50, 32, -82};
        assertTrue(Problem2.equillibrium(3, x, y, z));

    }

    @org.junit.jupiter.api.Test
    void second_case() {

        var Problem2 = new Problem2();
        int x[] = {9};
        int y[] = {18};
        int z[] = {50};
        assertThrows(IllegalArgumentException.class, () -> {Problem2.equillibrium(0, x, y, z);});

    }

    @org.junit.jupiter.api.Test
    void third_case() {

        var Problem2 = new Problem2();
        int x[] = {9};
        int y[] = {18};
        int z[] = {50};
        assertFalse(Problem2.equillibrium(1, x, y, z));

    }

}