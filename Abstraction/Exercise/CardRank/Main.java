package Abstraction.Exercise.CardRank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        Arrays.stream(CardRank.values()).forEach(e -> System.out.printf("Ordinal value: %d; Name value: %s%n", e.ordinal(), e.name()));
    }
}
