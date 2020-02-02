import java.util.ArrayList;

public class Flight {

    ArrayList<Passenger> passengers;
    Plane plane;
    private String flightNumber;
    private String destination;
    private String depAirport;
    private String depTime;


    public Flight(Plane plane, String flightNumber, String destination, String depAirport, String depTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
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

    public void bookPassenger(Passenger passenger){
        if (this.getPassengerListSize() < this.plane.getTotalNumberOfSeats()) {
            this.passengers.add(passenger);
        }
    }

    public int getQuantityEmptySeats() {
      return  (this.plane.getTotalNumberOfSeats() - this.passengers.size());
    }
}
