package class10;

public class Student {

        //Properties/Attributes
        String name;

        int age;

        String id;
        //Methods/functions/Behaviors
        void study(){
            System.out.println("Studying 16 hours a day.........");
        }

    public static void main(String[] args) {
        // we are creating an actual student by using the Student class
            Student ehabObj = new Student();
            ehabObj.name = "Ehab";
            ehabObj.age = 22;
            ehabObj.id = "abc123";
            ehabObj.study(); // scanner.nextInt() - meter example;

        Student habibObj = new Student();
        habibObj.name = "Habib";
        habibObj.age = 21;
        habibObj.id = "abc234";
        habibObj.study();
    }
    }

