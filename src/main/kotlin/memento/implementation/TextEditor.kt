package memento.implementation

import memento.Memento
import memento.Originator

class TextEditor: Originator<TextEditor> {
    var title = "Default title"
    var body = "Default body"
    var color = "Blue"

    override fun save(): Memento<TextEditor> {
        return object : Memento<TextEditor>(this){

        }
    }

    override fun restore(memento: Memento<TextEditor>) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        var stringBuilder = StringBuilder().also {
            it.appendLine(title)
            it.appendLine(body)
            it.appendLine(color)
        }

        return stringBuilder.toString()
    }
}