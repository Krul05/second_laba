package pokemons;

import Attacks.Scratch;
import Attacks.Slam;
import Attacks.TailWhip;
import ru.ifmo.se.pokemon.Type;

public class Granbull extends Snubbull {
    public Granbull(String name, int level) {
        super(name, level);
        setStats(90, 120, 75, 60, 60, 45);
        setType(Type.FAIRY);
        setMove(new Slam(), new TailWhip(), new Scratch());
    }
}
