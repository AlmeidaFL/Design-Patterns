package chainOfResponsability.implementation

import chainOfResponsability.BaseHandler

class TeamLeadHandler: BaseHandler<NewEmployeeRequest>() {
    override fun handle(request: NewEmployeeRequest) {
        println("If you favorite language is ${request.favoriteLanguage}, you'll be fine")
        nextHandler?.handle(request)
    }
}