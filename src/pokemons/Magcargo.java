package pokemons;

import Attacks.Guillotine;
import Attacks.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public class Magcargo extends Slugma{
    public Magcargo(String name, int level) {
        super(name, level);
        setStats(60, 50, 120, 90, 80, 30);
        setType(Type.FIRE, Type.ROCK);
        setMove(new ThunderWave(), new Guillotine());
    }
}
