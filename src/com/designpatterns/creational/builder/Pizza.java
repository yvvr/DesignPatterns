package com.designpatterns.creational.builder;

public class Pizza implements IPizzaMakingPlan {

    private Crust crustType;
    private int size;
    private boolean isNeedMozzarella;
    private boolean isNeedPepperoni;
    private boolean isNeedOlives;
    private boolean isNeedMushroom;
    private boolean isNeedCapsicum;
    private boolean isNeedOnions;

    @Override
    public void setCrustType(Crust crust) {
        crustType = crust;
    }

    @Override
    public void setSize(int noOfSlices) {
        size = noOfSlices;
    }

    @Override
    public void setMozzarella(boolean needMozzarella) {
        isNeedMozzarella = needMozzarella;
    }

    @Override
    public void setPepperoni(boolean needPepperoni) {
        isNeedPepperoni = needPepperoni;
    }

    @Override
    public void setOlives(boolean needOlives) {
        isNeedOlives = needOlives;
    }

    @Override
    public void setMushroom(boolean needMushroom) {
        isNeedMushroom = needMushroom;
    }

    @Override
    public void setCapsicum(boolean needCapsicum) {
        isNeedCapsicum = needCapsicum;
    }

    @Override
    public void setOnions(boolean needOnions) {
        isNeedOnions = needOnions;
    }

    @Override
    public String eatPizza() {
        return "crustType: "
                + crustType
                + "\n"
                + "size: "
                + size
                + "\n"
                + "isNeedMozzarella: "
                + isNeedMozzarella
                + "\n"
                + "isNeedPepperoni: "
                + isNeedPepperoni
                + "\n"
                + "isNeedOlives: "
                + isNeedOlives
                + "\n"
                + "isNeedMushroom: "
                + isNeedMushroom
                + "\n"
                + "isNeedCapsicum: "
                + isNeedCapsicum
                + "\n"
                + "isNeedOnions: "
                + isNeedOnions
                + "\n";
    }
}
