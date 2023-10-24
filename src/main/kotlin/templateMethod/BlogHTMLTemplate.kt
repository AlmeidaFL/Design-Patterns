package templateMethod

class BlogHTMLTemplate: HTMLTemplate() {
    override fun createContent() {
        builderHTMLTemplate.withTag("h1", "this is a blog")
    }
}