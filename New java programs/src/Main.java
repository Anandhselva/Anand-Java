class ClassA {
    private int privateVarA = 10;
    public int publicVarA = 20;

    public int getPrivateVarA() {
        return privateVarA;
    }
}

class ClassB {
    public void accessVariables() {
        ClassA instanceA = new ClassA();

// Accessing the public variable from ClassA in ClassB
        int value1 = instanceA.publicVarA;
        System.out.println("Public variable from ClassA in ClassB: " + value1);

// Accessing the private variable from ClassA using a getter method
        int value2 = instanceA.getPrivateVarA();
        System.out.println("Private variable from ClassA in ClassB: " + value2);
    }
}

public class Main {
    public static void main(String[] args) {
        ClassB instanceB = new ClassB();
        instanceB.accessVariables();
    }
}