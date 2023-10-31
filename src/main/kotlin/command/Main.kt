package command

import command.implementation.TV
import command.implementation.TurnOffCommand
import command.implementation.TurnOnCommand

fun main() = run {
    val tv = TV().also {
        it.addCommand(TurnOnCommand())
        it.addCommand(TurnOffCommand())
    }
    tv.turnOn()
    tv.turnOff()
}