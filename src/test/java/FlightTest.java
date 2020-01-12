import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {


    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Plane plane2;
    Flight flight;
    Flight flight2;


    @Before
    public void before(){
        passenger1 = new Passenger("Tony", 2);
        passenger2 = new Passenger("Jony", 1);
        plane = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BUDGIE);
        flight = new Flight(plane, "FR756",
                Destination.EDI, Destination.GLA, "10:00");
        flight2 = new Flight(plane2, "FO756",
                Destination.ABZ, Destination.BEB, "13:05");
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
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void canGetEmptySeats(){
        assertEquals(50, flight.getEmptySeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(49, flight.getEmptySeats());
        assertTrue(flight.getPassengers().contains(passenger1));
    }

    @Test
    public void cantBookPassengerIfFull(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(0, flight2.getEmptySeats());
        assertFalse(flight2.getPassengers().contains(passenger2));
    }
}
