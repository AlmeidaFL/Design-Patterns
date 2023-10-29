package mediator

interface IMediator {
    fun notify(eventType: EventType)
}