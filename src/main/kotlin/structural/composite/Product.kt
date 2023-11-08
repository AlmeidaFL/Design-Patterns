package structural.composite

class Product(val actualPrice: Double): Purchase {
    override fun getPrice(): Double {
        return actualPrice
    }
}