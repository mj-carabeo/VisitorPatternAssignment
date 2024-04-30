public interface ShippingCostVisitor {
    void visit(Chair chair);
    void visit(Sofa sofa);
    void visit(Table table);
}

public class FlatRateShippingCostVisitor implements ShippingCostVisitor {
    private static final double CHAIR_SHIPPING_COST = 10.0;
    private static final double SOFA_SHIPPING_COST = 20.0;
    private static final double TABLE_SHIPPING_COST = 30.0;

    @Override
    public void visit(Chair chair) {
        System.out.println("Chair shipping cost: " + CHAIR_SHIPPING_COST);
    }

    @Override
    public void visit(Sofa sofa) {
        System.out.println("Sofa shipping cost: " + SOFA_SHIPPING_COST);
    }

    @Override
    public void visit(Table table) {
        System.out.println("Table shipping cost: " + TABLE_SHIPPING_COST);
}

public class DistanceBasedShippingCostVisitor implements ShippingCostVisitor {
    private static final double BASE_RATE = 5.0;
    private static final double RATE_PER_MILE = 1.0;
    private double distance;

    public DistanceBasedShippingCostVisitor(double distance) {
        this.distance = distance;
    }

    @Override
    public void visit(Chair chair) {
        double shippingCost = BASE_RATE + RATE_PER_MILE * distance;
        System.out.println("Chair shipping cost: " + shippingCost);
    }

    @Override
    public void visit(Sofa sofa) {
        double shippingCost = BASE_RATE + 2 * RATE_PER_MILE * distance;
        System.out.println("Sofa shipping cost: " + shippingCost);
    }

    @Override
    public void visit(Table table) {
        double shippingCost = BASE_RATE + 2 * RATE_PER_MILE * distance;
        System.out.println("Table shipping cost: " + shippingCost);
    }
}
