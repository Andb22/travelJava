import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before() {
        flight = new Flight("FR100", "Vancouver", "Glasgow", "2100");
        }


    @Test
    public void hasFlightNumber() {
        assertEquals("FR100", flight.getFlightNumber());
    }

    @Test
    public void startsWithEmptyPassengerList(){
        assertEquals(0, flight.getPassengerListSize());

}
}