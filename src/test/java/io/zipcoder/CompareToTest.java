package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class CompareToTest {
    MainApplication app = new MainApplication();

    @Test
    public void testCompareTo(){
        //Given
        String expected = "\nAlex says Meow!"+
                "\nAlex says Bark!"+
                "\nAlex says Coo!"+
                "\nBarry says Meow!"+
                "\nBarry says Bark!"+
                "\nBarry says Coo!"+
                "\nCornelius says Meow!"+
                "\nCornelius says Bark!"+
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
        Collections.sort(app.petArrayList);
        String actual = app.getPetInfo();

        //Then
        Assert.assertEquals(expected, actual);


    }


}
