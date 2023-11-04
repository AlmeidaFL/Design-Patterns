package structural.adapter

fun main() = run {
    val roundHole = RoundHole(10.0)
    println(roundHole.fits(RoundPeg(2.0)))
    println(roundHole.fits(SquarePegAdapter(SquarePeg(2.9))))
}