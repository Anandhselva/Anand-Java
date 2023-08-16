

        import java.util.*;


// Class to store student information

class Student {

    String name;

    int[] marks;


    Student(String name, int[] marks) {
        this.name = name;

        this.marks = marks;

    }

}


// Class to calculate subject total marks

class SubjectTotal {

    static int calculateTotal(int[] marks) {

        int total = 0;

        for (int mark : marks) {

            total += mark;

        }

        return total;

    }

}


// Class to determine rank based on total marks

class RankCalculator {

    static void calculateRank(List<Student> students) {

        Collections.sort(students, (s1, s2) -> {

            int total1 = SubjectTotal.calculateTotal(s1.marks);

            int total2 = SubjectTotal.calculateTotal(s2.marks);

            return Integer.compare(total2, total1);

        });


        System.out.println("Rankings:");

        for (int i = 0; i < students.size(); i++) {

            System.out.println("Rank " + (i + 1) + ": " + students.get(i).name);

        }

    }

}


public class findRank {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", new int[]{85, 92, 78}));

        students.add(new Student("Bob", new int[]{90, 88, 75}));

        students.add(new Student("Carol", new int[]{79, 83, 92}));


        RankCalculator.calculateRank(students);

    }

}