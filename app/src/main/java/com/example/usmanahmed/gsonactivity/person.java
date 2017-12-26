package com.example.masroor.gsonactivity;

/**
 * Created by masroor on 04/10/2017.
 */

public class person {
    private String name;
    private String number;
    person(String name,String number)
    {
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
