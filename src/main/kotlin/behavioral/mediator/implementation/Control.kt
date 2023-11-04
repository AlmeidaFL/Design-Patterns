package behavioral.mediator.implementation

import behavioral.mediator.Colleague
import behavioral.mediator.IControl
import behavioral.mediator.ValidationResult

class Control(mediator: Mediator): Colleague(mediator), IControl {
    val children = mutableListOf<IControl>()

    override fun validate(): ValidationResult {
        for(child in children){
           if(child.validate() == ValidationResult.INVALID){
               return ValidationResult.INVALID
           }
        }
        return ValidationResult.VALID
    }
}