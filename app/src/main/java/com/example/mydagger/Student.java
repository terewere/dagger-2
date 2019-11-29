package com.example.mydagger;

import javax.inject.Inject;

public class Student {

    private String name;

    @Inject
    public Student() {

        this.name = "Shaibu Zachariyya";
    }


    public String getName() {
        return name;
    }
}
