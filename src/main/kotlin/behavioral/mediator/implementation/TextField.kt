package behavioral.mediator.implementation

import behavioral.mediator.Colleague

class TextField(mediator: Mediator): Colleague(mediator) {
    private val text: String? = null

    fun onTyped(){
        println("User typed")
        mediator.notify(EventType.Typed(this, text))
    }
}