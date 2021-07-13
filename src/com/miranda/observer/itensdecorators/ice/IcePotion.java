package com.miranda.observer.itensdecorators.ice;

import com.miranda.observer.chars.IceMagician;
import com.miranda.observer.interfacedecorator.IceItensDecorator;

public class IcePotion extends IceItensDecorator {

    IceMagician icer ;

    public IcePotion(IceMagician icer){
        this.icer = icer;
    }

    @Override
    public int getPower() {
     return icer.getPower() + 90 ;
    }
}
