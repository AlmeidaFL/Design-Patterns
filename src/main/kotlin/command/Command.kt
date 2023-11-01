package command

interface Command {
    fun execute(toBeChanged: Any? = null)
}
