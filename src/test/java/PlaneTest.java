import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Passenger passenger;
    Plane plane;

    @Before
    public void before(){
        passenger = new Passenger("Tony", 2);
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, plane.getCapacity;);
    }

//    @Test
//    public void hasTotalWeight(){
//        assertEquals(100, plane.getTotalWeight);
//    }

}
