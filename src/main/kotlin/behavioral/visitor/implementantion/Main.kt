package behavioral.visitor.implementantion

import behavioral.visitor.Element

fun main() = run{
    val informationVisitor = InformationVisitor()
    val constructs = listOf<Element>(City(10, "Maska"), Country(1234.2), Village(1, "Maskinha"))
    for (construct in constructs){
        construct.accept(informationVisitor)
    }
}