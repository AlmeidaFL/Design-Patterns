package behavioral.strategy

class LegalEntityTaxCalculator: ITaxCalculator {
    override fun calculate(context: IContext): Double {
        var legalEntity = context as LegalEntity
        return legalEntity.heritage * 0.15 + legalEntity.numberOfCoworkers * 0.05
    }
}