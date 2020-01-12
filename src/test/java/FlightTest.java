import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Flight flight;


    @Before
    public void before(){
        passenger1 = new Passenger("Tony", 2);
        passenger2 = new Passenger("Jony", 1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", Destination.EDI, Destination.GLA, "10:00");
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
      assertEquals(Destination.EDI, flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals(Destination.GLA, flight.getDeparture());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("10:00", flight.getDepatureTime());
    }

}
