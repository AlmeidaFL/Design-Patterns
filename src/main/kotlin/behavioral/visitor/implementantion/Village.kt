package behavioral.visitor.implementantion

import behavioral.visitor.Element
import behavioral.visitor.Visitor

class Village(val numberOfHouses: Int, name: String): BaseConstruct(name), Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}