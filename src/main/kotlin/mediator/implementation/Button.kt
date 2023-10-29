package mediator.implementation

import mediator.Colleague
import mediator.EventType

class Button(mediator: Mediator): Colleague(mediator) {
    val latestParent: Control = Control(mediator)

    fun onClicked(){
        println("User clicked")
        mediator.notify(EventType.Clicked(latestParent))
    }
}