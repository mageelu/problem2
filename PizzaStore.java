public class PizzaStore {

    public static void main(String[] args){
        Pizza pizza = new LargePizza();
        System.out.println(pizza.prettyPrint());

        Pizza pizza2 = new MediumPizza();
        pizza2 = new Pepperoni(pizza2);
        pizza2 = new Pepperoni(pizza2);
        System.out.println(pizza2.prettyPrint());
    }
}
