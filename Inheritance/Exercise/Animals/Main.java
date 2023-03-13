package Inheritance.Exercise.Animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!"Beast!".equals(input)){

            String animalType = input;
            String[] animalTypeDetails = scanner.nextLine().split("\\s+");
            String name = animalTypeDetails[0];
            int age = Integer.parseInt(animalTypeDetails[1]);
            String gender = animalTypeDetails[2];

            try {
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animals.add(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animals.add(frog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animals.add(cat);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        animals.add(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            input = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }
}
