import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.CESSNATTX);
        flight1 = new Flight(plane1, "FR100", "Vancouver", "Glasgow", "2100");
        flight2 = new Flight(plane2, "FR101", "Paris", "Glasgow", "1300");
        passenger = new Passenger("Andrew", 1);
    }


    @Test
    public void hasFlightNumber() {
        assertEquals("FR100", flight1.getFlightNumber());
    }

    @Test
    public void startsWithEmptyPassengerList(){
        assertEquals(0, flight1.getPassengerListSize());

}

    @Test
    public void canReturnNumberOfAvailableSeats(){
        assertEquals(416, flight1.getQuantityEmptySeats());
    }

    @Test
    public void canBookPassengerSeat(){
        flight1.bookPassenger(passenger);
        assertEquals(415, flight1.getQuantityEmptySeats());

    }

    @Test
    public void canPreventBookingIfFull(){
        flight2.bookPassenger(passenger);
        flight2.bookPassenger(passenger);
        flight2.bookPassenger(passenger);
        flight2.bookPassenger(passenger);
    assertEquals(2, flight2.getPassengerListSize());
    }


}