package com.sparta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat {
    public String meow(String name) throws CatException{
        try{
            throw new CatException("OH NO!");
            //name = name.toUpperCase();
            //return name + " MEOW!";
        } catch (NullPointerException e) {
            e.printStackTrace();
//        } catch(Exception e) {
//            e.printStackTrace();
        } finally {
            System.out.println("This always executes");
        }
        return null;
    }

    public Date convertToDate(String s) {
        Date result;
        try {
            s.toUpperCase();
            result = new SimpleDateFormat().parse(s);
        } catch (ParseException | NullPointerException e){
                                                // exceptions here cannot be related by inheritance
                                                // e is implicitly final
            e.printStackTrace();
            result = null;
        }
        return result;
    }
}
