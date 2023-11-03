package visitor.implementantion

import visitor.Element
import visitor.Visitor

class Village(val numberOfHouses: Int, name: String): BaseConstruct(name), Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}