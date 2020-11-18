package MovingAverage;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MovingAverageImplTest {

    private MovingAverageImpl movingAverage;

    @Before
    public void init() {
        movingAverage = new MovingAverageImpl(4);
    }

    @Test
    public void checkIfValueIsAddedToList() {
        movingAverage.addValue(1d);
        assertEquals(1, movingAverage.getAddedValues().size());
    }

    @Test
    public void checkThatListDoesNotAddNullValue() {
        movingAverage.addValue(null);
        assertEquals(0, movingAverage.getAddedValues().size());
    }

    @Test
    public void calculateAverageWithEmptyList() {
        assertEquals(0.0, movingAverage.calculateMovingAverage(), 0.0);
    }

    @Test
    public void calculateAverageWhenListIsLessThanRange() {
        movingAverage.addValue(1d);
        movingAverage.addValue(2d);
        assertEquals(0.75, movingAverage.calculateMovingAverage(), 0.0);
    }

    @Test
    public void calculateAverageWhenListIsEqualToRange() {
        movingAverage.addValue(1d);
        movingAverage.addValue(2d);
        movingAverage.addValue(3d);
        movingAverage.addValue(4d);
        assertEquals(2.5, movingAverage.calculateMovingAverage(), 0.0);
    }
    @Test
    public void calculateAverageWhenListIsGreaterThanRange() {
        movingAverage.addValue(1d);
        movingAverage.addValue(2d);
        movingAverage.addValue(3d);
        movingAverage.addValue(4d);
        movingAverage.addValue(5d);
        assertEquals(3.5, movingAverage.calculateMovingAverage(), 0.0);
    }

}
