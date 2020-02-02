public class FlightManager {

   private Flight flight;
   private int baggage;

    public FlightManager(Flight flight){

     this.flight = flight;


    }

    public int getBaggageWeightPerPassenger(){
        baggage = Math.round((flight.plane.getWeightFromEnum()/2) / this.flight.plane.getTotalNumberOfSeats());
        return baggage;
    }

    public int getTotalBookedBaggageWeight() {
        return this.getBaggageWeightPerPassenger() * flight.passengers.size();
    }


    public int getTotalCheckedBaggageWeight(){
        int totalBookedBaggage = 0;
        for (Passenger passenger : flight.passengers){
            int passBagWeight = passenger.getBagQuantity() * 24;// taking it that all bags weigh 24kgs
            totalBookedBaggage += passBagWeight;
        }
        return totalBookedBaggage;
    }

    public int getUnbookedBaggageSpace(){
        return (flight.plane.getWeightFromEnum()/2) - this.getTotalBookedBaggageWeight();

    }

}
