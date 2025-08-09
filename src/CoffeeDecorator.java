public class CoffeeDecorator implements Coffee {

    // the wrapped coffee Object
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
