package memento.implementation

fun main() = run{
    val textEditor = TextEditor()
    println(textEditor.toString())
    val textEditorCaretaker = TextEditorCaretaker(textEditor)
    textEditorCaretaker.doCommand(ChangeTitleCommand("first"))
    println(textEditor.toString())
    textEditorCaretaker.doCommand(ChangeColorCommand("blue"))
    println(textEditor.toString())
    textEditorCaretaker.undoOriginatorState()
    println(textEditor.toString())
    textEditorCaretaker.undoOriginatorState()
    println(textEditor.toString())
}