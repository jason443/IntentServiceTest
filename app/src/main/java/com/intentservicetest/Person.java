package com.intentservicetest;

/**
 * Created by ASUS on 2016/7/13.
 */
public class Person {

    private String personName;
    private int personId;
    private int personPhoto;

    public Person(String personName, int personId, int personPhoto) {
        this.personName = personName;
        this.personId = personId;
        this.personPhoto = personPhoto;
    }

    public String getPersonName() {
        return personName;
    }

    public int getPersonId() {
        return personId;
    }

    public int getPersonPhoto() {
        return personPhoto;
    }

}
