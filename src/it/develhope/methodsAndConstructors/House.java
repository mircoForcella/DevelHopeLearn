package it.develhope.methodsAndConstructors;

public class House {
    private String address;
    private int numberOfFloors;

    public House(String address,int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;

        System.out.println("Address: " + address + "Floors: " + numberOfFloors);
    }
}

