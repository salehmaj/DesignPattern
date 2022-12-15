package solution3;

public class Cardamome extends BoissonDecorator{
    public Boisson boisson;
    public double cost () {
        return 0.6 + boisson.cost();
    }
}
