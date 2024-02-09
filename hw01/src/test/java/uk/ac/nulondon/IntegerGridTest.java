package uk.ac.nulondon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerGridTest {
    @Test
    public void testIntegerGrid1() {
        IntegerGrid grid = new IntegerGrid(4, 3);
        grid.populate(2);
        Assertions.assertEquals("2 3 4\n3 4 5\n4 5 6\n5 6 7\n", grid.tostring());
        grid.deleteRow(3);
        Assertions.assertEquals("2 3 4\n3 4 5\n4 5 6\n", grid.tostring());
        Assertions.assertEquals(3, grid.getRowSize());
        Assertions.assertEquals(3, grid.getColumnSize());
        IntegerGrid grid2 = new IntegerGrid(grid);
        Assertions.assertEquals("2 3 4\n3 4 5\n4 5 6\n", grid2.tostring());
        Assertions.assertEquals("2 3 4\n3 4 5\n4 5 6\n", grid.tostring());
    }

    @Test
    public void testIntegerGrid2() {
        IntegerGrid grid = new IntegerGrid(3, 3);
        grid.populate(1);
        Assertions.assertEquals("1 2 3\n2 3 4\n3 4 5\n", grid.tostring());
        grid.deleteRow(1);
        Assertions.assertEquals("1 2 3\n3 4 5\n", grid.tostring());
        Assertions.assertEquals(2, grid.getRowSize());
        Assertions.assertEquals(3, grid.getColumnSize());
        IntegerGrid grid2 = new IntegerGrid(grid);
        Assertions.assertEquals("1 2 3\n3 4 5\n", grid2.tostring());
        Assertions.assertEquals("1 2 3\n3 4 5\n", grid.tostring());
    }

    @Test
    public void testIntegerGrid3() {
        IntegerGrid grid = new IntegerGrid(2, 4);
        grid.populate(1);
        Assertions.assertEquals("1 2 3 4\n2 3 4 5\n", grid.tostring());
        grid.deleteRow(1);
        Assertions.assertEquals("1 2 3 4\n", grid.tostring());
        Assertions.assertEquals(1, grid.getRowSize());
        Assertions.assertEquals(4, grid.getColumnSize());
        IntegerGrid grid2 = new IntegerGrid(grid);
        Assertions.assertEquals("1 2 3 4\n", grid2.tostring());
        Assertions.assertEquals("1 2 3 4\n", grid.tostring());
    }

}
