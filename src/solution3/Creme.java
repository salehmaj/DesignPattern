package solution3;

public class Creme extends BoissonDecorator{
    Boisson boisson;
    public double cost () {
        return 1 + boisson.cost();
    }
}
