package behavioral.memento

import behavioral.command.Command

abstract class Caretaker<T>(private val originator: Originator<T>) {
    private val history = mutableListOf<Memento<T>>()

    fun undoOriginatorState(){
        originator.restore(history.removeLast())
    }

    fun doCommand(command: Command){
        val o = originator.save()
        history.add(o)
        command.execute(originator)
    }
}