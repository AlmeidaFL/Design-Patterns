package command.implementation

import command.Command

class TurnOnCommand: Command {
    override fun execute() {
        println("Turning on the device")
    }
}
