package command.implementation

import command.Command

class TurnOnCommand: Command {
    override fun execute(any: Any?) {
        println("Turning on the device")
    }
}
