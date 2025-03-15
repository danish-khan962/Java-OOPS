//PROGRAM 06: Create a class to find out the Area and perimeter of rectangle. 

import java.util.Scanner;

class PerAndArea{
    double length;
    double breadth;

    PerAndArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void perimeter(){
        double peri = 2*(length+breadth);
        System.out.println("Perimeter of rectangle: "+peri);
    }
    
    void area(){
        double ar = length*breadth;
        System.out.println("Area of reactangle: "+ar);
    }
}

public class PerimeterAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        PerAndArea rect = new PerAndArea(length, breadth);

        rect.perimeter();
        rect.area();
    }
}
