package it.develhope.classesAndObjects;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer p1 = new Programmer();
        p1.name = "Mirco";
        p1.age = 26;
        p1.wearsGlasses = false;

        Programmer p2 = new Programmer();
        p2.name = "Francesco";
        p2.age = 36;
        p2.wearsGlasses = true;


        System.out.println(p1.drinkCoffe() + " " + p1.printDetails());
        System.out.println(p2.printDetails() + " " + p2.hasGlasses());
    }
}
