package com.sparta;

import java.text.ParseException;

public class Starter {

    public static void runStarter() throws CatException {
        Cat newCat = new Cat();

        System.out.println(newCat.meow("Fudge"));
//        System.out.println(newCat.meow(null));

//        System.out.println(newCat.convertToDate("2022-09-14"));
    }



}
