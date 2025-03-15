//PROGRAM 05: Find the average and sum of array of N numbers entered by user.

import java.util.Scanner;

public class AvgAndSum {
    public static void sumAndAverage(int[] arr, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = arr[i] + sum;
        }
        System.out.println("Sum of elements: " + sum);

        int average = (sum/n);
        System.out.println("Average of elements: " + average);
    }
    public static void main(String[] args) {
        Scanner scanValue = new Scanner(System.in);

        int n = 7;
        int[] arr = new int[7];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scanValue.nextInt();
        }
        
        sumAndAverage(arr,n);
    }
}
