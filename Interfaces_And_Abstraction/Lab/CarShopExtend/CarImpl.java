package Interfaces_And_Abstraction.Lab.CarShopExtend;

public class CarImpl implements Car{

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private int tires;
    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.tires = 4;
    }

    @Override
    public String getModel() {
        return model;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }
    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires", getModel(), countryProduced(), tires);
    }
}
