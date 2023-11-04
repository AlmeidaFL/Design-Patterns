package behavioral.visitor.implementantion

import behavioral.visitor.Element
import behavioral.visitor.Visitor

class Country(val territorialExtension: Double): Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}