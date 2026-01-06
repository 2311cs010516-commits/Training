class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------");
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20, 85);
        Student s2 = new Student("Anjali", 21, 90);
        Student s3 = new Student("Kiran", 19, 80);

        s1.display();
        s2.display();
        s3.display();

        int totalMarks = s1.marks + s2.marks + s3.marks;
        double average = totalMarks / 3.0;

        System.out.println("Average Marks of Students: " + average);
    }
}
