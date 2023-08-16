

// Abstraction: Abstract class defining a common method

abstract class Shape {

    abstract double calculateArea();

}


// Encapsulation: Class encapsulating attributes and providing access methods

class Circle extends Shape {

    private double radius;


    public Circle(double radius) {

        this.radius = radius;

    }


    public double getRadius() {

        return radius;

    }


    public void setRadius(double radius) {

        this.radius = radius;

    }


    @Override

    double calculateArea() {

        return Math.PI * radius * radius;

    }

}


