package command.implementation

import command.Command

class TurnOffCommand: Command {
    override fun execute(any: Any?) {
        println("Turning off the device")
    }
}