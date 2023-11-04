package behavioral.visitor.implementantion

import behavioral.visitor.Element
import behavioral.visitor.Visitor

class InformationVisitor: Visitor {
    override fun visit(element: Element) {
        when(element){
            is Country -> println("Country territorial extension: ${element.territorialExtension}")
            is City -> println("Number of person of city ${element.name}: ${element.numberOfInhabitants}")
            is Village -> println("Number of houses of village ${element.name}: ${element.numberOfHouses}")
        }
    }
}