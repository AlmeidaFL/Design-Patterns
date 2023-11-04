package behavioral.strategy

interface ITaxCalculator {
    fun calculate(context: IContext): Double
}