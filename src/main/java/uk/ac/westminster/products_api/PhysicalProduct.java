package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product
        implements Discountable{

    private double discountedPrice;
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, Double price, Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary(){
        return "Physical: " + getName() + " | Weight: " + weightKg;
    }

    @Override
    public void applyDiscount( double rate) {
        //TODO (a): cap the rate at 0.20 with Math.min
        //TODO (b): apply the capped rate, not the rate.
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
