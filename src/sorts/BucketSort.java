/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Tshirt;

/**
 *
 * @author dimit
 */
public class BucketSort {

    public int hash(int i, int max, int numberOfBuckets) {
        return (int) ((double) i / max * (numberOfBuckets - 1));
    }

    public List<List<Tshirt>> getBuckets(ArrayList<Tshirt> shirts) {

        final int numberOfBuckets = (int) Math.sqrt(shirts.size());
        List<List<Tshirt>> buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        return buckets;
    }

    public Tshirt findMax(ArrayList<Tshirt> shirts, Comparator comp) {
        Tshirt max = shirts.get(0);
        for (Tshirt i : shirts) {
            if (comp.compare(i, max) > 0) {
                max = i;
            }
        }
        return max;
    }

    public ArrayList<Tshirt> sortByOne(ArrayList<Tshirt> shirtsList, Comparator comp, String sortType) {
        Tshirt maxTshirt = findMax(shirtsList, comp);
        List<List<Tshirt>> buckets = getBuckets(shirtsList);
        if (sortType.equalsIgnoreCase("Size")) {
            shirtsList.forEach((i) -> {
                buckets.get(hash(i.getSize().ordinal(), maxTshirt.getSize().ordinal(), buckets.size())).add(i);
            });
        } else if (sortType.equalsIgnoreCase("Color")) {
            shirtsList.forEach((i) -> {
                buckets.get(hash(i.getColor().price, maxTshirt.getColor().price, buckets.size())).add(i);
            });
        } else if (sortType.equalsIgnoreCase("Fabric")) {
            shirtsList.forEach((i) -> {
                buckets.get(hash(i.getFabric().price, maxTshirt.getFabric().price, buckets.size())).add(i);
            });
        } else {
            return null;
        }
        buckets.forEach((bucket) -> {
            bucket.sort(comp);
        });
        ArrayList<Tshirt> sorted = new ArrayList<>();
        buckets.forEach((bucket) -> {
            sorted.addAll(bucket);
        });
        return sorted;
    }

    public ArrayList<Tshirt> sortByOneReversed(ArrayList<Tshirt> shirtsList, Comparator comp, String sortType) {
        Tshirt maxTshirt = findMax(shirtsList, comp);
        List<List<Tshirt>> buckets = getBuckets(shirtsList);
        if (sortType.equalsIgnoreCase("Size")) {
            shirtsList.forEach((i) -> {
                buckets.get(hash(i.getSize().ordinal(), maxTshirt.getSize().ordinal(), buckets.size())).add(i);
            });
        } else if (sortType.equalsIgnoreCase("Color")) {
            shirtsList.forEach((i) -> {
                buckets.get(hash(i.getColor().price, maxTshirt.getColor().price, buckets.size())).add(i);
            });
        } else if (sortType.equalsIgnoreCase("Fabric")) {
            shirtsList.forEach((i) -> {
                buckets.get(hash(i.getFabric().price, maxTshirt.getFabric().price, buckets.size())).add(i);
            });
        } else {
            return null;
        }

        buckets.forEach((bucket) -> {
            bucket.sort(comp.reversed());
        });
        ArrayList<Tshirt> sorted = new ArrayList<>();
        buckets.forEach((bucket) -> {
            sorted.addAll(0, bucket);
        });
        return sorted;
    }

    public ArrayList<Tshirt> sortByAll(ArrayList<Tshirt> shirtsList, Comparator comp) {
        Tshirt maxTshirt = findMax(shirtsList, comp);
        String maxCode = "";
        maxCode = maxCode + (int) maxTshirt.getSize().ordinal() + (int) maxTshirt.getColor().price + (int) maxTshirt.getFabric().price;
        int maxNumber = Integer.parseInt(maxCode);
        System.out.println(maxCode);
        List<List<Tshirt>> buckets = getBuckets(shirtsList);
        shirtsList.forEach((i) -> {
            String thisCode = "";
        thisCode = thisCode + (int) i.getSize().ordinal() + (int) i.getColor().price + (int) i.getFabric().price;
        int thisNumber = Integer.parseInt(thisCode);
            buckets.get(hash(thisNumber, maxNumber, buckets.size())).add(i);
        });
        buckets.forEach((bucket) -> {
            bucket.sort(comp);
        });
        ArrayList<Tshirt> sorted = new ArrayList<>();
        buckets.forEach((bucket) -> {
            sorted.addAll(bucket);
        });
        return sorted;
    }

    public ArrayList<Tshirt> sortByAllReversed(ArrayList<Tshirt> shirtsList, Comparator comp) {
        Tshirt maxTshirt = findMax(shirtsList, comp);
        String maxCode = "";
        maxCode = maxCode + (int) maxTshirt.getSize().ordinal() + (int) maxTshirt.getColor().price + (int) maxTshirt.getFabric().price;
        int maxNumber = Integer.parseInt(maxCode);
        System.out.println(maxCode);
        List<List<Tshirt>> buckets = getBuckets(shirtsList);
        shirtsList.forEach((i) -> {
            String thisCode = "";
        thisCode = thisCode + (int) i.getSize().ordinal() + (int) i.getColor().price + (int) i.getFabric().price;
        int thisNumber = Integer.parseInt(thisCode);
            buckets.get(hash(thisNumber, maxNumber, buckets.size())).add(i);
        });
        buckets.forEach((bucket) -> {
            bucket.sort(comp.reversed());
        });
        ArrayList<Tshirt> sorted = new ArrayList<>();
        buckets.forEach((bucket) -> {
            sorted.addAll(0,bucket);
        });
        return sorted;
    }
}
