package com.example;

import java.util.List;



public class Lion extends Animal implements IFeline {

    Feline feline;
    boolean hasMane;

    public Lion(Feline feline,String sex) throws Exception {
      this.feline=feline;
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
        return getKittens(1);
    }

    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane()  throws Exception {
         return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }
}
