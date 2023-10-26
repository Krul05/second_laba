package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class Guillotine extends PhysicalMove {
    public Guillotine() {
        super(Type.NORMAL, 5, 30);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        return 100000;
    }
    @Override
    protected String describe() {
        return "использует гильотину";
    }
}
