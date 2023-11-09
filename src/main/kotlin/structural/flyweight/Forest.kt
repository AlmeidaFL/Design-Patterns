package structural.flyweight

class Forest {
    val trees = mutableSetOf<Tree>()
    val treeFactory = TreeFactory()

    fun plantTree(x: Int, y: Int, canvas: Any, color: String, sprint: String, texture: String){
        val treeCore = treeFactory.getTree(sprint, color, texture)
        trees.add(Tree(x, y, canvas, treeCore))
    }

    fun draw() = trees.forEach { it.draw() }

    fun treesCoreQuantity() = treeFactory.treesQuantity()
}