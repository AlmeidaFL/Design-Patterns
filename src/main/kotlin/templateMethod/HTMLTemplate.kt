package templateMethod

abstract class HTMLTemplate {
    private val headerTemplate: String = "templateMethod/resources/header.html"
    private val footerTemplate: String = "templateMethod/resources/content.html"
    protected val builderHTMLTemplate = HTMLBuilder()

    fun generate(): String{
        createHeader()
        createContent()
        createFooter()

        return builderHTMLTemplate.getHTML()
    }

    protected abstract fun createContent()

    private fun createHeader(){
        builderHTMLTemplate.withContent(HTMLFileConverter.getContent(headerTemplate))
    }

    private fun createFooter(){
        builderHTMLTemplate.withContent(HTMLFileConverter.getContent(footerTemplate))
    }
}