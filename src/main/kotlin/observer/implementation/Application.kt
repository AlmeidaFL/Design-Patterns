import observer.Context
import observer.Publisher
import observer.implementation.RegexSearcher
import observer.implementation.UserCompmenter
import java.util.Scanner

class Application: Publisher(){
    var userInput: String? = null

    init{
        addSubscriber(RegexSearcher())
        addSubscriber(UserCompmenter())
    }

    fun start(){
        var scanner = Scanner(System.`in`)
        while (true){
            userInput = scanner.nextLine()
            var context = object : Context {
                override fun getRelevantObject(): Any {
                    return userInput!!
                }
            }
            notifyAllSubscribers(context)
        }
    }
}