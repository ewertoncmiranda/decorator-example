package com.miranda.observer.itensdecorators.fire;

import com.miranda.observer.chars.FireWarrior;
import com.miranda.observer.interfacedecorator.FireItensDecorator;

public class FirePotion extends FireItensDecorator {

    FireWarrior firer ;

    public FirePotion(FireWarrior firer){
        this.firer = firer;
    }

    @Override
    public int getPower() {
        return firer.getPower() + 100;
    }
}
