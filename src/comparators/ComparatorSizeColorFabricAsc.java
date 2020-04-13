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
public class ComparatorSizeColorFabricAsc implements Comparator<Tshirt>{
    
    @Override
        public int compare(Tshirt s1, Tshirt s2) {
            if ((s1.getSize().price - s2.getSize().price) != 0) {
                return s1.getSize().price - s2.getSize().price;
            }
            if (((s1.getSize().price - s2.getSize().price) == 0)) {
                return s1.getColor().price - s2.getColor().price;
            }
            if (((s1.getSize().price - s2.getSize().price) == 0) && ((s1.getColor().price - s2.getColor().price) == 0)) {
                return s1.getFabric().price - s2.getFabric().price;
            }
            return 0;
        }
}
