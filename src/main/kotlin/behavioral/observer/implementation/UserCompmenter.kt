package behavioral.observer.implementation

import behavioral.observer.Context
import behavioral.observer.Subscriber

class UserCompmenter: Subscriber {
    override fun update(context: Context) {
        println("Hello, user")
    }
}