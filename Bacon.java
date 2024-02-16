public class Bacon extends ToppingsDecorator{

    Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + 1.45;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", bacon";
    }
}