import MovingAverage.MovingAverage;
import MovingAverage.MovingAverageImpl;

/**
 * Main class to show the working of the implemenation of the moving average
 * shows average for list smaller than range N
 * shows average for list same size and bigger than N for last N values
 * shows added values as list
 */

public class MovingAverageMain {

    public static void main(String[] args) {
        int N = 3;
        MovingAverage<Double> movingAverage = new MovingAverageImpl(N);
        movingAverage.addValue(5d);
        movingAverage.addValue(7d);

        System.out.println("Average: " + movingAverage.calculateMovingAverage());

        movingAverage.addValue(3d);
        movingAverage.addValue(7d);
        movingAverage.addValue(9d);
        System.out.println("Average: " + movingAverage.calculateMovingAverage());

        movingAverage.addValue(6d);
        movingAverage.addValue(7d);
        System.out.println("Average: " + movingAverage.calculateMovingAverage());

        System.out.println(movingAverage.getAddedValues());

    }
}