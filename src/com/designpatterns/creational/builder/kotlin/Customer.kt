package com.designpatterns.creational.builder.kotlin

class Customer(private val chef: Chef) {

    fun orderAndEatPizza() {
        // Get pepperoni pizza and eat.
        val pizza = chef.pepperoniPizza
        println("PepperoniPizza:" + pizza.eatPizza())

        // Get pepperoni pizza and eat.
        val pizza1 = chef.supremeVegPizza
        pizza1.eatPizza()
        println("SupremeVegPizza:" + pizza1.eatPizza())
    }
}