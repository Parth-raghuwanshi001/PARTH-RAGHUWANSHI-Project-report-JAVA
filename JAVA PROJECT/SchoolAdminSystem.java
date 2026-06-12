import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showRole() {
        System.out.println("I am a general person.");
    }
}


class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void showRole() {
        System.out.println("I am a Teacher. I teach students.");
       
        System.out.println("   Details -> Name: " + name + " | Subject: " + subject + " | Salary: Rs." + salary);
    }
}


class Student extends Person {
    int rollNumber;
    String course;

    public Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    @Override
    void showRole() {
        System.out.println("I am a Student. I study subjects.");

        System.out.println("   Details -> Name: " + name + " | Course: " + course + " | Roll No: " + rollNumber);
    }
}

public class SchoolAdminSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[2];

        System.out.println("=== School Administration System Setup ===");


        System.out.println("\n--- Enter Teacher Details ---");
        System.out.print("Enter Name: ");
        String teacherName = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Subject: ");
        String teacherSubject = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double teacherSalary = scanner.nextDouble();
        scanner.nextLine(); 

    
        people[0] = new Teacher(teacherName, teacherAge, teacherSubject, teacherSalary);


      
        System.out.println("\n--- Enter Student Details ---");
        System.out.print("Enter Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int studentAge = scanner.nextInt();
        
        System.out.print("Enter Roll Number: ");
        int studentRoll = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Course Name: ");
        String studentCourse = scanner.nextLine();

      
        people[1] = new Student(studentName, studentAge, studentRoll, studentCourse);


       
        System.out.println("\n=== Generating Role Information ===");
        
       
        for (Person p : people) {
            p.showRole(); 
            System.out.println("------------------------------");
        }

        scanner.close(); 
    }
}
