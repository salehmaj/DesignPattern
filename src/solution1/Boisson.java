package solution1;

public abstract class Boisson {
    public String description;

    public String getDescription () {
        return description;
    }

    public abstract double cost ();
}
