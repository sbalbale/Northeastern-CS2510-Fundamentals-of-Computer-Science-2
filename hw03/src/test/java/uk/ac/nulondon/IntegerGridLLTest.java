package uk.ac.nulondon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerGridLLTest {
    @Test
    public void TestInterGridLL() {
        MySingleLinkList<MySingleLinkList<Integer>> grid1 = new MySingleLinkList<>();
        MySingleLinkList<Integer> row1 = new MySingleLinkList<>();
        MySingleLinkList<Integer> row2 = new MySingleLinkList<>();
        MySingleLinkList<Integer> row3 = new MySingleLinkList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row2.add(4);
        row2.add(5);
        row2.add(6);
        row3.add(7);
        row3.add(8);
        row3.add(9);
        grid1.add(row1);
        grid1.add(row2);
        grid1.add(row3);

        IntegerGridLL grid = new IntegerGridLL(grid1);
        Assertions.assertEquals(3, grid.getRowSize());
        Assertions.assertEquals(3, grid.getColumnSize(0));
        Assertions.assertEquals(
                "1 2 3 \n" +
                        "4 5 6 \n" +
                        "7 8 9 \n", grid.toString());

        grid.deleteRow(1);
        Assertions.assertEquals(2, grid.getRowSize());
        Assertions.assertEquals(3, grid.getColumnSize(0));
        Assertions.assertEquals(
                "1 2 3 \n" +
                        "7 8 9 \n", grid.toString());

    }

    @Test
    public void TestMySingleLinkList() {
        MySingleLinkList<Integer> row1 = new MySingleLinkList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        Assertions.assertEquals(3, row1.length());
        Assertions.assertEquals(2, row1.getAt(1));
        Assertions.assertEquals("3 2 1 ", row1.toString());
        Assertions.assertEquals(false, row1.removeAt(1));
        Assertions.assertEquals("3 1 ", row1.toString());
    }

}
