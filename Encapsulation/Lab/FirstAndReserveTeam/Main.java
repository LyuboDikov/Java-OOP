package Encapsulation.Lab.FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());

        Team team = new Team("Black Eagles");

        for (int currentPerson = 0; currentPerson < peopleCount; currentPerson++) {

            String[] personDetails = scanner.nextLine().split("\\s+");

            String firstName = personDetails[0];
            String lastName = personDetails[1];
            int age = Integer.parseInt(personDetails[2]);
            double salary = Double.parseDouble(personDetails[3]);

            Person person = new Person(firstName, lastName, age, salary);

            team.addPlayer(person);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
