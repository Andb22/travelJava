import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String depAirport;
    private String depTime;
    private int numberOfEmptySeats;


    public Flight(Plane plane, String flightNumber, String destination, String depAirport, String depTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
        this.numberOfEmptySeats = plane.getTotalNumberOfSeats();
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public int getPassengerListSize(){
        return this.passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (this.numberOfEmptySeats > 1) {
            this.passengers.add(passenger);
        }
    }

    public int getQuantityEmptySeats() {
        numberOfEmptySeats = this.plane.getTotalNumberOfSeats() - this.passengers.size();
        return numberOfEmptySeats;
    }
}
