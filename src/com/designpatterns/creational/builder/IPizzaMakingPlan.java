package com.designpatterns.creational.builder;

public interface IPizzaMakingPlan {

    void setCrustType(Crust crust);

    void setSize(int noOfSlices);

    void setMozzarella(boolean needMozzarella);

    void setPepperoni(boolean needPepperoni);

    void setOlives(boolean needOlives);

    void setMushroom(boolean needMushroom);

    void setCapsicum(boolean needCapsicum);

    void setOnions(boolean needOnions);

    String eatPizza();
}
