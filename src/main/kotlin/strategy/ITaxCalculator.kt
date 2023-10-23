package strategy

interface ITaxCalculator {
    fun calculate(context: IContext): Double
}