package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {



    @Test
    public void getFood() throws Exception {

        Lion lion = new Lion("Самец");
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        List<String> eatLion = lion.getFood("Хищник");
        Assert.assertEquals(eat, eatLion);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens(1);
        assertEquals(1, actual);
    }


    @Test
    public void doesHaveManeReturnCorrectValue() throws Exception {
        Lion lion = new Lion("Самец");
        boolean actual = true;
        boolean expected = lion.doesHaveMane();
        assertEquals(expected, actual);

    }

}
