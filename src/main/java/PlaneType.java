public enum PlaneType {

    BOEING747(412769, 112760),
    AIRBUSA380(560000, 112760),
    BOEING777(412769, 112760),
    BOEING737(412769, 112760);

    private final int weight;
    private final int loadCapacity;

    PlaneType(int weight, int loadCapacity) {
        this.weight = weight;
        this.loadCapacity = loadCapacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
