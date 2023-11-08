package behavioral.mediator

import behavioral.mediator.implementation.EventType

interface IMediator {
    fun notify(eventType: EventType)
}