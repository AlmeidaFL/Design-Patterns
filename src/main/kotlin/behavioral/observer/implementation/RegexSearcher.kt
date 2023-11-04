package behavioral.observer.implementation

import behavioral.observer.Context
import behavioral.observer.Subscriber

class RegexSearcher: Subscriber {
    override fun update(context: Context) {
        val userInput = context.getRelevantObject() as? String
        if(userInput != null){
            var matches = Regex("a").matches(userInput)
            if(matches){
                println("There're 'a's in your input")
            }
        }
    }
}