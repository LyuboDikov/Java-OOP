package Abstraction.Exercise.JediGalaxy;

public class Galaxy {
    private Field field;
    private Jedi jedi;
    private Evil evil;

    public Galaxy(Field field) {
        this.field = field;
        this.jedi = new Jedi();
        this.evil = new Evil();
    }

    public int moveJediAndCollectStars(int rowJedi, int colJedi) {
        return jedi.move(rowJedi, colJedi, field);
    }

    public void moveEvil(int rowEvil, int colEvil) {
        evil.move(rowEvil, colEvil, field);
    }
}