package behavioral.chainOfResponsability.implementation

import behavioral.chainOfResponsability.BaseHandler

class TeamLeadHandler: BaseHandler<NewEmployeeRequest>() {
    override fun handle(request: NewEmployeeRequest) {
        println("If you favorite language is ${request.favoriteLanguage}, you'll be fine")
        nextHandler?.handle(request)
    }
}