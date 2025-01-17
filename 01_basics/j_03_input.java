//Importing input library
import java.util.Scanner; 

public class j_03_input {
    public static void main(String[] args) {
        
        //Creating Java Input object
        Scanner sc = new Scanner(System.in);

        int radius;
        System.out.print("Enter radius: ");
        radius = sc.nextInt();

        double pi = 3.145;

        double areaOfCircle= (pi * radius * radius);

        System.out.println("Area of circle is: " + (areaOfCircle));
    }
}
