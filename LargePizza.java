public class LargePizza extends Pizza {

    public LargePizza(){ desc = "A large pizza with cheese"; }
    @Override
    public double cost() { return 12.15; }

    public String prettyPrint() {
        return super.prettyPrint();
    }
}
