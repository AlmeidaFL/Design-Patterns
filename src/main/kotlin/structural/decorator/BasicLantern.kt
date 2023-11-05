package structural.decorator

class BasicLantern: ILantern {
    override fun on(){
        println("Light on")
    }

    override fun off(){
        println("Light off")
    }
}