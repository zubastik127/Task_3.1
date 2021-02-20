import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThanosSortingTest {
    @Test
    public void simpleSortTest() {
        int[] array = {2, 44, 4, 20, 7, 25};
        int[] actualArray = {2, 4, 7, 20, 25, 44};
        array = ThanosSorting.sorting(array);
        Assertions.assertArrayEquals(actualArray, array);
    }

    @Test
    public void simpleSortTest2() {
        int[] array = {2, -5, 4, 20, -7, 0};
        int[] actualArray = {-7, -5, 0, 2, 4, 20};
        array = ThanosSorting.sorting(array);
        Assertions.assertArrayEquals(actualArray, array);
    }

    @Test
    public void simpleSortTest3() {
        int[] array = {0, -5, 4, 0, -7, 0};
        int[] actualArray = {-7, -5, 0, 0, 0, 4};
        array = ThanosSorting.sorting(array);
        Assertions.assertArrayEquals(actualArray, array);
    }

    @Test
    public void simpleSortTest4() {
        int[] array = {5, 2};
        int[] actualArray = {2, 5};
        array = ThanosSorting.sorting(array);
        Assertions.assertArrayEquals(actualArray, array);
    }

    @Test
    public void simpleSortTest6() {
        int[] array = {2, -5, 4, 20, -7, 0};
        array = ThanosSorting.sorting(array);
        Assertions.assertNotNull(array);
    }
}
