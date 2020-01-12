import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Flight flight;
    ArrayList<Plane> planes;


    @Before
    public void before(){
        passenger1 = new Passenger("Tony", 2);
        passenger2 = new Passenger("Jony", 1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight();
    }

    @Test
    public void hasPlanes(){
        assertEquals(0, flight.getPlanes().size());
    }
}