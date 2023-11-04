package behavioral.mediator

import behavioral.mediator.implementation.Button
import behavioral.mediator.implementation.Mediator
import behavioral.mediator.implementation.TextField

fun main(){
    val mediator = Mediator()
    val button = Button(mediator)
    val textField = TextField(mediator)
    button.onClicked()
    textField.onTyped()
}