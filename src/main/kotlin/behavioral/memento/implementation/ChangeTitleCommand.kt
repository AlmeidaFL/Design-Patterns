package behavioral.memento.implementation

import behavioral.command.Command

class ChangeTitleCommand(val newTitle: String): Command {
    override fun execute(toBeChanged: Any?) {
        val originator = toBeChanged as TextEditor
        originator.title = newTitle
    }
}