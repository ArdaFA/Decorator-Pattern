public class SimpleCoffee implements Coffee {

    @Override
    public double getPrice() {
        return 5.0; // base cost of a simple coffee
    }

    @Override
    public String getDescription() {
        return "Just a base Coffee";
    }
}
