import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    FlightManager flightManager;

    @Before
        public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR100", "Vancouver", "Glasgow", "2100");
        flightManager = new FlightManager(flight);
}
    @Test
        public void canGetWeightPerPassenger(){
        assertEquals(504, flightManager.getBaggageWeightPerPassenger());
    }


}
