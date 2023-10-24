package templateMethod

class InvestmentsReportHTMLTemplate: HTMLTemplate() {
    init {
        createContent()
    }

    override fun createContent() {
        builderHTMLTemplate.withTag("h1", "This is an investment report")
    }
}