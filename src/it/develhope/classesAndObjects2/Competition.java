package it.develhope.classesAndObjects2;

public class Competition {
    public static void main(String[] args) {
    CompetitionRules rules = new CompetitionRules();
    Programmer p1 = new Programmer("mirco","java",2);
    Programmer p2 = new Programmer("pippo","java",3);
    Programmer p3 = new Programmer("salvatore","javaScript",4);
    Programmer p4 = new Programmer("francesco","Phyton",4);

    rules.printRules();
    System.out.println("--------------------------------");

    Team teamA = new Team("TEAM A", p1, p2);
    Team teamB= new Team("TEAM B", p3, p4);

    teamA.printTeamDetails();
    System.out.println("--------------------------------");
    teamB.printTeamDetails();
    }

}
