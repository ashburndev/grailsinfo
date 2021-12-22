7:53 AM 12/22/2021

import java.lang.*
import java.util.*
import java.text.*

def myurlstext = """
https://aaa.com/an-informative-web-page.html 20211221.053000
https://aaa.com/an-informative-web-page.html 20211220.183000 same as above, but with an earlier date
https://bbb.com/another-informative-web-page.html 20211221.053001
https://bbb.com/another-informative-web-page.html 20211221.053001 same as above, but with comment
https://ccc.com/yet-another-informative-web-page.html 20211221.053002 info about groovy inner classes
https://www.baeldung.com/groovy-string-to-date 20211221.053004
https://aaa.com/an-informative-web-page.html 20211221.053005 same URL as first line, but viewed again at a later date
https://yyy.com/ some comment"""

class LineInfo implements Comparable<LineInfo> {
    String origLine
    String trimLine
    String origUrl
    String lowerUrl
    String whenViewed
    Date viewDate
    String comment

    @Override
    int compareTo(LineInfo o) {
        int retval = 0
        if (viewDate == null) {
            if (o.viewDate != null) {
                retval = 1
            }
        } else {
            if (o.viewDate == null) {
                retval = -1
            } else {
                retval = viewDate.compareTo(o.viewDate)
                if (retval == 0) {
                    // do a secondary sort on lowerUrl or comment (or both)
                }
            }
        }
        retval
    }
}

def parseLine(String line) {
    def retval = null
    def pattern = "yyyyMMdd.HHmmss"
    def sdf = new SimpleDateFormat(pattern)
    println line
    if (line) {
        String s = line.trim()
        if (s) {
            retval = new LineInfo()
            retval.origLine = line
            retval.trimLine = s
            def sa = s.split(' ');
            /*
            println "s = $s"
            println "sa = $sa"
            println "sa.getClass().getName() = ${sa.getClass().getName()}"
            sa.eachWithIndex {it, index ->
              println "  value " + it + " at index " + index
              int lengthOfIt = it.length()
              // println "  lengthOfIt = $lengthOfIt"
              int sIndexOfIt = s.indexOf(it)
              // println "  sIndexOfIt = $sIndexOfIt"
              println "  lengthOfIt = ${lengthOfIt}  sIndexOfIt = ${sIndexOfIt}  s.substring(sIndexOfIT) = ${s.substring(sIndexOfIt)}"
            }
            */
            println "  sa.length = ${sa.length}"
            // might want to check if sa[0] starts with http or https
            retval.origUrl = sa[0]
            retval.lowerUrl = sa[0].toLowerCase()
            retval.origUrl = null
            retval.whenViewed = null
            retval.viewDate = null
            retval.comment = null
            if (sa.length > 1) {
                def date = null
                try {
                    date = sdf.parse(sa[1])
                    println "  date = $date"
                } catch (java.text.ParseException pe) {
                    // println pe
                }
                int indexOfComment = 0
                if (!date) {
                    indexOfComment = s.indexOf(sa[1], sa[0].length())
                } else {
                    retval.whenViewed = sa[1]
                    retval.viewDate = date
                    if (sa.length > 2) {
                        println "  sa[2] = ${sa[2]}"
                        indexOfComment = s.indexOf(sa[2], sa[0].length())
                    }
                }
                println "  date = ${date}  indexOfComment = ${indexOfComment}"
                if (indexOfComment) {
                    retval.comment = s.substring(indexOfComment)
                }
            }
        }
    }
    retval
}

def processFile(File file) {
    String theText = file.text
    return processText(theText)
}

def processText(String theText) {
    def lineInfoList = []
    theText.eachLine { line ->
        def lineInfo = parseLine(line)
        if (lineInfo) {
            lineInfoList.add(lineInfo)
            println "  lineInfo.origLine = ${lineInfo?.origLine}"
            println "  lineInfo.whenViewed = ${lineInfo?.whenViewed}"
            println "  lineInfo.comment = ${lineInfo?.comment}"
        }
    }
    println "  lineInfoList.size() = ${lineInfoList.size()}"
// perhaps add code to search lineInfo.lowerUrl for a search term
// (where the search term is first converted to lower case, for a case insensitive search)
// ... or perhaps just instead rely on grep -i or findstr /i to provide the search functionality
// then add code to sort lineInfoList by date and then remove duplicates (keeping only the lineInfo with the earliest viewDate value for any given URL)
    def prevLowerUrls = []
    def uniqueLineInfoList = []
    Collections.sort(lineInfoList)
    println "here is the lineInfoList list of URLs"
    lineInfoList.each { lineInfo ->
        println lineInfo.origLine
        if (!prevLowerUrls.contains(lineInfo.lowerUrl)) {
            prevLowerUrls.add(lineInfo.lowerUrl)
            uniqueLineInfoList.add(lineInfo)
        }
    }
    uniqueLineInfoList
}

List uniqueLineInfoList
// uniqueLineInfoList = processText(myurlstext);
String filename = "C:\\Users\\David Holberton\\MyUrlsUtil.txt"
File file = new File(filename)
uniqueLineInfoList = processFile(file);
println "here is the uniqueLineInfoList list of URLs"
uniqueLineInfoList.each { lineInfo ->
    println lineInfo.origLine
}
println "done"


https://aaa.com/an-informative-web-page.html 20211221.053000
  sa.length = 2
  date = Tue Dec 21 05:30:00 EST 2021
  date = Tue Dec 21 05:30:00 EST 2021  indexOfComment = 0
  lineInfo.origLine = https://aaa.com/an-informative-web-page.html 20211221.053000
  lineInfo.whenViewed = 20211221.053000
  lineInfo.comment = null
https://aaa.com/an-informative-web-page.html 20211220.183000 same as above, but with an earlier date
  sa.length = 10
  date = Mon Dec 20 18:30:00 EST 2021
  sa[2] = same
  date = Mon Dec 20 18:30:00 EST 2021  indexOfComment = 61
  lineInfo.origLine = https://aaa.com/an-informative-web-page.html 20211220.183000 same as above, but with an earlier date
  lineInfo.whenViewed = 20211220.183000
  lineInfo.comment = same as above, but with an earlier date
https://bbb.com/another-informative-web-page.html 20211221.053001
  sa.length = 2
  date = Tue Dec 21 05:30:01 EST 2021
  date = Tue Dec 21 05:30:01 EST 2021  indexOfComment = 0
  lineInfo.origLine = https://bbb.com/another-informative-web-page.html 20211221.053001
  lineInfo.whenViewed = 20211221.053001
  lineInfo.comment = null
https://bbb.com/another-informative-web-page.html 20211221.053001 same as above, but with comment
  sa.length = 8
  date = Tue Dec 21 05:30:01 EST 2021
  sa[2] = same
  date = Tue Dec 21 05:30:01 EST 2021  indexOfComment = 66
  lineInfo.origLine = https://bbb.com/another-informative-web-page.html 20211221.053001 same as above, but with comment
  lineInfo.whenViewed = 20211221.053001
  lineInfo.comment = same as above, but with comment
https://ccc.com/yet-another-informative-web-page.html 20211221.053002 info about groovy inner classes
  sa.length = 7
  date = Tue Dec 21 05:30:02 EST 2021
  sa[2] = info
  date = Tue Dec 21 05:30:02 EST 2021  indexOfComment = 70
  lineInfo.origLine = https://ccc.com/yet-another-informative-web-page.html 20211221.053002 info about groovy inner classes
  lineInfo.whenViewed = 20211221.053002
  lineInfo.comment = info about groovy inner classes
https://www.baeldung.com/groovy-string-to-date 20211221.053004
  sa.length = 2
  date = Tue Dec 21 05:30:04 EST 2021
  date = Tue Dec 21 05:30:04 EST 2021  indexOfComment = 0
  lineInfo.origLine = https://www.baeldung.com/groovy-string-to-date 20211221.053004
  lineInfo.whenViewed = 20211221.053004
  lineInfo.comment = null
https://aaa.com/an-informative-web-page.html 20211221.053005 same URL as first line, but viewed again at a later date
  sa.length = 14
  date = Tue Dec 21 05:30:05 EST 2021
  sa[2] = same
  date = Tue Dec 21 05:30:05 EST 2021  indexOfComment = 61
  lineInfo.origLine = https://aaa.com/an-informative-web-page.html 20211221.053005 same URL as first line, but viewed again at a later date
  lineInfo.whenViewed = 20211221.053005
  lineInfo.comment = same URL as first line, but viewed again at a later date
https://yyy.com/ some comment
  sa.length = 3
  date = null  indexOfComment = 17
  lineInfo.origLine = https://yyy.com/ some comment
  lineInfo.whenViewed = null
  lineInfo.comment = some comment
  lineInfoList.size() = 8
here is the lineInfoList list of URLs
https://aaa.com/an-informative-web-page.html 20211220.183000 same as above, but with an earlier date
https://aaa.com/an-informative-web-page.html 20211221.053000
https://bbb.com/another-informative-web-page.html 20211221.053001
https://bbb.com/another-informative-web-page.html 20211221.053001 same as above, but with comment
https://ccc.com/yet-another-informative-web-page.html 20211221.053002 info about groovy inner classes
https://www.baeldung.com/groovy-string-to-date 20211221.053004
https://aaa.com/an-informative-web-page.html 20211221.053005 same URL as first line, but viewed again at a later date
https://yyy.com/ some comment
here is the uniqueLineInfoList list of URLs
https://aaa.com/an-informative-web-page.html 20211220.183000 same as above, but with an earlier date
https://bbb.com/another-informative-web-page.html 20211221.053001
https://ccc.com/yet-another-informative-web-page.html 20211221.053002 info about groovy inner classes
https://www.baeldung.com/groovy-string-to-date 20211221.053004
https://yyy.com/ some comment
done

