class ExpressDelivery extends Delivery {

        ExpressDelivery(int distance, int weight) {
            super(distance, weight);
        }

        @Override
        public long calculateFee() {
            return 25 + 4 * distance + 2 * weight;
        }
    }

