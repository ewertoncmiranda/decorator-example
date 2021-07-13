package com.miranda.observer.itensdecorators.fire;

import com.miranda.observer.chars.FireWarrior;
import com.miranda.observer.interfacedecorator.FireItensDecorator;

public class FireSword extends FireItensDecorator {

    FireWarrior character ;

    public FireSword(FireWarrior character){
        this.character = character;
    }

    @Override
    public int getPower() {
        return character.getPower() + 15;
    }
}
