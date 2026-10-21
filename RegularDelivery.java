class RegularDelivery extends Delivery {

    RegularDelivery(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public long calculateFee() {
        return 10 + 2 * distance + weight;
    }
}