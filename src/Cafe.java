import solution1.Boisson;
import solution2.Esspresso;
import solution1.Latte;
import solution3.Cardamome;
import solution3.Lait;

public class Cafe {

    public static void main (String[] args) {
        Latte latte = new Latte();
        latte.description = "Esspresso avec Lait";
        System.out.println(latte.getDescription());
        System.out.println("Cost: " + latte.cost());

        Esspresso esspresso = new Esspresso();
        esspresso.description = "Esspresso avec Lait";
        esspresso.lait = true;
        esspresso.creme = false;
        esspresso.cardamome = false;
        System.out.println(esspresso.getDescription());
        System.out.println("Cost: " + esspresso.cost());

        solution3.Esspresso esspresso3 = new solution3.Esspresso();
        esspresso3.description = "Esspresso avec Lait";
        Lait lait = new Lait();
        lait.boisson = esspresso3;
        System.out.println(esspresso3.getDescription());
        System.out.println(lait.cost());
        Cardamome cardamome = new Cardamome();
        cardamome.boisson = lait;
        System.out.println(cardamome.cost());
    }
}
