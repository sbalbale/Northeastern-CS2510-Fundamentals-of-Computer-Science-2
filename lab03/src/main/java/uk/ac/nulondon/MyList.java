package uk.ac.nulondon;

public class MyList {
//    Create a class MyList with a private data member list
//    that is an array of ints. Write a constructor that takes
//    in an array of ints and copies to the private data member.
//    private int[] list;
//    public MyList(int[] inputArray) {
//        this.list = inputArray;
//    }
//}

    // Declare the list as a private field
    private int[] list;

    // Constructor that takes an array of integers and copies to the 'list' variable.
    public MyList(int[] initialArray) {
        this.list = new int[initialArray.length];  // Initialize the size of the array based on input

        for (int i = 0; i < initialArray.length; i++) {
            this.list[i] = initialArray[i];  // Copy each element from the input to the 'list'
        }
    }

    public int[] getList() {
        return list;
    }

}