package com.example.android.inclassassigment06_christinab;

import java.io.Serializable;

public class Animals implements Serializable {
    // has 4 instance variables to collect data (3 String, 1 boolean)
    private String nameText;
    private String legsText;
    private String moreInfoText;
    private boolean hasFur;

    // has constructor accepting all as parameters
    public Animals(String nameText, String legsText, String moreInfoText, boolean hasFur ){
        this.nameText = nameText;
        this.legsText = legsText;
        this.moreInfoText = moreInfoText;
        this.hasFur = hasFur;
    }
    // can easily create getters and setters
    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    public String getLegsText() {
        return legsText;
    }

    public void setLegsText(String legsText) {
        this.legsText = legsText;
    }

    public String getMoreInfoText() {
        return moreInfoText;
    }

    public void setMoreInfoText(String moreInfoText) {
        this.moreInfoText = moreInfoText;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }








    // has a toString() that returns something like: "Animal Type/Name: " + animalName + "\nNumber of Legs:


  /*  @Override
    public String toString() {
        return super.toString("Animal Type/Name" + nameText + "\nNumber of Legs: " + legsText + "\nDoes it have fur? " + hasFur + "\nExtra Information: " + moreInfoText);
    }*/


}