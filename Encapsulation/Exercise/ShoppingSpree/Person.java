package Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    public void setName (String name){
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    public void setMoney(double money){
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName(){
        return name;
    }
    public void buyProduct(Product product){
        if (this.money < product.getCost()){
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        products.add(product);
        money -= product.getCost();
    }
    @Override
    public String toString() {
        if (this.products.isEmpty()){
            return String.format("%s - Nothing bought", name);
        } else {
            return String.format("%s - %s", name, products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        }
    }
}
