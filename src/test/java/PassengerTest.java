import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private Plane plane;

    @Before
    public void before(){
        passenger = new Passenger("Kate", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR100", "Vancouver", "Glasgow",  "2020-03-29 21:00:00");

    }

    @Test
    public void hasName() {
        assertEquals("Kate", passenger.getName());
    }

    @Test
    public void canAddFlight() {
        flight.bookPassenger(passenger);
        assertEquals("FR100", passenger.getFlight().getFlightNumber());
    }

    @Test
    public void canAddSeatNumber() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        System.out.println(passenger.getSeatNumber());
        assertNotNull(passenger.getSeatNumber());
    }


}
