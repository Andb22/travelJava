
import sun.util.calendar.Gregorian;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Flight {

    ArrayList<Passenger> passengers;
    Plane plane;
    private String flightNumber;
    private String destination;
    private String depAirport;
    private String depTime;
    Calendar calendar;


    public Flight(Plane plane, String flightNumber, String destination, String depAirport, String depTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
        this.convertStringToCalendar();
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
            passenger.addFlight(this);
        }
    }

    public int getQuantityEmptySeats() {
        return  (this.plane.getTotalNumberOfSeats() - this.passengers.size());
    }


    public void convertStringToCalendar() {
    Date date = null;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     try{
        date = df.parse(this.depTime);
    } catch (ParseException e) {
        e.printStackTrace();
    }
        System.out.println(date);
        calendar = new GregorianCalendar();
        calendar.setTime(date);
    }
}
