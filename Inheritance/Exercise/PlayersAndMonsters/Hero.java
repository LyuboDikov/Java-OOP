package Inheritance.Exercise.PlayersAndMonsters;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int age) {
        this.username = username;
        this.level = age;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
