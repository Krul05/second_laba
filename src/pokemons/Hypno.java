package pokemons;

import Attacks.Guillotine;
import Attacks.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public class Hypno extends Drowzee{

    public Hypno(String name, int level) {
        super(name, level);
        setStats(85, 73, 70, 73, 115, 67);
        setType(Type.PSYCHIC);
        setMove(new ThunderWave(), new Guillotine());
    }
}
