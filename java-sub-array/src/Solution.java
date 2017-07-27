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
        int[] array = new int[n];

        for(int y = 0; y < n; y++) {
            array[y] = scan.nextInt();
        }
        int j = 1;
        int total = 0;
        while(j <= n) {
            for(int i = 0; i + j <= n; i++) {
                int[] test = Arrays.copyOfRange(array, i, i + j);
                int sum = 0;
                for(int x =0; x < test.length; x++) {
                    sum += test[x];
                }
                if (sum < 0) {
                    total++;
                }
            }
            j++;
        }
        System.out.println(total);
    }
}