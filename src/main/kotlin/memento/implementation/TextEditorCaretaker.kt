package memento.implementation

import memento.Caretaker
import memento.Originator

class TextEditorCaretaker(val originator: Originator<TextEditor>): Caretaker<TextEditor>(originator) {

}