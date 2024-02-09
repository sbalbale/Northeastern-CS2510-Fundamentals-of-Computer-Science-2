package uk.ac.nulondon;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListFuncs {
    private final List<int[]> records;

    public ArrayListFuncs(List<int[]> records) {
        this.records = records;
    }

    public static List<int[]> readFile() {
        try (FileReader in = new FileReader("src/main/resources/Report2014small.csv");
             CSVParser parser = CSVFormat.DEFAULT.parse(in)) {
            return parser.stream().skip(1)
                    .map(CSVRecord::values)
                    .map(r -> Arrays.stream(r).mapToInt(Integer::parseInt).toArray())
                    .toList();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public int sumEvents() {
        int sum=0;
        for (int[] record : this.records) {
            sum += record[3];
        }
        return sum;
    }
// find the month with the most events
    public int maxMonth() {
        int max = 0;
        int[] months = new int[12];
        for (int[] record : this.records) {
            months[record[0] - 1] += record[3];
            if (months[record[0] - 1] > max) {
                max = months[record[0] - 1];
            }
        }
        return max;
    }

    public boolean nightHasMore() {
        int night = 0;
        int day = 0;
        for (int[] record : records) {
            if (record[1] >= 18 || record[1] < 6) {
                night += record[3];
            } else {
                day += record[3];
            }
        }
        return night > day;
    }

    public static void main(String[] args) {
        List<int[]> records = readFile();
        ArrayListFuncs funcs = new ArrayListFuncs(records);

        System.out.println("Total number of events: " + funcs.sumEvents());
        System.out.println("Month with the most events: " + funcs.maxMonth());
        System.out.println("Night has more events than day: " + funcs.nightHasMore());
    }

}
