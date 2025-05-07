package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        if (numberToBeDetermined < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public static void main(String[] args) {
        PositiveNumberDeterminer determiner = new PositiveNumberDeterminer();
        determiner.isPositive(-10);
    }
}
