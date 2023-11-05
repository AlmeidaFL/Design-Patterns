package structural.decorator

fun main() = run {
    val basicLantern = BasicLantern()
    val lanternGamerDecorator = LanternGamerDecorator(basicLantern)
    lanternGamerDecorator.on()
    lanternGamerDecorator.off()
}