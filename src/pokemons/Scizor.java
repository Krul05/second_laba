package pokemons;

import Attacks.HydroPump;
import Attacks.LightScreen;
import Attacks.ThunderShock;
import ru.ifmo.se.pokemon.Type;

public class Scizor extends Scyther{
    public Scizor(String name, int level) {
        super(name, level);
        setStats(70, 130, 100, 55, 80, 65);
        setType(Type.BUG, Type.STEEL);
        setMove(new HydroPump(), new ThunderShock(), new LightScreen());
    }
}
