package it.develhope.methodAndConstructors2;

public class Start {

    public static void main(String[] args) {

        Student student1 = new Student("Carmelo", 6);
        Student student2 = new Student("Giovanni", 9);

        Teacher teacher1 = new Teacher("Francesco");

        teacher1.assignGrade(student1, 7);
        System.out.println("The student " + student1.getName()+ " has grade: " + student1.getGrade());
    }
}
