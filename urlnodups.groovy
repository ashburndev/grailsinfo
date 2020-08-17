/*
// I need a UrlInfo class -- I should not assume that the entries are in time sort order

// UrlInfo should include urlFull, urlTrim, urlOrig, urlLower, urlTime (need to be able to sort on urlFull and urlTime)

// modify code to check that line starts with http

// modify code to look for line(s) starting with yyyyMMdd.hhmmss pattern

// modify code to check for datetime after url, and add datetime if not present

// modify code to be able to handle a "description" following the datetime
// https://www.youtube.com/watch?v=_Y1y8k-OTCQ 20200625.072915
// https://www.youtube.com/watch?v=_Y1y8k-OTCQ 20200625.072915 IntelliJ IDEA. Tips for Writing Code (2020)

text.size() = 76630
lineCountTotal = 1473
lineCount = 736
lineCountUnique = 536
lineCountDuplicate = 200
done
*/

String infileName = "C:\\Users\\David Holberton\\urlutils\\myurls20200612.txt"
String outfileName = "C:\\Users\\David Holberton\\urlutils\\myurls20200612nodups.txt"

File infile = new File(infileName)
File outfile = new File(outfileName)
String text = infile.text
// println text
int lineCountTotal = 0
int lineCount = 0
int lineCountUnique = 0
int lineCountDuplicate = 0
List urlLowerList = []
text.eachLine {urlLine, n ->
  lineCountTotal++
  String urlTrim = urlLine.trim()
  if (urlTrim) {
    lineCount++
    // println urlTrim
    def urlSplit = urlTrim.split(" ")  // really want to split on any whitespace character
    // println urlSplit.size()
    String urlOrig = urlSplit[0]
    String urlLower = urlOrig.toLowerCase()
    // if ((n > 0) && (urlLower.equals(urlLowerList))) {}
    if (!(urlLowerList.contains(urlLower))) {
      lineCountUnique++
      urlLowerList.add(urlLower)
      println urlTrim
      outfile.append(urlTrim + "\n")
    } else {
      lineCountDuplicate++
    }
    // urlLowerPrev = urlLower
  }
}
println "infileName = ${infileName}"
println "outfileName = ${outfileName}"
println "text.size() = ${text.size()}"
println "lineCountTotal = ${lineCountTotal}"
println "lineCount = ${lineCount}"
println "lineCountUnique = ${lineCountUnique}"
println "lineCountDuplicate = ${lineCountDuplicate}"
// infile.close()
// outfile.close()
println "done"
