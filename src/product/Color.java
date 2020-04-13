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
public enum Color{
    RED(1), 
    ORANGE(2), 
    YELLOW(3),
    GREEN(4),
    BLUE(5),
    INDIGO(6),
    VIOLET(7);
    
    public final int price;
 
    private Color(int price) {
        this.price = price;
    }
    
    public static Color getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    
}
