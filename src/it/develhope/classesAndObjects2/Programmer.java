package it.develhope.classesAndObjects2;

public class Programmer {

    private String name;
    private String programmingLanguage;
    private int yearsOfExperience;

    /*public String printProgrammerDetails(){
        return "Programmer "+ name + " has used " + programmingLanguage + " for "  + yearsOfExperience;
    }*/


   public Programmer(String name, String programmingLanguage, int yearsOfExperience) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printProgrammerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}
