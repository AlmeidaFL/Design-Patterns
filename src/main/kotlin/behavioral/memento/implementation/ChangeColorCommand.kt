package behavioral.memento.implementation

import behavioral.command.Command

class ChangeColorCommand(val color: String): Command {
    override fun execute(toBeChanged: Any?) {
        val originator = toBeChanged as TextEditor
        originator.color = color
    }
}