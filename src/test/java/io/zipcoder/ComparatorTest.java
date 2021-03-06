package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class ComparatorTest {
    MainApplication app = new MainApplication();

    @Test
    public void testCompareTo(){
        //Given
        String expected = "\nAlex says Meow!"+
                "\nBarry says Meow!"+
                "\nCornelius says Meow!"+
                "\nAlex says Bark!"+
                "\nBarry says Bark!"+
                "\nCornelius says Bark!"+
                "\nAlex says Coo!"+
                "\nBarry says Coo!"+
                "\nCornelius says Coo!";

        app.addPet(new Pigeon("Alex"));
        app.addPet(new Pigeon("Barry"));
        app.addPet(new Pigeon("Cornelius"));

        app.addPet(new Cat("Barry"));
        app.addPet(new Cat("Alex"));
        app.addPet(new Cat("Cornelius"));

        app.addPet(new Dog("Cornelius"));
        app.addPet(new Dog("Alex"));
        app.addPet(new Dog("Barry"));




        //When
        Collections.sort(app.petArrayList, new PetComparator<>());
        String actual = app.getPetInfo();

        //Then
        Assert.assertEquals(expected, actual);


    }


}
