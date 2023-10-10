package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Scratch extends PhysicalMove {

        public Scratch(){
            super(Type.NORMAL, 35, 100);
        }

        @Override
        protected String describe() {
            return "использует царапание";
        }
}
