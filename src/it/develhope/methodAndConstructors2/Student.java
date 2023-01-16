package it.develhope.methodAndConstructors2;

public class Student {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade(){
        return this.grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    public Student(String studentName, int grade){
        this.name = studentName;
        this.grade = grade;

        System.out.println("A new Student joined");
    }

    public void getStudentDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Grade: "+ grade);
    }
}
