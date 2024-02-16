public class MediumPizza extends Pizza {

    public MediumPizza(){ desc = "A medium pizza"; }
    @Override
    public double cost() { return 6.95; }

    public String prettyPrint() {
        return super.prettyPrint();
    }
}