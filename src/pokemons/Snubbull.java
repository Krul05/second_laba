package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snubbull extends Pokemon {
    public Snubbull(String name, int level) {
        super(name, level);
        setStats(60, 80, 50, 40, 40, 30);
        setType(Type.FAIRY);
    }
}
