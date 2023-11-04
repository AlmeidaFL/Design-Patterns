package behavioral.visitor

interface Element {
    fun accept(visitor: Visitor)
}
