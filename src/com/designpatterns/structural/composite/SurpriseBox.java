package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SurpriseBox extends BoxComponent{

    private final ArrayList<BoxComponent> boxComponents = new ArrayList<>();

    private final String boxName;

    public SurpriseBox(String boxName) {
        this.boxName = boxName;
    }

    @Override
    public void add(BoxComponent boxComponent) {
        boxComponents.add(boxComponent);
    }

    @Override
    public void remove(BoxComponent boxComponent) {
        boxComponents.remove(boxComponent);
    }

    @Override
    public BoxComponent getBoxComponent(int boxComponentIndex) {
        return boxComponents.get(boxComponentIndex);
    }

    @Override
    public String getProductName() {
        return boxName;
    }

    @Override
    public float getProductPrice() {

        Iterator<BoxComponent> boxIterator = boxComponents.iterator();
        float price = 0;

        while (boxIterator.hasNext()) {

            BoxComponent component = boxIterator.next();
            price += component.getProductPrice();
        }
        return price;
    }
}
