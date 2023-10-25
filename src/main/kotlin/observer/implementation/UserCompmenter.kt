package observer.implementation

import observer.Context
import observer.Subscriber

class UserCompmenter: Subscriber {
    override fun update(context: Context) {
        println("Hello, user")
    }
}