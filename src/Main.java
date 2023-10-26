import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Granbull p1 = new Granbull("Granbull", 1);
        Scizor p2 = new Scizor("Scizor", 1);
        Politoed p3 = new Politoed("Politoed", 1);
        Slugma p4 = new Slugma("Slugma", 1);
        Magcargo p5 = new Magcargo("Magcargo", 1);
        Hypno p6 = new Hypno("Hypno", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}