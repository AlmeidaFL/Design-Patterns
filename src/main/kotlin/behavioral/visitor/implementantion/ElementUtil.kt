package behavioral.visitor.implementantion

import behavioral.visitor.Element
import behavioral.visitor.Visitor

sealed class ElementUtil: Element {
    override fun accept(visitor: Visitor) {
       visitor.visit(this)
    }
}