package behavioral.strategy

class Government() {
    private var taxCalculator: ITaxCalculator = NaturalPersonTaxCalculator()
    private var entityToBeTaxed: IContext? = null

    fun calculateTax(): Double{
        return taxCalculator.calculate(entityToBeTaxed!!)
    }

    fun setEntityToBeTaxed(entityToBeTaxed: IContext){
        this.entityToBeTaxed = entityToBeTaxed
    }

    fun setTaxCalculator(taxCalculator: ITaxCalculator){
        this.taxCalculator = taxCalculator
    }
}