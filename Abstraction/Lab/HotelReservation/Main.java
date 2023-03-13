package Abstraction.Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(inputData[0]);
        int days = Integer.parseInt(inputData[1]);
        Season season = Season.valueOf(inputData[2]);
        DiscountType discountType = DiscountType.valueOf(inputData[3]);

        double totalPrice = PriceCalculator.calculatePrice(pricePerDay, days, season, discountType);

        System.out.printf("%.2f", totalPrice);
    }
}
