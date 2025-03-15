//PROGRAM 4(B): Find the factorial of a given number using recursion.

import java.util.Scanner;


public class recursiveFactorial{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanValue = new Scanner(System.in);

        System.err.print("Enter your input: ");
        int n = scanValue.nextInt();

        int answer = factorial(n);
        System.out.println("Factorial: "+answer);

        scanValue.close();
    }
}