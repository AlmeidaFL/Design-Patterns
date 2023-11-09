package structural.flyweight

class Tree(var x: Int = -1, var y: Int = -1, val canvas: Any, val treeCore: TreeCore) {
    fun draw(){
        treeCore.draw(canvas, x, y)
    }
}