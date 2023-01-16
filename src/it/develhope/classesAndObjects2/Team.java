package it.develhope.classesAndObjects2;

public class Team {
    private String teamName;
    Programmer p1;
    Programmer p2;

    public Team(String teamName,Programmer p1, Programmer p2){
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void printTeamDetails(){
        System.out.println(teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
