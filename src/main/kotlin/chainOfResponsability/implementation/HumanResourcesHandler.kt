package chainOfResponsability.implementation

import chainOfResponsability.BaseHandler

class HumanResourcesHandler: BaseHandler<NewEmployeeRequest>() {
    override fun handle(request: NewEmployeeRequest) {
        println("Hello ${request.name}. I'm from People's team")
        nextHandler?.handle(request)
    }
}