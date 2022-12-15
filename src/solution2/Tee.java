package solution2;

public class Tee extends Boisson{
    public double cost () {
        double result = 3.5;
        if (hasLait()) {
            result += 0.7;
        }
        if (hasCardamome()) {
            result += 0.6;
        }
        if (hasCreme()) {
            result += 1;
        }
        return result;
    }
}
