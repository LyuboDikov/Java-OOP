package Abstraction.Exercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] galaxyDimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = galaxyDimensions[0];
        int cols = galaxyDimensions[1];

        Field field = new Field(rows, cols);
        Galaxy galaxy = new Galaxy(field);

        long starsCollected = 0;

        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            int[] jediPositions = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] evilPositions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int rowEvil = evilPositions[0];
            int colEvil = evilPositions[1];

            galaxy.moveEvil(rowEvil, colEvil);

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            starsCollected += galaxy.moveJediAndCollectStars(rowJedi, colJedi);

            command = scanner.nextLine();
        }
        System.out.println(starsCollected);
    }
}