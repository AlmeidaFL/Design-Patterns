package structural.composite

class BoxHolder: Purchase {
    val purchases = mutableListOf<Purchase>()

    override fun getPrice(): Double = purchases.sumOf { it.getPrice() }
}