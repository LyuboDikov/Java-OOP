package Interfaces_And_Abstraction.Exercise.FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);

            Buyer buyer;
            if (inputData.length == 4) {
                String citizenId = inputData[2];
                String citizenBirthDate = inputData[3];
                buyer = new Citizen(name, age, citizenId, citizenBirthDate);
            } else {
                String group = inputData[2];
                buyer = new Rebel(name, age, group);
            }
            buyers.put(name, buyer);
        }

        String inputName = scanner.nextLine();

        while (!"End".equals(inputName)) {

            Buyer buyer = buyers.get(inputName);
            if (buyer != null){
                buyer.buyFood();
            }
            inputName = scanner.nextLine();
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
