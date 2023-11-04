package behavioral.chainOfResponsability

class HandlerUtils {
    companion object{
        fun <T> addHandler(vararg handlers: BaseHandler<T>): BaseHandler<T> {
            for(i in 1 until handlers.size){
                handlers[i-1].nextHandler = handlers[i]
            }

            return handlers[0]
        }
    }
}