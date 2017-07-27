import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = null;

        try {
            scan = new Scanner(new File("/Users/joekramer/Desktop/test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int size = scan.nextInt();
            for (int j = 0; j < size; j++) {
                row.add(scan.nextInt());
            }
            rows.add(row);
        }

        int commands = scan.nextInt();
        for(int x = 0; x < commands; x++) {
            int r = scan.nextInt();
            int c = scan.nextInt();

            try {
                System.out.println(rows.get(r-1).get(c-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
