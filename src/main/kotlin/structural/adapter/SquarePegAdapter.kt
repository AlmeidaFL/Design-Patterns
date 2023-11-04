package structural.adapter

class SquarePegAdapter(val squarePeg: SquarePeg): RoundPeg(squarePeg.width) {
    override var radius: Double = squarePeg.width
        get(){
            return squarePeg.width * Math.sqrt(2.0) / 2
        }
}