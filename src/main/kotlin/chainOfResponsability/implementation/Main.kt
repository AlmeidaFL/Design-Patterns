package chainOfResponsability.implementation

import chainOfResponsability.HandlerUtils

fun main() = run{
    var request = NewEmployeeRequest("Carlos", "JS Expert", "JS")
    var initialHandler = HandlerUtils.addHandler(
        HumanResourcesHandler(),
        CTOHandler(),
        TeamLeadHandler()
    )
    initialHandler.handle(request)
}