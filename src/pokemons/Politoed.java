package pokemons;

import Attacks.HydroPump;
import Attacks.LightScreen;
import Attacks.Tackle;
import Attacks.ThunderShock;
import ru.ifmo.se.pokemon.Type;

public class Politoed extends Poliwhirl{

    public Politoed(String name, int level) {
        super(name, level);
        setStats(90, 75, 75, 90, 100, 70);
        setType(Type.WATER);
        setMove(new HydroPump(), new ThunderShock(), new Tackle(), new LightScreen());
    }
}
