package command.implementation

import command.Command

class TurnOffCommand: Command {
    override fun execute() {
        println("Turning off the device")
    }
}