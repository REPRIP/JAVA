package ques8;

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder with radius " + radius + " and height " + height + ".");
    }

    @Override
    public double calculateArea() {
        return 2 * 3.14 * radius * (radius + height) ;
    }
}