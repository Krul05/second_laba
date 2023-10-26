package Attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderShock extends SpecialMove {
    public ThunderShock(){
        super(Type.ELECTRIC, 30, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.1) {
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "использует громовой удар";
    }
}
