package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Drowzee extends Pokemon {
    public Drowzee(String name, int level) {
        super(name, level);
        setStats(60, 48, 45, 43, 90, 42);
        setType(Type.PSYCHIC);
    }
}
