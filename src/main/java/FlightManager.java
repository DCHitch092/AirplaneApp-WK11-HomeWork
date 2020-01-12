import java.util.ArrayList;

public class FlightManager {

    public int eachPassengerBaggageSize(Flight flight) {
        int capacity = flight.getPlane().getCapacity();
        int totalWeight = flight.getPlane().getTotalWeight();
        return (totalWeight/2)/capacity;
    }

    public int getTotalWeightBaggageBooked(Flight flight) {
        ArrayList<Passenger> passengers = flight.getPassengers();
        if(passengers.size() == 0){ return 0; }

        int totalWeight = 0;
        for (Passenger passenger : passengers){
            totalWeight += passenger.getBags();
        }
        return totalWeight;
    }

    public int getRemainingWeight() {
    }
}
