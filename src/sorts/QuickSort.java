/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Comparator;
import models.Tshirt;

/**
 *
 * @author dimit
 */
public class QuickSort {
    
    public Tshirt[] sort(Tshirt[] array, int begin, int end, Comparator comparator) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end, comparator);
            sort(array, begin, partitionIndex - 1, comparator);
            sort(array, partitionIndex + 1, end, comparator);
        }
        return array;
    }
    private int partition(Tshirt arr[], int begin, int end, Comparator comparator) {
        Tshirt pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (comparator.compare(arr[j], pivot) < 0) {
                i++;
                Tshirt swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Tshirt swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }
    
    
}
