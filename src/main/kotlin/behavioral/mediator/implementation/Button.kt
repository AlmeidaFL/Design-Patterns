package behavioral.mediator.implementation

import behavioral.mediator.Colleague

class Button(mediator: Mediator): Colleague(mediator) {
    val latestParent: Control = Control(mediator)

    fun onClicked(){
        println("User clicked")
        mediator.notify(EventType.Clicked(latestParent))
    }
}