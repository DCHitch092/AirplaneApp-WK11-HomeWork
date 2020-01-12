public class FlightManager {

    public int eachPassengerBaggageSize(Flight flight) {
        int capacity = flight.getPlane().getCapacity();
        int totalWeight = flight.getPlane().getTotalWeight();
        return (totalWeight/2)/capacity;
    }

    public int getTotalWeightBaggageBooked(Flight flight) {
    }
}
