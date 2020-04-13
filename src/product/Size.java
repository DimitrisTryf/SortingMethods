/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author dimit
 */
public enum Size{
    XS(1),
    S(2),
    M(3),
    L(4),
    XL(5),
    XXL(6),
    XXXL(7);
//ordinal gia tin thesi sto enum;
    public final int price;

    private Size(int price) {
        this.price = price;
    }

    public static Size getRandomFabric() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
