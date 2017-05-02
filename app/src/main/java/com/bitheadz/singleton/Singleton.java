package com.bitheadz.singleton;

/**
 * Created by ANDROCODER on 02.05.2017..
 */

public class Singleton {

    private static Singleton oneInstance = null;
    private String valueString;

    //no outer class can initialize object of this class
    private Singleton(){
        valueString = "Hello";
    }

    public static Singleton getInstance() {

        //if no instance is initialized yet then create new instance
        //else return stored instance
        if(oneInstance == null){
            oneInstance = new Singleton();
        }
        return oneInstance;

    }

    public String getString(){
        return this.valueString;
    }

    public void setString(String value){
        valueString = value;
    }
}
