import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR100", "Vancouver", "Glasgow", "2100");
        passenger = new Passenger("Andrew", 1);
    }


    @Test
    public void hasFlightNumber() {
        assertEquals("FR100", flight.getFlightNumber());
    }

    @Test
    public void startsWithEmptyPassengerList(){
        assertEquals(0, flight.getPassengerListSize());

}

    @Test
    public void canReturnNumberOfAvailableSeats(){
        assertEquals(416, flight.getQuantityEmptySeats());
    }

    @Test
    public void canBookPassengerSeat(){
        flight.bookPassenger(passenger);
        assertEquals(415, flight.getQuantityEmptySeats());

    }


}