

// Inheritance: Superclass

class Animal {

    void makeSound() {

        System.out.println("Some sound");

    }

}


// Inheritance: Subclass inheriting from Animal

class Dog extends Animal {

    @Override

    void makeSound() {

        System.out.println("Dog barks");

    }


    void fetch() {

        System.out.println("Dog fetches the ball");

    }

}


// Inheritance: Subclass inheriting from Animal

class Cat extends Animal {

    @Override

    void makeSound() {

        System.out.println("Cat meows");

    }


    void climb() {

        System.out.println("Cat climbs the tree");

    }

}


public class inheritanceAndPolymorphism {

    public static void main(String[] args) {

        Animal myPet = new Dog();

        myPet.makeSound();


        myPet = new Cat();

        myPet.makeSound();

    }

}