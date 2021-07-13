package com.miranda.observer;

import com.miranda.observer.chars.FireWarrior;
import com.miranda.observer.chars.IceMagician;
import com.miranda.observer.chars.MagicianFairy;
import com.miranda.observer.itensdecorators.fairy.FairyPotion;
import com.miranda.observer.itensdecorators.fairy.FairyWings;
import com.miranda.observer.itensdecorators.fire.FirePotion;
import com.miranda.observer.itensdecorators.fire.FireSword;
import com.miranda.observer.itensdecorators.ice.IcePotion;
import com.miranda.observer.itensdecorators.ice.IcePunch;

public class Main {

    public static void main(String[] args) {

        FireWarrior fireWarrior = new FireWarrior();
        System.out.println(" O pode atual do guerreiro de fogo é  "+fireWarrior.getPower());
        fireWarrior = new FireSword(fireWarrior);
        System.out.println(" O pode atual do guerreiro de fogo é  "+fireWarrior.getPower());
        fireWarrior = new FirePotion(fireWarrior);
        System.out.println(" O pode atual do guerreiro de fogo é  "+fireWarrior.getPower());

        IceMagician iceMagician = new IceMagician();
        System.out.println(" O pode atual do mago de gelo é  "+iceMagician.getPower());
        iceMagician = new IcePunch(iceMagician);
        System.out.println(" O pode atual do mago de gelo é  "+iceMagician.getPower());
        iceMagician = new IcePotion(iceMagician);
        System.out.println(" O pode atual do mago de gelo é  "+iceMagician.getPower());

        MagicianFairy fairy = new MagicianFairy();
        System.out.println(" O pode atual da fada é  "+fairy.getPower());
        fairy = new FairyPotion(fairy);
        System.out.println(" O pode atual da fada é  "+fairy.getPower());
        fairy = new FairyWings(fairy);
        System.out.println(" O pode atual da fada é  "+fairy.getPower());

    }
}
