package structural.adapter

class RoundHole(val radius: Double) {

    fun fits(peg: RoundPeg): Boolean{
        return radius >= peg.radius
    }
}