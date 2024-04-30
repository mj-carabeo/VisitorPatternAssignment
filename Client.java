public class Client {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        Furniture sofa = new Sofa();
        Furniture table = new Table();

        ShippingCostVisitor flatRateVisitor = new FlatRateShippingCostVisitor();
        ShippingCostVisitor distanceBasedVisitor = new DistanceBasedShippingCostVisitor(100);

        chair.accept(flatRateVisitor);
        chair.accept(distanceBasedVisitor);

        sofa.accept(flatRateVisitor);
        sofa.accept(distanceBasedVisitor);

        table.accept(flatRateVisitor);
        table.accept(distanceBasedVisitor);
    }
}
