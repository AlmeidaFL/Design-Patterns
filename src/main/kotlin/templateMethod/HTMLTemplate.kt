package templateMethod

abstract class HTMLTemplate {
    protected val builderHTMLTemplate = HTMLBuilder()

    fun generate(): String{
        createHeader()
        createContent()
        createFooter()

        return builderHTMLTemplate.getHTML()
    }

    protected abstract fun createContent()

    private fun createHeader(){
        builderHTMLTemplate
            .withTag("p", "header")
    }

    private fun createFooter(){
        builderHTMLTemplate
            .withTag("p", "footer")
    }
}