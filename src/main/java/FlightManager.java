public class FlightManager {

    public int eachPassengerBaggageSize(Plane plane) {
        int capacity = plane.getCapacity();
        int totalWeight = plane.getTotalWeight();
        return (totalWeight/2)/capacity;
    }
}
