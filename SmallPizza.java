public class SmallPizza extends Pizza {

    public SmallPizza(){ desc = "A small pizza"; }
    @Override
    public double cost() { return 4.45; }

    public String prettyPrint() {
        return super.prettyPrint();
    }
}