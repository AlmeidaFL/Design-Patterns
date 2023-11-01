package memento

open class Memento<T>(val state: T){
    fun getState(): T{
        return state
    }
}