package Attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER, 5, 80);
    }
    @Override
    protected String describe() {
        return "использует гидронасос";
    }
}
