import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        File file = new File("/Users/joekramer/Desktop/test.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if(i > 1 && j > 1) {
                    int sum = arr[i-2][j-2]
                            + arr[i-2][j-1]
                            + arr[i-2][j]
                            + arr[i-1][j-1]
                            + arr[i][j-2]
                            + arr[i][j-1]
                            + arr[i][j];
                    if(sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.print(max);
    }
}
