package com.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    @Mock
    Feline feline;

      @Test
    public void checkedGetSound() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals("Мяу", actual);
    }

    @Test
        public void getFoodReturnList() throws Exception {
        Cat cat = new Cat(feline);
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        List<String> eatCat = cat.predator.eatMeat();
        Assert.assertEquals(eat, eatCat);
    }
}