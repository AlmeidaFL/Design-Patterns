package behavioral.command.implementation

import behavioral.command.Command

class TurnOffCommand: Command {
    override fun execute(any: Any?) {
        println("Turning off the device")
    }
}