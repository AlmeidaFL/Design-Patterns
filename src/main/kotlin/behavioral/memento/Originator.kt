package behavioral.memento

interface Originator<T> {
    fun save(): Memento<T>
    fun restore(memento: Memento<T>)
}