package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scyther extends Pokemon {
    public Scyther(String name, int level) {
        super(name, level);
        setStats(70, 110, 80, 55, 80, 105);
        setType(Type.BUG, Type.FLYING);
    }
}
