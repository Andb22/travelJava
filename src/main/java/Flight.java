import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String depAirport;
    private String depTime;


    public Flight(String flightNumber, String destination, String depAirport, String depTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.BOEING747);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public int getPassengerListSize(){
        return this.passengers.size();
    }

}
