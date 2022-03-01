package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getFood() throws Exception {

            Feline feline = new Feline();
            List<String> eat = List.of("Животные", "Птицы", "Рыба");
            List<String> eatFeline = feline.eatMeat();
            Assert.assertEquals(eat, eatFeline);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(1);
        assertEquals(1, actual);
    }

}