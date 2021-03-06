package com.example;

import java.util.List;



public class Lion extends Animal implements IFeline {

    Feline feline;
   public Lion(Feline feline) {
       this.feline = feline;
   }

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    @Override
    public int getKittens() {
        return feline.getKittens(1);
    }
    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;

    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
