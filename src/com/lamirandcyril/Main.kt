package com.lamirandcyril

import com.lamirandcyril.model.Programme

object Main {

    val obj = Programme()
    val animals = mutableListOf("cat", "dog", "bird", "horse", "cow", "tiger", "zebra")

    @JvmStatic
    fun main(args: Array<String>) {

        var user: Int
        var prog: Int

        user = 0
        prog = 1

        obj.initialisation()

        for (value in animals) {
            print("$value, ")
        }

        println()

        obj.showcmd()

        do {
            print("[INPUT] Your command : ")
            val stringInput = readLine()!!
            userInput(stringInput)
            if (stringInput == "ending") {
                prog = 0
            }
        } while (user != prog)
    }

    fun userInput(stringInput: String) {

        val creation    = stringInput.startsWith("create ")
        val animal      = stringInput.startsWith("animal")
        val playsound   = stringInput.startsWith("playsound ")
        val delete      = stringInput.startsWith("delete ")
        val ending      = stringInput.startsWith("ending")
        val sayhello    = stringInput.startsWith("sayhello ")

        if (creation) {

            val txt1 = stringInput.replace("\\s".toRegex(), "")
            var txt2 = txt1.removePrefix("create")
            var txt3 = txt2.toLowerCase()
            val existingAnimals = animals.contains(txt3)

            when (existingAnimals) {
                true -> { println("[ERROR] Animal already registered !")}
                false -> {
                    println("[PROGRAM] New animal detected...")
                    println("[PROGRAM] ${txt3.toUpperCase()} is now registered !")
                    animals.add(txt3)
                }
            }
        } else if (animal) {

            var animalCount :Int = 0

            println("[PROGRAM] Let see all the animals !")
            for (value in animals) {
                animalCount++
                println("[ANIMAL] ${value.toUpperCase()}")
            }
            if (animalCount == 0) {
                println("[PROGRAM] There is no animals here !")
            } else {
                println("[PROGRAM] The family ($animalCount) is complete ! I'm done.")
            }
        } else if (playsound) {

            val txt1 = stringInput.replace("\\s".toRegex(), "")
            var txt2 = txt1.removePrefix("playsound")
            var txt3 = txt2.toLowerCase()
            val existingAnimals = animals.contains(txt3)

            when (existingAnimals) {
                true -> {
                    println("[ANIMAL] [SOUND] the ${txt3.toUpperCase()} is sounding like a rockstar !")
                }
                false -> { println("[ERROR] No such animal in my petshop !") }
            }
        } else if (delete) {

            val txt1 = stringInput.replace("\\s".toRegex(), "")
            var txt2 = txt1.removePrefix("delete")
            var txt3 = txt2.toLowerCase()
            val existingAnimals = animals.contains(txt3)

            when (existingAnimals) {
                true -> {
                    println("[PROGRAM] the ${txt3.toUpperCase()} has been remove !")
                    animals.remove(txt3)
                }
                false -> { println("[ERROR] No such animal in my petshop !") }
            }
        } else if (sayhello) {

            val txt1 = stringInput.replace("\\s".toRegex(), "")
            var txt2 = txt1.removePrefix("sayhello")
            var txt3 = txt2.toLowerCase()
            val existingAnimals = animals.contains(txt3)

            when (existingAnimals) {
                true -> {
                    println("[PROGRAM] the ${txt3.toUpperCase()} say hello to you !")
                }
                false -> { println("[ERROR] No such animal in my petshop !") }
            }
        } else if (ending) { println("[PROGRAM] You close the program ! See you later !") }

        else { println("[PROGRAM] Unexpected command...")}
    }
}