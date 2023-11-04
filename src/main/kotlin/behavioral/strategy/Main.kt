package behavioral.strategy

fun main(){
    var person = object : NaturalPerson {
        override var numberOfDepedents = 5
        override var heritage = 83.169_2
    }
    var government = Government()
    government.setEntityToBeTaxed(person)
    var personTax = government.calculateTax()

    var entity = object : LegalEntity {
        override var name = "Workers of lol"
        override var heritage = 831.312_222
        override var numberOfCoworkers = 3
    }
    government.setEntityToBeTaxed(entity)
    government.setTaxCalculator(LegalEntityTaxCalculator())
    var entityTax = government.calculateTax()
}