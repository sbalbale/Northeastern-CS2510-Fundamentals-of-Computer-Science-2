package uk.ac.nulondon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListAndTime {
    @Test
    public void testList() {
        int[] inputArray = {1, 2, 3, 4, 5};
        MyList list = new MyList(inputArray);
        Assertions.assertArrayEquals(inputArray, list.getList());

    }

    @Test
    public void testTime() {
        Time time = new Time(12, 30, 45);
        Time time2 = new Time(12, 30, 45);
        Time time3 = new Time(12, 30, 46);
        Assertions.assertTrue(time.sameTime(time2));
        Assertions.assertFalse(time.sameTime(time3));
    }
}
