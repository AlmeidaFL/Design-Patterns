package command

import kotlin.reflect.KClass

abstract class Invoker{
    private val commands = mutableListOf<Command>()

    protected fun <T: Command> executeCommand(desiredCommand: KClass<T>){
        val command = commands.firstOrNull{c -> c::class == desiredCommand}
        if(command == null) throw NullPointerException() else command.execute()
    }

    fun addCommand(command: Command) = commands.add(command)
}