package observer

abstract class Publisher {
    val subscribers = mutableListOf<Subscriber>()

    fun addSubscriber(subscriber: Subscriber){
        subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: Subscriber){
        subscribers.remove(subscriber)
    }

    fun notifyAllSubscribers(context: Context){
        for(subscriber in subscribers){
            subscriber.update(context)
        }
    }
}
