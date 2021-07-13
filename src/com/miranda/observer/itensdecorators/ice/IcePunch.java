package com.miranda.observer.itensdecorators.ice;

import com.miranda.observer.chars.IceMagician;
import com.miranda.observer.interfacedecorator.IceItensDecorator;

public class IcePunch extends IceItensDecorator {

    IceMagician icer ;

    public IcePunch(IceMagician icer){
        this.icer = icer;
    }

    @Override
    public int getPower() {
        return icer.getPower()+35;
    }
}
