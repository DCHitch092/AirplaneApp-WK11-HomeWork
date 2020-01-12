public enum PlaneType {
    BOEING747(50,100),
    AIRBUSA300(500,1000),
    BUDGIE(1, 50);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
