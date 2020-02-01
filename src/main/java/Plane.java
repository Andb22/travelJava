public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public int getWeightFromEnum(){
        return this.plane.getWeight();

    }
}
