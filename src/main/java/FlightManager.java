public class FlightManager {

   private Flight flight;

    public FlightManager(Flight flight){

     this.flight = flight;

    }

    public int getBaggageWeightPerPassenger(){
        int baggage = Math.round((flight.plane.getWeightFromEnum()/2) / this.flight.plane.getTotalNumberOfSeats());
        return baggage;
    }


}
