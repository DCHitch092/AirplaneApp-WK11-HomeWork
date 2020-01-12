import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Destination destination;
    private Destination departure;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, Destination destination,
                  Destination departure, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return new ArrayList<Passenger>(passengers);
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Destination getDestination() {
        return destination;
    }

    public Destination getDeparture() {
        return departure;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public int getEmptySeats() {
        int fullCapacity = this.getPlane().getCapacity();
        int currentPassengers = getPassengers().size();
        return fullCapacity - currentPassengers;
    }

    public void bookPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
