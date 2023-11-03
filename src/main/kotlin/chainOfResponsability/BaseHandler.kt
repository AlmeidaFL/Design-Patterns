package chainOfResponsability

abstract class BaseHandler<T> {
    var nextHandler: BaseHandler<T>? = null

    abstract fun handle(request: T)
}