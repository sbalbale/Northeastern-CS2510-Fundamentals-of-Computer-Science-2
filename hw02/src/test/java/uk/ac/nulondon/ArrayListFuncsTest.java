package uk.ac.nulondon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayListFuncsTest {
    @Test
    public void testSumEvents() {
        ArrayListFuncs funcs = new ArrayListFuncs(ArrayListFuncs.readFile());
        Assertions.assertEquals(16, funcs.sumEvents());
    }

    @Test
    public void testMaxMonth() {
        ArrayListFuncs funcs = new ArrayListFuncs(ArrayListFuncs.readFile());
        Assertions.assertEquals(5, funcs.maxMonth());
    }

    @Test
    public void testNightHasMore() {
        ArrayListFuncs funcs = new ArrayListFuncs(ArrayListFuncs.readFile());
        Assertions.assertEquals(false, funcs.nightHasMore());
    }

}
