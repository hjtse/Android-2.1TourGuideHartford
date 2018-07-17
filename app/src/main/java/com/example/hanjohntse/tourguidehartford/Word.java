package com.example.hanjohntse.tourguidehartford;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Word {

    /**
     * Name
     */
    private String mName;

    /**
     * Address
     */
    private String mAddress;

    /**
     * Image resource ID
     */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param name            is the word in the Miwok language
     * @param address         is the word in a language that the user is already familiar with(such as English)
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }



    /**
     * Get the Miwok translation of the word.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}