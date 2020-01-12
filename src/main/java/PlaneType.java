public enum PlaneType {
    BOEING747(50,100),
    AIRBUSA300(500,1000),
    BUDGIE(10, 50)

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
}