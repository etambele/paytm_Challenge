package MovingAverage;

import java.util.List;
/**
 *
 * This is an interface which is related to performing a moving average operation,
 * the interface allow the operations listed below:
 * Calculates the moving average of the last N elements added
 * Adding elements for Moving Average calculation
 * Returns added elements
 *
 * @author Emmanuel Ambele
 */

public interface MovingAverage<T> {

    /**
     * This method calculates and returns the average of the last N numbers added.
     * @return the average of last n digits
     */
    T calculateMovingAverage();

    /**
     * This method adds values to be calculated to a data structure.
     */
    void addValue(T element);

    /**
     * This method returns all values added to the data structure
     * @return List
     */
    List<T> getAddedValues();

}
