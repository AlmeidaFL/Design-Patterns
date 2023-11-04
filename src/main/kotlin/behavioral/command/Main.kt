package behavioral.command

import behavioral.command.implementation.TV
import behavioral.command.implementation.TurnOffCommand
import behavioral.command.implementation.TurnOnCommand

fun main() = run {
    val tv = TV().also {
        it.addCommand(TurnOnCommand())
        it.addCommand(TurnOffCommand())
    }
    tv.turnOn()
    tv.turnOff()
}