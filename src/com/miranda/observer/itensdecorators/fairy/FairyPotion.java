package com.miranda.observer.itensdecorators.fairy;

import com.miranda.observer.chars.MagicianFairy;
import com.miranda.observer.interfacedecorator.FairyItensDecorator;

public class FairyPotion extends FairyItensDecorator {

    MagicianFairy fairy ;

    public FairyPotion (MagicianFairy fairy){
        this.fairy = fairy;
    }

    @Override
    public int getPower() {
        return fairy.getPower() +95 ;
    }
}
