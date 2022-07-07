package com.designpatterns.creational.builder.kotlin

class Chef : IChef {

    override val pepperoniPizza: Pizza
        get() = Pizza().apply {
            crustType = Crust.CheeseCrust
            isNeedPepperoni = true
            isNeedCapsicum = true
            isNeedMushroom = true
            size = 8
        }

    override val supremeVegPizza: Pizza
        get() = Pizza().apply {
            crustType = Crust.CheeseCrust
            isNeedMozzarella = true
            isNeedOlives = true
            isNeedMushroom = true
            size = 8
        }
}