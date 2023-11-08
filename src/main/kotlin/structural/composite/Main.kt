package structural.composite

fun main(){
    val boxHolder = BoxHolder().apply {
       purchases.add(BoxHolder().apply {
           purchases.addAll(
               listOf(
                   Product(1.2),
                   Product(4.0),
                   BoxHolder().also { it.purchases.add(Product(10.0)) }
               ),
           )
       })
        purchases.add(Product(22.0))
    }
    println(boxHolder.getPrice())
}