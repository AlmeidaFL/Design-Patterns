package visitor.implementantion

import visitor.Element
import visitor.Visitor

class City(var numberOfInhabitants: Int, name: String): BaseConstruct(name),Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}