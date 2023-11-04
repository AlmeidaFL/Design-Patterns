package behavioral.memento.implementation

import behavioral.memento.Memento
import behavioral.memento.Originator


class TextEditor: Originator<TextEditor> {
    var title = "Default title"
    var body = "Default body"
    var color = "Blue"

    fun copy() = TextEditor().also {
        it.title = title
        it.body = body
        it.color = color
    }

    override fun save(): Memento<TextEditor> {
        return Memento(this.copy())
    }

    override fun restore(memento: Memento<TextEditor>) {
        memento.let {
            title = it.state.title
            body = it.state.body
            color = it.state.color
        }
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