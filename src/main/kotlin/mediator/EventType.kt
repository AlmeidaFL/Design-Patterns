package mediator

sealed class EventType(){
    data class Clicked(val latestParent: Colleague): EventType()
    data class Typed(val colleague: Colleague, val text: String?): EventType()
}