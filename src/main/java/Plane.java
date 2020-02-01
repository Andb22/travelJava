import com.sun.org.apache.bcel.internal.generic.RETURN;

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
}
