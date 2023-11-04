package behavioral.command.implementation

import behavioral.command.Command

class TurnOnCommand: Command {
    override fun execute(any: Any?) {
        println("Turning on the device")
    }
}
