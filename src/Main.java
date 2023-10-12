import pocemons.Granbull;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Granbull p1 = new Granbull("hkh", 1);
        Granbull p2 = new Granbull("Granbull", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}