package Encapsulation.Exercise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        String[] doughInfo = scanner.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double weightInGrams = Double.parseDouble(doughInfo[3]);


        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);
            pizza.setDough(dough);
            String toppingTypeInput = scanner.nextLine();
            while (!"END".equals(toppingTypeInput)){
                String[] toppingInfo = toppingTypeInput.split("\\s+");

                String toppingType = toppingInfo[1];
                double toppingWeight = Double.parseDouble(toppingInfo[2]);
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);

                toppingTypeInput = scanner.nextLine();
            }

            System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
