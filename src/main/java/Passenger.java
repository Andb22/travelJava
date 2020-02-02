import java.util.Random;

public class Passenger {

    private String name;
    private int bagQuantity;
    private Flight flight1;
    private int seatNumber;

    public Passenger(String name, int bagQuantity) {
        this.name = name;
        this.bagQuantity = bagQuantity;
    }

    public String getName(){
        return this.name;
    }

    public int getBagQuantity(){
        return this.bagQuantity;
    }

    public void addFlight(Flight flight){
        flight1 = flight;
        seatNumber = (int)(Math.random() * (1 + flight.plane.getTotalNumberOfSeats()));
//        for(Passenger passenger : flight.passengers)
//            if (this.seatNumber == passenger.seatNumber) {
//                this.addFlight(flight);
//            }
//        return seatNumber;
    }

    public Flight getFlight(){
        return this.flight1;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

}
