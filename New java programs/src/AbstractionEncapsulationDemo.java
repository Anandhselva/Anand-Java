public class AbstractionEncapsulationDemo {

    public static void main(String[] args) {

        Circle circle = new Circle(5.0);


        // Encapsulation: Accessing and modifying radius using getters and setters

        System.out.println("Radius: " + circle.getRadius());

        circle.setRadius(7.0);

        System.out.println("Updated Radius: " + circle.getRadius());


        // Abstraction: Calling the abstract method to calculate area

        double area = circle.calculateArea();

        System.out.println("Area of Circle: " + area);

    }

}
