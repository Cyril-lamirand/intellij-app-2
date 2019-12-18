package com.lamirandcyril.model

class Programme {

    fun initialisation() {
        println("[PROGRAM] Started : IntelliJ-APP-2")
        println("[PROGRAM] Initializing animals...")
        print("[PROGRAM] Default animals : ")
    }

    fun showcmd() {
        println("[PROGRAM] ------------ REGISTERED COMMANDS ------------")
        println("[CMD] Write 'animal' to see all animals.")
        println("[CMD] Write 'create NameOfAnimal' to create an animal.")
        println("[CMD] Write 'playsound NameOfAnimal' to making sound the pet.")
        println("[CMD] Write 'sayhello NameOfAnimal' to make animal say hello to you.")
        println("[CMD] Write 'delete NameOfAnimal' to delete & kill an animal.")
        println("[CMD] Write 'ending' to close the program.")
        println("[PROGRAM] ----------------------------------------------")
    }
}