package behavioral.mediator.implementation

import behavioral.mediator.IMediator

class Mediator: IMediator {
    override fun notify(eventType: EventType) = when(eventType) {
        is EventType.Clicked -> println("Clicked: Mediator notified")
        is EventType.Typed -> println("Typed: Mediator notified")
        else -> {
            println("Event type not expected")
        }
    }
}