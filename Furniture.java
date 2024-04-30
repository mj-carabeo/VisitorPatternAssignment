public interface Furniture {
    void accept(ShippingCostVisitor visitor);
}

public class Chair implements Furniture {
    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }
}

public class Sofa implements Furniture {
    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

public class Table implements Furniture {
    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
}
