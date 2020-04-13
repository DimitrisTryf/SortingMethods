/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes;

import comparators.ComparatorColorAsc;
import comparators.ComparatorFabricAsc;
import comparators.ComparatorSizeAsc;
import comparators.ComparatorSizeColorFabricAsc;
import comparators.ComparatorSizeColorFabricDesc;
import java.util.ArrayList;
import java.util.Arrays;
import models.Tshirt;
import payment.*;
import product.*;
import sorts.BubbleSort;
import sorts.BucketSort;
import sorts.QuickSort;

/**
 *
 * @author dimit
 */
public class Clothes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creation of list
        Tshirt[] shirts = new Tshirt[40];
        for (int i = 0; i < shirts.length; i++) {
            shirts[i] = new Tshirt(Color.getRandomColor(), Size.getRandomFabric(), Fabric.getRandomFabric(), new Card());
        }

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quicksort = new QuickSort();
        BucketSort bucketSort = new BucketSort();

        System.out.println("\n--------------------------Size ASC-------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorSizeAsc());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorSizeAsc());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByOne(new ArrayList<>(Arrays.asList(shirts)), new ComparatorSizeAsc(), "size"));

        System.out.println("\n-------------------------Size DESC-------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorSizeAsc().reversed());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorSizeAsc().reversed());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByOneReversed(new ArrayList<>(Arrays.asList(shirts)), new ComparatorSizeAsc(), "size"));

        System.out.println("\n--------------------------Color ASC------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorColorAsc());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorColorAsc());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByOne(new ArrayList<>(Arrays.asList(shirts)), new ComparatorColorAsc(), "color"));

        System.out.println("\n--------------------------Color DESC------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorColorAsc().reversed());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorColorAsc().reversed());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByOneReversed(new ArrayList<>(Arrays.asList(shirts)), new ComparatorColorAsc(), "color"));

        System.out.println("\n--------------------------Fabric ASC------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorFabricAsc());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorFabricAsc());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByOne(new ArrayList<>(Arrays.asList(shirts)), new ComparatorFabricAsc(), "Fabric"));

        System.out.println("\n--------------------------Fabric DESC------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorFabricAsc().reversed());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorFabricAsc().reversed());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByOneReversed(new ArrayList<>(Arrays.asList(shirts)), new ComparatorFabricAsc(), "Fabric"));
        
        System.out.println("\n--------------------------All ASC------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorSizeColorFabricAsc());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorSizeColorFabricAsc());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByAll(new ArrayList<>(Arrays.asList(shirts)), new ComparatorSizeColorFabricAsc()));

        System.out.println("\n--------------------------All DESC------------------------------");
        System.out.println("\n----------BubleSort----------");
        bubbleSort.sort(shirts, new ComparatorSizeColorFabricDesc());
        printTshirtList(shirts);
        System.out.println("\n----------QuickSort----------");
        quicksort.sort(shirts, 0, shirts.length - 1, new ComparatorSizeColorFabricDesc());
        printTshirtList(shirts);
        System.out.println("\n----------BucketSort----------");
        printTshirtList(bucketSort.sortByAllReversed(new ArrayList<>(Arrays.asList(shirts)), new ComparatorSizeColorFabricAsc()));
    }

    public static void printTshirtList(Tshirt[] shirts) {
        for (Tshirt i : shirts) {
            System.out.println(i.toString());

        }
    }

    public static void printTshirtList(ArrayList<Tshirt> shirts) {
        shirts.forEach((i) -> {
            System.out.println(i.toString());
        });
    }
}
