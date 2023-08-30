package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class asList {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int[] arr = {3,6,9,12,15};
    int[][] arr2 = {{12,3},{3,6,9,12,15}};





    int result = Arrays.binarySearch(arr, 10);
 System.out.println(   result);
        int result2 = Arrays.binarySearch(arr, 16);
        System.out.println(   result2);
        int result5 = Arrays.binarySearch(arr, 17);
        System.out.println(   result5);
        int result3 = Arrays.binarySearch(arr, 14);
        System.out.println(   result3);//9 2     8 -1    7-1
        int result4 = Arrays.binarySearch(arr, 8);
        System.out.println(   result4);//
        int result9 = Arrays.binarySearch(arr, 7);
        System.out.println(   result9);

        System.out.println(   Arrays.toString(arr));
        System.out.println(   Arrays.toString(arr2));
        System.out.println(   Arrays.deepToString(arr2));
    }
}
