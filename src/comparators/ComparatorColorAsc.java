/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import java.util.Comparator;
import models.Tshirt;

/**
 *
 * @author dimit
 */
public class ComparatorColorAsc implements Comparator<Tshirt> {
    
    @Override
        public int compare(Tshirt s1, Tshirt s2) {
            int comp = (int) ((int) s1.getColor().price - s2.getColor().price);

            return comp;
        }
}
