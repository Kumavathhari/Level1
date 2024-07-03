package Level1;

import java.util.Scanner;

public class Circle {
    public double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
    public double areaCircle(double area){
        return Math.PI*radius*radius;

    }

    public double circumferenceCircle(double circumference){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(5);

        System.out.print("Area of circle : ");
        double area=sc.nextDouble();
        System.out.println(circle.areaCircle(9));

        System.out.print("circumference of circle : ");
        double circumference=sc.nextDouble();
        System.out.println(circle.circumferenceCircle(circumference));

        sc.close();

    }
}
