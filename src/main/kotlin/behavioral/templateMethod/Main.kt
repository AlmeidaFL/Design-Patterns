package behavioral.templateMethod

import java.awt.Desktop
import java.io.File
import java.net.URI
import java.nio.file.Paths

fun main(){
    var agnosticHTML: HTMLTemplate = InvestmentsReportHTMLTemplate()
    var investmentReport = agnosticHTML.generate()
    agnosticHTML = BlogHTMLTemplate()
    var blogText = agnosticHTML.generate()
}