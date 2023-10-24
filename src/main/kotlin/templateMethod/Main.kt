package templateMethod

import java.awt.Desktop
import java.io.File
import java.net.URI
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.pathString

fun main(){
    var agnosticHTML: HTMLTemplate = InvestmentsReportHTMLTemplate()
    var path = FileSystems.getDefault().getPath("resources/temporaryhtml.html")

    try{
        path = Files.write(path, agnosticHTML.generate().toByteArray())
    }catch (e: Exception){
        println(e)
    }

    try{
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            val uri = URI(path.pathString)
            Desktop.getDesktop().browse(uri)
        } else {
            // If the desktop is not supported, you can provide an alternative behavior, such as displaying an error message.
            println("Desktop not supported or browsing not supported.")
        }
    } catch (e: Exception) {
        e.printStackTrace()
        // Handle any exceptions that may occur when opening the browser.
    }

    val file = File(path.pathString)
    if(file.exists()){
        try{
            file.delete()
        }catch (e: Exception){
            println(e)
        }
    }
}