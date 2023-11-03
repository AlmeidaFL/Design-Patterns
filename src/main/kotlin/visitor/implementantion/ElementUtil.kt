package visitor.implementantion

import visitor.Element
import visitor.Visitor

sealed class ElementUtil: Element {
    override fun accept(visitor: Visitor) {
       visitor.visit(this)
    }
}