package io.zipcoder;

import java.util.Comparator;

public class PetComparator<T extends Pet> implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        //break ties first
        if (o1.getClass().equals(o2.getClass())){
            return o1.getName().compareTo(o2.getName());
        }
        if (o1 instanceof Cat){
                return -1; // ties are already handled and Cat is always the smallest
        }
        if (o1 instanceof Dog){
            if (o2 instanceof Pigeon){
                return -1;
            }
            return 1; // ties are already handled and Dog is between Pigeon and Cat
        }
        if (o1 instanceof Pigeon){
            return 1; // ties are already handled and Pigeon is always the largest
        }

        return 0;
    }
}
