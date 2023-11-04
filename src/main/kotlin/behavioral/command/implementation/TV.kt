package behavioral.command.implementation

import behavioral.command.Invoker

class TV: Invoker() {
    fun turnOn(){
        println("Turn on method")
        executeCommand(TurnOnCommand::class)
    }

    fun turnOff(){
        println("Turn off method")
        executeCommand(TurnOffCommand::class)
    }
}