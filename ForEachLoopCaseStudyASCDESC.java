package loopsStatements;

import java.util.Arrays;

public class ForEachLoopCaseStudyASCDESC {

    public static void main(String[] args) {

        int arr[] = {45, 67, 32, 21, 88, 789, 98, 50};

        Arrays.sort(arr);

        System.out.println("Ascending Order");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        int rev[] = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[index++] = arr[i];
        }
        
        System.out.println();

        System.out.println("Descending Order");
        for (int i : rev) {
            System.out.print(i + " ");
        }
    }
}
