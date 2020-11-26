package io.zipcoder;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }


    @Override
    public String speak(){
        return "Bark!";
    }

    @Override
    public int compareTo(Pet o) {
        if (this.getName().compareTo(o.getName()) == 0){//if the names are the same, break by type
            //we'll sort type alphabetically: pigeon is greater than dog, dog is greater than cat
            if (o instanceof Pigeon){
                return -1;
            }
            if (o instanceof Cat){
                return 1;
            }
            if (o instanceof Dog){
                return 0;
            }
        }
        // if the names aren't the same, sort lexicographically
        return this.getName().compareTo(o.getName());
    }
}
