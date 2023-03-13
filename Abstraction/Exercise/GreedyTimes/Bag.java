package Abstraction.Exercise.GreedyTimes;

import java.util.List;

public class Bag {
    private List<Item> items;
    private long capacity;


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Item item : items) {
            sb.append(String.format("<%s> $%s", item, item.getAmount()));
            //TODO - finish the rest of the printing.
            return "";
        }
        return null;
    }

    public void put(Item item) {
        if (weCanStore(item)) {
            //TODO - finish checking items and quantities to be added.
        }
    }

    public long getAmount(ItemType itemType) {
        return this.items.stream().filter(e -> e.getItemType().equals(itemType))
                .mapToLong(Item::getAmount).sum();
    }

    public long getTotalAmount() {
        return getAmount(ItemType.GEM) + getAmount(ItemType.GOLD) + getAmount(ItemType.CASH);
    }

    private boolean weCanStore(Item item) {
        if (capacity < getTotalAmount() + item.getAmount()) {
            return false;
        }

        switch (item.getItemType()) {
            case GEM:
                if (getAmount(ItemType.GEM) + item.getAmount() > getAmount(ItemType.GOLD)) {
                    return false;
                }
                break;
            case CASH:
                if (getAmount(ItemType.CASH) + item.getAmount() > getAmount(ItemType.GEM)) {
                    return false;
                }
                break;
        }
        return true;
    }
}
