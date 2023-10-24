package templateMethod

import java.io.File

class HTMLFileConverter {
    companion object {
        fun getContent(path: String): String{
            var file = File(path)
            return file.readText()
        }
    }
}