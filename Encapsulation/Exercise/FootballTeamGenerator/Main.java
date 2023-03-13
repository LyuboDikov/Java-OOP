package Encapsulation.Exercise.FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teamsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"END".equals(input)){
            String[] tokens = input.split(";");

            String command = tokens[0];
            String teamName = tokens[1];

            try {
                switch (command) {
                    case "Team":
                        Team teamToCreate = new Team(teamName);
                        teamsMap.put(teamName, teamToCreate);
                        break;
                    case "Add":
                        int endurance = Integer.parseInt(tokens[3]);
                        int sprint = Integer.parseInt(tokens[4]);
                        int dribble = Integer.parseInt(tokens[5]);
                        int passing = Integer.parseInt(tokens[6]);
                        int shooting = Integer.parseInt(tokens[7]);

                        if (!teamsMap.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            String playerName = tokens[2];
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teamsMap.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        String playerName = tokens[2];
                        teamsMap.get(teamName).removePlayer(playerName);
                        break;
                    case "Rating":
                        if (!teamsMap.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            System.out.printf("%s - %d%n", teamName, Math.round(teamsMap.get(teamName).getRating()));
                        }
                        break;
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            input = scanner.nextLine();
        }
    }
}
