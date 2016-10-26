
Here is a quick first cut at joining two files in a side-by-side manner

    String filename1 = "/home/ashburndave/bookstore211.txt"
    List file1lines = new File(filename1).readLines()
    def file1count = file1lines.size()
    println  file1count
    String filename2 = "/home/ashburndave/bookstore254.txt"
    List file2lines = new File(filename2).readLines()
    def file2count = file2lines.size()
    println  file2count
    def maxcount = Math.max(file1count,file2count)
    println maxcount
    def maxsize = -1
    file1lines.each {line ->
      // next step, remove trailing spaces to arrive at maxsize
      maxsize = (line.size() > maxsize) ? line.size() : maxsize
    }
    println maxsize
    for (int n = 0 ; n < maxcount ; n++) {
      def line1 = (n < file1count) ? file1lines[n] : ""
      // println line1
      def line2 = (n < file2count) ? file2lines[n] : ""
      // println line1
      //println "${n}  ${line1}  ${line2}"
      // println "${n}  ${line1.padRight(maxsize," ")}  ${line2}"
      println "    ${line1.padRight(maxsize," ")}  ${line2}"
    }

And here is a sample output from the above




    ashburndave@dphnuc:~$ javac -version                             ashburndave@dphnuc:~$ javac -version
    javac 1.7.0_80                                                   javac 1.8.0_66
    ashburndave@dphnuc:~$ grails --version                           ashburndave@dphnuc:~$ grails --version
    Grails version: 2.1.1                                            Grails version: 2.5.4
    ashburndave@dphnuc:~$ cd ~/g2projects                            ashburndave@dphnuc:~$ cd ~/g2projects
    ashburndave@dphnuc:~/g2projects$ grails create-app bookstore211  ashburndave@dphnuc:~/g2projects$ create-app bookstore254
    ashburndave@dphnuc:~/g2projects$ cd bookstore211/                ashburndave@dphnuc:~/g2projects$ cd bookstore254
    ashburndave@dphnuc:~/g2projects/bookstore211$ tree               ashburndave@dphnuc:~/g2projects/bookstore254$ tree
    .                                                                .
    ├── application.properties                                       ├── application.properties
    ├── grails-app                                                   ├── grails-app
    │   ├── conf                                                     │   ├── assets
    │   │   ├── ApplicationResources.groovy                          │   │   ├── images
    │   │   ├── BootStrap.groovy                                     │   │   │   ├── apple-touch-icon.png
    │   │   ├── BuildConfig.groovy                                   │   │   │   ├── apple-touch-icon-retina.png
    │   │   ├── Config.groovy                                        │   │   │   ├── favicon.ico
    │   │   ├── DataSource.groovy                                    │   │   │   ├── grails_logo.png
    │   │   ├── hibernate                                            │   │   │   ├── skin
    │   │   ├── spring                                               │   │   │   │   ├── database_add.png
    │   │   │   └── resources.groovy                                 │   │   │   │   ├── database_delete.png
    │   │   └── UrlMappings.groovy                                   │   │   │   │   ├── database_edit.png
    │   ├── controllers                                              │   │   │   │   ├── database_save.png
    │   ├── domain                                                   │   │   │   │   ├── database_table.png
    │   ├── i18n                                                     │   │   │   │   ├── exclamation.png
    │   │   ├── messages_cs_CZ.properties                            │   │   │   │   ├── house.png
    │   │   ├── messages_da.properties                               │   │   │   │   ├── information.png
    │   │   ├── messages_de.properties                               │   │   │   │   ├── shadow.jpg
    │   │   ├── messages_es.properties                               │   │   │   │   ├── sorted_asc.gif
    │   │   ├── messages_fr.properties                               │   │   │   │   └── sorted_desc.gif
    │   │   ├── messages_it.properties                               │   │   │   ├── spinner.gif
    │   │   ├── messages_ja.properties                               │   │   │   └── springsource.png
    │   │   ├── messages_nl.properties                               │   │   ├── javascripts
    │   │   ├── messages_pl.properties                               │   │   │   └── application.js
    │   │   ├── messages.properties                                  │   │   └── stylesheets
    │   │   ├── messages_pt_BR.properties                            │   │       ├── application.css
    │   │   ├── messages_pt_PT.properties                            │   │       ├── errors.css
    │   │   ├── messages_ru.properties                               │   │       ├── main.css
    │   │   ├── messages_sv.properties                               │   │       └── mobile.css
    │   │   ├── messages_th.properties                               │   ├── conf
    │   │   └── messages_zh_CN.properties                            │   │   ├── BootStrap.groovy
    │   ├── services                                                 │   │   ├── BuildConfig.groovy
    │   ├── taglib                                                   │   │   ├── Config.groovy
    │   ├── utils                                                    │   │   ├── DataSource.groovy
    │   └── views                                                    │   │   ├── hibernate
    │       ├── error.gsp                                            │   │   ├── spring
    │       ├── index.gsp                                            │   │   │   └── resources.groovy
    │       └── layouts                                              │   │   └── UrlMappings.groovy
    │           └── main.gsp                                         │   ├── controllers
    ├── lib                                                          │   ├── domain
    ├── scripts                                                      │   ├── i18n
    ├── src                                                          │   │   ├── messages_cs_CZ.properties
    │   ├── groovy                                                   │   │   ├── messages_da.properties
    │   └── java                                                     │   │   ├── messages_de.properties
    ├── test                                                         │   │   ├── messages_es.properties
    │   ├── integration                                              │   │   ├── messages_fr.properties
    │   └── unit                                                     │   │   ├── messages_it.properties
    └── web-app                                                      │   │   ├── messages_ja.properties
        ├── css                                                      │   │   ├── messages_nb.properties
        │   ├── errors.css                                           │   │   ├── messages_nl.properties
        │   ├── main.css                                             │   │   ├── messages_pl.properties
        │   └── mobile.css                                           │   │   ├── messages.properties
        ├── images                                                   │   │   ├── messages_pt_BR.properties
        │   ├── apple-touch-icon.png                                 │   │   ├── messages_pt_PT.properties
        │   ├── apple-touch-icon-retina.png                          │   │   ├── messages_ru.properties
        │   ├── favicon.ico                                          │   │   ├── messages_sv.properties
        │   ├── grails_logo.jpg                                      │   │   ├── messages_th.properties
        │   ├── grails_logo.png                                      │   │   └── messages_zh_CN.properties
        │   ├── leftnav_btm.png                                      │   ├── services
        │   ├── leftnav_midstretch.png                               │   ├── taglib
        │   ├── leftnav_top.png                                      │   ├── utils
        │   ├── skin                                                 │   └── views
        │   │   ├── database_add.png                                 │       ├── error.gsp
        │   │   ├── database_delete.png                              │       ├── index.gsp
        │   │   ├── database_edit.png                                │       └── layouts
        │   │   ├── database_save.png                                │           └── main.gsp
        │   │   ├── database_table.png                               ├── grailsw
        │   │   ├── exclamation.png                                  ├── grailsw.bat
        │   │   ├── house.png                                        ├── lib
        │   │   ├── information.png                                  ├── scripts
        │   │   ├── shadow.jpg                                       ├── src
        │   │   ├── sorted_asc.gif                                   │   ├── groovy
        │   │   └── sorted_desc.gif                                  │   └── java
        │   ├── spinner.gif                                          ├── test
        │   └── springsource.png                                     │   ├── integration
        ├── js                                                       │   └── unit
        │   └── application.js                                       ├── web-app
        ├── META-INF                                                 │   ├── css
        └── WEB-INF                                                  │   ├── images
            ├── applicationContext.xml                               │   ├── js
            ├── sitemesh.xml                                         │   ├── META-INF
            └── tld                                                  │   └── WEB-INF
                ├── grails.tld                                       │       ├── applicationContext.xml
                └── spring.tld                                       │       ├── sitemesh.xml
                                                                     │       └── tld
    28 directories, 56 files                                         │           ├── grails.tld
                                                                     │           ├── spring-form.tld
    #Grails Metadata file                                            │           └── spring.tld
    #Wed Oct 26 06:11:25 EDT 2016                                    └── wrapper
    app.grails.version=2.1.1                                             ├── grails-wrapper.properties
    app.name=bookstore211                                                ├── grails-wrapper-runtime-2.5.4.jar
    app.version=0.1                                                      └── springloaded-1.2.4.RELEASE.jar
                                                                     
                                                                     33 directories, 59 files
                                                                     
                                                                     #Grails Metadata file
                                                                     #Wed Oct 26 06:24:38 EDT 2016
                                                                     app.grails.version=2.5.4
                                                                     app.name=bookstore254
                                                                     app.version=0.1
                                                                     
