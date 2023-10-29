package mediator.implementation

import mediator.Colleague
import mediator.EventType

class TextField(mediator: Mediator): Colleague(mediator) {
    private val text: String? = null

    fun onTyped(){
        println("User typed")
        mediator.notify(EventType.Typed(this, text))
    }
}