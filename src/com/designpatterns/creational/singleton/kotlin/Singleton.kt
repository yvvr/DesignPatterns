package com.designpatterns.creational.singleton.kotlin

import kotlin.jvm.Synchronized

object Singleton {

    @get:Synchronized
    var instance: Singleton? = null
        get() {
            if (field == null) {
                field = Singleton
            }
            return field
        }
        private set
}