package behavioral.strategy

class NaturalPersonTaxCalculator: ITaxCalculator {
    override fun calculate(context: IContext): Double {
        val person = context as NaturalPerson
        return person.heritage * 0.05 + person.numberOfDepedents * 0.03
    }
}