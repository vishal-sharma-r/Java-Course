class Student {
    public int rollNo;
    public String name;
    public String course;
    int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double average() {
        return (double) total() / 3;
    }

    public String grade() {
        double avg = average();
        if (avg > 90)
            return "A+";
        else if (avg <= 90 && avg > 80)
            return "A";
        else if (avg <= 80 && avg > 60)
            return "B";
        else
            return "F";
    }

    public void printStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Total Marks: " + total());
        System.out.printf("Average: %.2f \n", average());
        System.out.println("Grade: " + grade());
    }

}

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Adi";
        student1.rollNo = 12;
        student1.course = "Math";
        student1.m1 = 100;
        student1.m2 = 98;
        student1.m3 = 100;
        student1.printStudentDetails();

    }
}
