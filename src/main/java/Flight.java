import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;

    public Flight(Plane plane){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }


}
