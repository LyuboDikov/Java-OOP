package Abstraction.Exercise.GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] lootData = scanner.nextLine().split("\\s+");

        Bag myBag = new Bag();


        for (int i = 0; i < lootData.length; i += 2) {
            String currentItemName = lootData[i];
            long quantity = Long.parseLong(lootData[i + 1]);

            Item item = createItem(currentItemName, quantity);

            myBag.put(item);

        }
    }


    private static Item createItem(String currentItemName, long quantity) {
        ItemType itemType;

        if (currentItemName.length() == 3) {
            itemType = ItemType.CASH;
        } else if (currentItemName.toLowerCase().endsWith("gem")) {
            itemType = ItemType.GEM;
        } else if (currentItemName.equalsIgnoreCase("gold")) {
            itemType = ItemType.GOLD;
        } else {
            return null;
        }
        return new Item(itemType, currentItemName, quantity);
    }
}