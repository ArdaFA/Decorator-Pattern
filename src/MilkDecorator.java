/*
ConcreteDecoratorA: Adds Milk to the coffee
 */

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    // it adds its own price on top of the wrapped coffee
    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + "with Milk";
    }
}
