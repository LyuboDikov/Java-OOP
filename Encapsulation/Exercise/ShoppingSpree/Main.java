package Encapsulation.Exercise.ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personsMap = new LinkedHashMap<>();
        String[] people = scanner.nextLine().split(";");

        for (String currentPerson : people) {
            String[] personDetails = currentPerson.split("=");
            String name = personDetails[0];
            double money = Double.parseDouble(personDetails[1]);

            try {
                Person person = new Person(name, money);
                personsMap.put(name, person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        Map<String, Product> productsMap = new LinkedHashMap<>();
        String[] products = scanner.nextLine().split(";");

        for (String currentProduct : products){
            String[] productDetails = currentProduct.split("=");
            String name = productDetails[0];
            double cost = Double.parseDouble(productDetails[1]);

            try {
                Product product = new Product(name, cost);
                productsMap.put(name, product);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String[] tokens = command.split("\\s+");
            String currentName = tokens[0];
            String product = tokens[1];

            try {
                personsMap.get(currentName).buyProduct(productsMap.get(product));
                System.out.printf("%s bought %s%n", currentName, product);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            command = scanner.nextLine();
        }

        for (Person person : personsMap.values()){
            System.out.println(person);
        }
    }
}
