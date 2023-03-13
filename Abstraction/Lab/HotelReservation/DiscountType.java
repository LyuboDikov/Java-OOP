package Abstraction.Lab.HotelReservation;

public enum DiscountType {
    VIP("VIP",20),
    SecondVisit("SecondVisit",10),
    None("None",0);

   private String name;
    private double percentage;

    DiscountType(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
