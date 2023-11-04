package behavioral.memento.implementation

import behavioral.memento.Caretaker
import behavioral.memento.Originator

class TextEditorCaretaker(val originator: Originator<TextEditor>): Caretaker<TextEditor>(originator) {

}