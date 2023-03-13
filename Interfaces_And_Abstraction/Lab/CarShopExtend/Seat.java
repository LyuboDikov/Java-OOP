package Interfaces_And_Abstraction.Lab.CarShopExtend;

public class Seat extends CarImpl implements Sellable{

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("%s sells for %f", getModel(), getPrice()));
        return sb.toString();
    }
}
