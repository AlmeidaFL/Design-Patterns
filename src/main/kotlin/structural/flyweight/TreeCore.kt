package structural.flyweight

class TreeCore(val sprint: String, val color: String, val texture: String) {
    fun draw(canvas: Any, x: Int, y: Int){
        println("Drawing tree")
    }
}