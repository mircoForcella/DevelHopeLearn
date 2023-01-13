package it.develhope.classesAndObjects;

public class Programmer {

    public String name;
    public int age;
    public boolean wearsGlasses;

public String drinkCoffe() {
    return "Espresso is the secret!";
}

public String printDetails(){
    return name + " is a " + age + " yo programmer";
}

public String hasGlasses(){
    return "Is " + name + " wearing glasses?" + wearsGlasses;
}
}


