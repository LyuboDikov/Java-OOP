package Interfaces_And_Abstraction.Exercise.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        while (!"End".equals(input)){
            String[] inputData = input.split("\\s+");
            String type = inputData[0];

            Birthable birthable;

            switch (type){
                case "Citizen":
                    String name = inputData[1];
                    int age = Integer.parseInt(inputData[2]);
                    String id = inputData[3];
                    String birthDate = inputData[4];
                    birthable = new Citizen(name, age, id, birthDate);
                    birthables.add(birthable);
                    break;
                case "Pet":
                    String petName = inputData[1];
                    String petBirthDate = inputData[2];
                    birthable = new Pet(petName, petBirthDate);
                    birthables.add(birthable);
                    break;
                case "Robot":
                    break;
            }
            input = scanner.nextLine();
        }
        String birthYearPostfix = scanner.nextLine();

        birthables.stream().filter(i -> i.getBirthDate().endsWith(birthYearPostfix)).forEach(birthable -> System.out.println(birthable.getBirthDate()));
    }
}