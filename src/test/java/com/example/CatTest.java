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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

    public class CatTest {

        @Mock Feline feline;

        @Test
        public void getSoundTest() {
            Cat cat = new Cat(feline);
            String expectedSound = "Мяу";
            assertEquals(expectedSound, cat.getSound());
        }

        @Test
        public void getFoodTest() throws Exception {
            Cat cat = new Cat(feline);
            Mockito.when(cat.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
            List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
            List<String> actualEatMeat = cat.getFood();
            assertEquals(expectedEatMeat, actualEatMeat);
        }

    }
