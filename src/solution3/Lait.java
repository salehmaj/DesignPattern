package solution3;

public class Lait extends BoissonDecorator{
    public Boisson boisson;

    public double cost() {
        return 0.7 + boisson.cost();
    }
}
