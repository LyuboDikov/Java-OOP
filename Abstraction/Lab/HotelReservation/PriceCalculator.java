package Abstraction.Lab.HotelReservation;

public class PriceCalculator {


    public static double calculatePrice(double pricePerDay, int days, Season season, DiscountType discountType){
     double price = pricePerDay * days;

     price *= season.getMultiplication();
     price -= price * (discountType.getPercentage() / 100);

     return price;
    }
}
