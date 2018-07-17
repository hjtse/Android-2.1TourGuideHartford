package com.example.hanjohntse.tourguidehartford;

/**
 * Created by Cansu on 10.04.2018.
 */

public class Place {

    private String mNameOfPlace;
    private String mAddress;
    private int mImageResourceId;

    //Public constructor of the Place object for Popular Places and Museums:

    public Place(String nameOfPlace, String address, int imageResourceId){

        mNameOfPlace = nameOfPlace;
        mAddress = address;
        mImageResourceId = imageResourceId;

    }


    public String getNameOfPlace(){

        return mNameOfPlace;
    }

    public String getAddress(){

        return mAddress;
    }


    public int getImageResourceId() {

        return mImageResourceId;
    }

}
