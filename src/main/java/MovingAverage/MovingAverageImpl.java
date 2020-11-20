package MovingAverage;;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the MovingAverage.MovingAverage interface
 *
 * @author Emmanuel Ambele
 */
public class MovingAverageImpl implements MovingAverage<Double> {
    //Number of elements to be calculated
    private final int range;

    // List containing all added numbers
    private final List<Double> numberList;

    // stores updated sum of the range of elements
    private Double sum;

    public MovingAverageImpl(int range) {
        this.range = range;
        this.numberList = new ArrayList<Double>();
        this.sum = 0d;
    }

    /**
     * This method calculates and returns the average of the last N numbers added.
     * if the range N greater than 0, the average of the last N digits is returned.
     * if the last is less than the range N, the the average is returned with
     * an assumption of the remaining digits being 0.
     * @return Double
     */
    public Double calculateMovingAverage() {

        if (range > 0 && numberList.size() >= range) {
            return (sum / range);
        } else if (numberList.size() < range) {
            System.out.print("Warning: List size of " + numberList.size() + " is less than set range of "+range+"," +
                    " unfair average! ");
            return (sum / range);
        }
        return 0d;
    }

    /**
     * This method adds value to the list and updates the sum of the last N elements.
     * Null values are checked and not added to the list
     * the sum is updated by adding the newly added value to it and subtracting the oldest value from the sum if
     * the list is greater than the range
     * @param value
     */

    public void addValue(Double value) {
        if (value == null) {
            System.out.println("Null value cannot be added");
            return;
        }
        numberList.add(value);
        sum += value;
        if (numberList.size() > range) {
            sum -= numberList.get((numberList.size() - range) - 1);
        }
    }

    /**
     * This method returns the list of values added
     * @return List
     */
    public List<Double> getAddedValues() {
        return numberList;
    }

}