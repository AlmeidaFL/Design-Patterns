package behavioral.mediator.implementation

import behavioral.mediator.Colleague

sealed class EventType(){
    data class Clicked(val latestParent: Colleague): EventType()
    data class Typed(val colleague: Colleague, val text: String?): EventType()
}