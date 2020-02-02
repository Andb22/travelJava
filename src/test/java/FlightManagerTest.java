import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    FlightManager flightManager;
    Passenger passenger;

    @Before
        public void before(){
        passenger = new Passenger("Kate", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR100", "Vancouver", "Glasgow", "2100");
        flightManager = new FlightManager(flight);
}
    @Test
        public void canGetWeightPerPassenger(){
        assertEquals(504, flightManager.getBaggageWeightPerPassenger());
    }

    @Test
    public void canGetBookedBaggageWeight(){
        flight.bookPassenger(passenger);
        assertEquals(504, flightManager.getTotalBookedBaggageWeight());
    }

    @Test
    public void canGetCheckedBaggageWeight(){
        flight.bookPassenger(passenger);
        assertEquals(48, flightManager.getTotalCheckedBaggageWeight());
    }

    @Test
    public void canGetUnbookedBaggageSpace() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(208488, flightManager.getUnbookedBaggageSpace());
    }



}
