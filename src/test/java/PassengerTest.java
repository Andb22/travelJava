import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Calendar now = new GregorianCalendar(Timezone.getTimeZone());


public class PassengerTest {

    private Passenger passenger;
    // private Flight flight;
    private int seatNumber;

    @Before
    public void before(){
        passenger = new Passenger("Kate", 2);
 //       flight = new Flight("FR100", "YVR", "GLA", "21:00");

    }

    @Test
    public void hasName() {
        assertEquals("Kate", passenger.getName());
    }

}
