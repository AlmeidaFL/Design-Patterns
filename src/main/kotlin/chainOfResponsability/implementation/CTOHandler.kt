package chainOfResponsability.implementation

import chainOfResponsability.BaseHandler

class CTOHandler: BaseHandler<NewEmployeeRequest>() {
    override fun handle(request: NewEmployeeRequest) {
        if(request.specialist == "JS Expert"){
            nextHandler?.handle(request)
        }
        println("You'll have to learn JS")
    }
}