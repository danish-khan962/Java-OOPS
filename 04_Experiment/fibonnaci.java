//Program 4(A): Design a program to generate first 10 terms of Fibonacci series.


public class fibonnaci {
    public static void main(String[] args){
        int a= 0;
        int b= 1;
        System.out.print("FIBONACCI SERIES: "+a+" "+b+" ");

        for(int i=0; i<=10-2; i++){
            int nextNumber = a+b;
            System.out.print(nextNumber+" ");

            a = b;
            b = nextNumber;
        }
    }
}
