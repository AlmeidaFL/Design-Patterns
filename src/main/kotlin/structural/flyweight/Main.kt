package structural.flyweight

fun main(){
    val forest = Forest().apply {
        plantTree(1, 1, "canvas", "blue", "tree.jpg", "smooth")
        plantTree(10, 17, "canvas", "yellow", "tree.jpg", "soft")
        plantTree(45, 33, "canvas", "red", "tree.jpg", "crispy")
        plantTree(11, 12, "canvas", "blue", "tree.jpg", "smooth")
    }

    println(forest.treesCoreQuantity())
}