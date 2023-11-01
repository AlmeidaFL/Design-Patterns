package memento

import command.Command

abstract class Caretaker<T>(private val originator: Originator<T>) {
    private val history = mutableListOf<Memento<T>>()

    fun undoOriginatorState(){
        originator.restore(history.removeLast())
    }

    fun doCommand(command: Command){
        history.add(originator.save())
        command.execute(originator)
    }
}