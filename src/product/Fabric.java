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
public enum Fabric{
    WOOL(1),
    COTTON(2),
    POLYESTER(3),
    RAYON(4),
    LINEN(5),
    CASHMERE(6),
    SILK(7);

    public final int price;

    private Fabric(int price) {
        this.price = price;
    }

    public static Fabric getRandomFabric() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
