// client for coffee shop

public class Main {
    public static void main(String[] args) {

        // 1- test simple coffee.
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("Order 1: " + myCoffee.getDescription() + " | Cost: €" + myCoffee.getPrice());

        // 2- decoratorA. decorate it with milk
        // wrap the base coffee inside a MilkDecorator
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("Order 2: " + myCoffee.getDescription() + " | Cost: €" + myCoffee.getPrice());

        // 3- decoratorB. now also add caramel
        // wrap MilkDecorator also with caramel
        myCoffee = new CaramelDecorator(myCoffee);
        System.out.println("Order 3: " + myCoffee.getDescription() + " | Cost: €" + myCoffee.getPrice());
    }
}