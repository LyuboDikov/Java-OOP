package Inheritance.Lab.RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();

        randomArrayList.add(1123123145);
        randomArrayList.add(212512);
        randomArrayList.add(124151);
        randomArrayList.add(141);
        randomArrayList.add(29);

        System.out.println(randomArrayList.getRandomElement());
    }
}
