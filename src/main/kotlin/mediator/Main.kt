package mediator

import mediator.implementation.Button
import mediator.implementation.Mediator
import mediator.implementation.TextField

fun main(){
    val mediator = Mediator()
    val button = Button(mediator)
    val textField = TextField(mediator)
    button.onClicked()
    textField.onTyped()
}