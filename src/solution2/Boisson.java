package solution2;

public abstract class Boisson {
    public String description;
    public Boolean lait;
    public Boolean cardamome;
    public Boolean creme;

    public String getDescription () {
        return description;
    }

    public abstract double cost();

    public Boolean hasLait () {
        return lait;
    }
    public Boolean hasCardamome() {
        return cardamome;
    }
    public Boolean hasCreme () {
        return creme;
    }


}
