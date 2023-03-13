package Polymorphism.Exercise.Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vehicle car = getVehicle(scanner);
        Vehicle truck = getVehicle(scanner);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);

        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();

            String[] commandTokens = command.split("\\s+");

            String commandName = commandTokens[0];
            String vehicleType = commandTokens[1];
            double argument = Double.parseDouble(commandTokens[2]);

            switch (commandName) {
                case "Drive":
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;
                case "Refuel":
                    vehicleMap.get(vehicleType).refuel(argument);
                    break;
            }
        }

        vehicleMap.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(Scanner scanner) {

        String[] vehicleData = scanner.nextLine().split("\\s+");

        String vehicleType = vehicleData[0];
        double fuelQuantity = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelQuantity, fuelConsumption);
            case "Truck":
                return new Truck(fuelQuantity, fuelConsumption);
            default:
                throw new IllegalArgumentException("Vehicle type not found");
        }
    }

}