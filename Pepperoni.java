public class Pepperoni extends ToppingsDecorator{

    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + 1.45;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", pepperoni";
    }
}
