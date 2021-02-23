import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSort {

    @Test
    public void simpleEvenTest(){
        int[] array = {55, 98, 10, 14};
        array = ArraySorting.sort(array);
        int[] expected = {10, 14, 55, 98};
        Assertions.assertArrayEquals(array, expected);
    }

    @Test
    public void simpleOddTest(){
        int[] array = {55, 10, 5, 14, 98};
        array = ArraySorting.sort(array);
        int[] expected = {5, 10, 14, 55, 98};
        Assertions.assertArrayEquals(array, expected);
    }

    @Test
    public void zeroTest(){
        int[] array = {};
        array = ArraySorting.sort(array);
        int[] expected = {};
        Assertions.assertArrayEquals(array, expected);
    }

    @Test
    public void oneTest(){
        int[] array = {1};
        array = ArraySorting.sort(array);
        int[] expected = {1};
        Assertions.assertArrayEquals(array, expected);
    }

    @Test
    public void trueTest(){
        int[] array = {1, 2, 3, 4, 5};
        array = ArraySorting.sort(array);
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(array, expected);
    }

    @Test
    public void descTest(){
        int[] array = {6, 5, 4, 3, 2, 1};
        array = ArraySorting.sort(array);
        int[] expected = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(array, expected);
    }

    @Test
    public void equalsTest(){
        int[] array = {10, 1, 2, 2, 2, 15, 15};
        array = ArraySorting.sort(array);
        int[] expected = {1, 2, 2, 2, 10, 15, 15};
        Assertions.assertArrayEquals(array, expected);
    }

}
