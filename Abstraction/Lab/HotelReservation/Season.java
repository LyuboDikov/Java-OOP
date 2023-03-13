package Abstraction.Lab.HotelReservation;

public enum Season {
    Autumn("Autumn", 1),
    Spring("Spring", 2),
    Winter("Winter", 3),
    Summer("Summer", 4);

    private String name;
    private int multiplication;

    Season(String name, int multiplication) {
        this.name = name;
        this.multiplication = multiplication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }
}
