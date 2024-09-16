package ques8;

public class app {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());

        Shape cylinder = new Cylinder(3.0, 10.0);
        cylinder.draw();
        System.out.println("Total surface area of cylinder: " + cylinder.calculateArea());
    }
}
