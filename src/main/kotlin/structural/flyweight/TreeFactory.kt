package structural.flyweight

class TreeFactory {
    private val treesCache = mutableSetOf<TreeCore>()

    fun getTree(sprint: String, color: String, texture: String): TreeCore{
        var tree = treesCache.find { it -> it.color == color && it.sprint == sprint && it.texture == texture }
        if(tree == null){
            tree = TreeCore(sprint, color, texture)
            treesCache.add(tree)
        }
        return tree
    }

    fun treesQuantity() = treesCache.count()
}