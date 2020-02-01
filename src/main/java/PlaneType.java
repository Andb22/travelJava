public enum PlaneType {

    BOEING747(420000, 416),
    AIRBUSA380(560000, 853),
    BOEING777(300000, 368),
    BOEING737(80000, 215);

    private final int weight;
    private final int seatCapacity;

    PlaneType(int weight, int seatCapacity) {
        this.weight = weight;
        this.seatCapacity = seatCapacity;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getCapacity(){
        return this.seatCapacity;
    }
}
