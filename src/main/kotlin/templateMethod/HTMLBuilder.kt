package templateMethod

class HTMLBuilder {
    private var html: StringBuilder = StringBuilder()

    init {
        var pureHTML = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>Your page</title>
            </head>
            <body>
        """.trimIndent()
        html.append(pureHTML)
    }

    fun withTag(tag: String, content: String){
        html.append("<${tag}>")
        html.append(content)
        html.append("</${tag}>")
    }

    fun withContent(content: String){
        html.append(content)
    }

    fun getHTML(): String{
        html
            .append("</body>")
            .append("</html>")
        return html.toString()
    }
}