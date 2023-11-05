package structural.decorator

abstract class LanternDecorator(val wrappe: ILantern): ILantern {
    public override fun on(){
        beforeOn()
        wrappe.on()
        afterOn()
    }

    public override fun off(){
        beforeOff()
        wrappe.off()
        afterOff()
    }

    open fun beforeOn() {}
    open fun afterOn() {}
    open fun beforeOff() {}
    open fun afterOff() {}
}