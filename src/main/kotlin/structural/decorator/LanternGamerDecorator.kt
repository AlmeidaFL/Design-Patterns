package structural.decorator

class LanternGamerDecorator(val lantern: BasicLantern): LanternDecorator(lantern) {
    override fun beforeOn() {
        println("Turning on gaming leds")
        super.beforeOn()
    }

    override fun beforeOff() {
        println("Turning off gaming leds")
        super.beforeOn()
    }
}