public class CaramelDecorator extends CoffeeDecorator {

    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with caramel";
    }
}
