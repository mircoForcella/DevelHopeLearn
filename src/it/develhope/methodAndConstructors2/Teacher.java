package it.develhope.methodAndConstructors2;

public class Teacher {
    private String name;

    public Teacher(String name){
        this.name = name;
        System.out.println("A new Teacher joined");
    }

    public void assignGrade(Student alum,int finalGrade){
        alum.setGrade(finalGrade);
    }
}
