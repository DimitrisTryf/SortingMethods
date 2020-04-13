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
public class ComparatorSizeColorFabricDesc implements Comparator<Tshirt>{
    
    @Override
        public int compare(Tshirt s1, Tshirt s2) {
             if ((s2.getSize().price - s1.getSize().price) != 0) {
                return s2.getSize().price - s1.getSize().price;
            }
            if (((s2.getSize().price - s1.getSize().price) == 0)) {
                return s2.getColor().price - s1.getColor().price;
            }
            if (((s2.getSize().price - s1.getSize().price) == 0) && ((s2.getColor().price - s1.getColor().price) == 0)) {
                return s2.getFabric().price - s1.getFabric().price;
            }
            return 0;
        }
}
