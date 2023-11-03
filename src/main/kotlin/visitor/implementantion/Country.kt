package visitor.implementantion

import visitor.Element
import visitor.Visitor

class Country(val territorialExtension: Double): Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}