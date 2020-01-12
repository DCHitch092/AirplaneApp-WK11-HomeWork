import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Plane plane2;
    Flight flight;
    Flight flight2;
    FlightManager flightManager;


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
        flightManager = new FlightManager();
    }

    @Test
    public void hasPassengerBaggageReserveSize(){
        assertEquals(1,flightManager.eachPassengerBaggageSize(plane));
        assertEquals(25,flightManager.eachPassengerBaggageSize(plane2));
    }

    //Calculate how much baggage weight should be reserved for each passenger for a flight
    //calculate how much baggage weight is booked by passengers of a flight
    //calculate how much overall weight reserved for baggage remains for a flight
}
