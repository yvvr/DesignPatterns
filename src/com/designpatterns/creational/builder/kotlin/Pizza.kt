package com.designpatterns.creational.builder.kotlin

class Pizza : IPizzaMakingPlan {

    var crustType: Crust = Crust.FlatBreadCrust
    var size = 0
    var isNeedMozzarella = false
    var isNeedPepperoni = false
    var isNeedOlives = false
    var isNeedMushroom = false
    var isNeedCapsicum = false
    var isNeedOnions = false

    override fun eatPizza(): String {
        return """
            crustType: $crustType
            size: $size
            isNeedMozzarella: $isNeedMozzarella
            isNeedPepperoni: $isNeedPepperoni
            isNeedOlives: $isNeedOlives
            isNeedMushroom: $isNeedMushroom
            isNeedCapsicum: $isNeedCapsicum
            isNeedOnions: $isNeedOnions
            
            """.trimIndent()
    }
}