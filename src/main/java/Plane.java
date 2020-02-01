
public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public int getWeightFromEnum(){
        return this.plane.getWeight();

    }

    public int getTotalNumberOfSeats() {
        return this.plane.getCapacity();
    }

    public int getBaggageWeightPerPassenger() {
        int baggage = Math.round((this.plane.getWeight()/2) / this.plane.getCapacity());
    return baggage;
    }
}
