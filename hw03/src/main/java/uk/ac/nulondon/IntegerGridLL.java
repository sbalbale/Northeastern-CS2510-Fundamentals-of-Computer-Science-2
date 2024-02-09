package uk.ac.nulondon;


public class IntegerGridLL {
    private MySingleLinkList<MySingleLinkList<Integer>> grid = new MySingleLinkList<>();

    public IntegerGridLL() {
        MySingleLinkList<MySingleLinkList<Integer>> grid = new MySingleLinkList<>();
        this.grid = grid;
    }
    public IntegerGridLL(MySingleLinkList<MySingleLinkList<Integer>> grid) {

        for (int i = 0; i < grid.length(); i++) {
            MySingleLinkList row = new MySingleLinkList();
            for (int j = 0; j < grid.getAt(i).length(); j++) {
                row.add(grid.getAt(i).getAt(j));
            }
            this.grid.add(row);
        }
    }

    @Override
    public String toString() {
        String stringGrid = "";
        for (int i = 0; i < grid.length(); i++) {
            for (int j = 0; j < grid.getAt(i).length(); j++) {
//                System.out.println(grid.getAt(i).getAt(j));
                stringGrid += grid.getAt(i).getAt(j) + " ";
            }
            stringGrid += "\n";
        }
        return stringGrid;
    }

    public void deleteRow(int row) {
        grid.removeAt(row);
    }

    public int getRowSize(){
        return grid.length();
    }

    public int getColumnSize(int row){
        return grid.getAt(row).length();
    }

    public static void main(String[] args) {
        MySingleLinkList<MySingleLinkList<Integer>> grid = new MySingleLinkList<>();
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
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);

        System.out.println(grid.toString());
        grid.removeAt(1);
        System.out.println(grid.toString());



        IntegerGridLL grid1 = new IntegerGridLL(grid);

        String stringGrid = grid1.toString();
        System.out.println(stringGrid);
    }
}
