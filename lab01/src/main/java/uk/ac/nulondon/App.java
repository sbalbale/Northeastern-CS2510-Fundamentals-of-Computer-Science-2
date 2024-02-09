package uk.ac.nulondon;

public final class App {
    private App() {
    }

//    condensed versions of the methods
//    public static boolean startsWithY(String s) {
//        return s.startsWith("y") || s.startsWith("Y");
//    }
//
//    public static String bingoWord(String s) {
//        return s.toUpperCase().charAt(0) + " " + s.length();
//    }
    public static boolean startsWithY(String s) {
//      get first character of string
        char firstChar = s.charAt(0);
//      convert to lowercase
        firstChar = Character.toLowerCase(firstChar);
//      return true if first character is y or Y
        return firstChar == 'y';
    }

    public static String bingoWord(String s) {
//      get first character of string
        char firstChar = s.charAt(0);
//      convert to uppercase
        firstChar = Character.toUpperCase(firstChar);
//      return first character + length of string
        return firstChar + " " + s.length();
    }

    public static void main(String[] args) {
        System.out.println(startsWithY("y"));
        System.out.println(startsWithY("Y"));
        System.out.println(startsWithY("yes"));
        System.out.println(startsWithY("Yes"));
        System.out.println(startsWithY("no"));
        System.out.println(startsWithY("No"));
        System.out.println(bingoWord("bingo"));
        System.out.println(bingoWord("Win"));
        System.out.println(bingoWord("Dog"));
        System.out.println(bingoWord("Cat"));
        System.out.println(bingoWord("long"));
   }
}



