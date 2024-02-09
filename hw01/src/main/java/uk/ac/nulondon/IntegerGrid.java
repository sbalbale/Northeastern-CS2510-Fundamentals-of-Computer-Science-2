package uk.ac.nulondon;

import java.util.Arrays;

public class IntegerGrid {
    int[][] grid;
    public IntegerGrid(int row, int col) {
        this.grid = new int[row][col];
    }
    public IntegerGrid(IntegerGrid grid) {
        this.grid = new int[grid.getRowSize()][grid.getColumnSize()];
        for (int i = 0; i < grid.getRowSize(); i++) {
            for (int j = 0; j < grid.getColumnSize(); j++) {
                this.grid[i][j] = grid.grid[i][j];
            }
        }
    }

    public void populate(int value) {
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                this.grid[i][j] = i+j+value;
            }
        }
    }
    public String tostring() {
//        System.out.println(Arrays.deepToString(this.grid));
        String str = "";
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                str += this.grid[i][j];
                if (j < this.grid[i].length - 1) {
                    str += " ";
                }
            }
            str += "\n";
        }
        return str;
    }
    public void deleteRow(int r) {
        int [][] newGrid = new int[this.grid.length - 1][this.grid[0].length];
        for (int i = 0; i < this.grid.length; i++) {
            if (i < r) {
                newGrid[i] = this.grid[i];
            } else if (i > r) {
                newGrid[i - 1] = this.grid[i];
            }
        }
        this.grid = newGrid;
    }
    public int getRowSize() {
        return this.grid.length;
    }
    public int getColumnSize() {
        return this.grid[0].length;
    }

    public static void main(String[] args) {

    }

}
