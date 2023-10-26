package pokemons;

import Attacks.Guillotine;
import Attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slugma extends Pokemon {
    public Slugma(String name, int level) {
        super(name, level);
        setStats(40, 40, 40, 70, 40, 20);
        setType(Type.FIRE);
        setMove(new ThunderWave(), new Guillotine());
    }
}
