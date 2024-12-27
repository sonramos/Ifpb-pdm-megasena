package com.example.megasena20242.modelo

class MegaSena {

    val numeros: MutableSet<Int> = mutableSetOf()

    init {
        setNumeros()
    }

    private fun setNumeros() {
        while (numeros.size < 6) {
            numeros.add((1..60).random())
        }
    }

    override fun toString(): String {
        return this.numeros.toString()
    }
}