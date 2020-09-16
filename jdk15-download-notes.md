```
6:52 AM 9/16/2020

notes on downloading Java JDK 15 (and earlier)


I did a google search on "oracle jdk 15 download" (without the quotes) which led me to the page below.
The page has links for downloading Oracle OpenJDK 15 for various operating systems

https://jdk.java.net/15/
https://jdk.java.net/15/release-notes


I did a google search on "oracle jdk 14 download" (without the quotes) which led me to the page below.
The page has links for downloading Oracle JDK 14.0.1 for various operating systems (and sha256 checksums)

https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html


I did a google search on "oracle jdk 11 download" (without the quotes) which led me to the page below.
The page has links for downloading Oracle JDK 11.0.8 for various operating systems (and a link for checksums)

https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
https://www.oracle.com/webfolder/s/digest/11-0-8-checksum.html


I did a google search on "oracle jdk 8 download" (without the quotes) which led me to the page below.
The page has links for downloading Oracle JDK 8u261 for various operating systems (and a link for checksums)

https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
https://www.oracle.com/webfolder/s/digest/8u261checksum.html


Then I used the url immediately below, which contained links to download pages for various jdk releases (including 14.0.2)

https://www.oracle.com/java/technologies/

https://www.oracle.com/java/technologies/javase-downloads.html#JDK15
https://www.oracle.com/java/technologies/javase-downloads.html#JDK14
https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html

https://www.oracle.com/java/technologies/javase-jdk14-downloads.html
https://www.oracle.com/webfolder/s/digest/14-0-2-checksum.html


Based on the urls above, I tried this (and it worked)
The page has links for downloading Oracle JDK 15 for various operating systems (and a link for checksums)

https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
https://www.oracle.com/webfolder/s/digest/15checksum.html


09/16/2020  07:07 AM       124,517,576 jdk-8u261-docs-all.zip
09/16/2020  07:07 AM        10,569,118 javafx-8u261-apidocs.zip
09/16/2020  07:08 AM        53,665,320 jdk-11.0.8_doc-all.zip
09/16/2020  07:09 AM        52,312,117 jdk-14.0.2_doc-all.zip
09/16/2020  07:13 AM       169,989,784 jdk-14.0.2_windows-x64_bin.exe
09/16/2020  07:14 AM       190,381,364 jdk-14.0.2_windows-x64_bin.zip
09/16/2020  07:16 AM            11,214 14-0-2-checksum.html
09/16/2020  07:30 AM       195,901,213 openjdk-15_windows-x64_bin.zip
09/16/2020  07:32 AM                66 openjdk-15_windows-x64_bin.zip.sha256
09/16/2020  07:35 AM       167,435,408 jdk-15_windows-x64_bin.exe
09/16/2020  07:35 AM       187,941,876 jdk-15_windows-x64_bin.zip
09/16/2020  07:36 AM            11,439 15checksum.html
09/16/2020  07:48 AM        50,530,306 jdk-15_doc-all.zip
            1125 File(s) 150,547,633,319 bytes
              23 Dir(s)  128,560,697,344 bytes free

C:\Users\David Holberton\Downloads>
C:\Users\David Holberton\Downloads>dir /o:gd | findstr /i "checksum"
03/15/2018  08:07 AM             7,091 8u161checksum.html
03/15/2018  08:07 AM             6,555 8u162checksum.html
03/15/2018  08:27 AM             3,176 9-0-4checksum.html
05/30/2018  06:14 AM             7,057 8u171checksum.html
05/30/2018  06:14 AM             6,524 8u172checksum.html
05/30/2018  06:27 AM             3,332 10-0-1checksum.html
07/24/2018  07:36 AM             7,057 8u181checksum.html
07/24/2018  08:02 AM             3,332 10-0-2checksum.html
11/24/2018  07:05 PM            10,221 8u191checksum.html
11/24/2018  07:05 PM             9,688 8u192checksum.html
11/24/2018  07:07 PM             5,535 11-0-1checksum.html
01/30/2019  11:18 AM            10,279 8u201checksum.html
01/30/2019  11:18 AM             9,776 8u202checksum.html
01/30/2019  12:03 PM             5,594 11-0-2-checksum.html
03/24/2019  11:58 AM             5,418 12checksum.html
04/16/2019  08:31 PM            10,018 8u211checksum.html
04/16/2019  08:32 PM             9,485 8u212checksum.html
04/16/2019  08:39 PM             5,194 12-0-1-checksum.html
04/26/2019  07:18 AM             5,590 11-0-3-checksum.html
07/31/2019  07:52 AM             9,741 8u221checksum.html
07/31/2019  07:52 AM             5,589 11-0-4-checksum.html
07/31/2019  07:52 AM             5,450 12-0-2-checksum.html
10/03/2019  06:38 AM             5,418 13checksum.html
10/21/2019  07:42 PM             5,448 13-0-1-checksum.html
10/21/2019  07:45 PM             9,745 8u231checksum.html
01/19/2020  04:13 PM             9,799 8u241checksum.html
01/19/2020  04:16 PM             5,647 11-0-6-checksum.html
01/19/2020  04:19 PM             5,508 13-0-2-checksum.html
04/16/2020  12:39 PM             5,467 14-0-1-checksum.html
04/16/2020  12:39 PM             9,758 8u251checksum.html
04/16/2020  12:48 PM             5,608 11-0-7-checksum.html
07/16/2020  10:17 AM            15,487 8u261checksum.html
07/16/2020  10:30 AM            11,335 11-0-8-checksum.html
09/16/2020  07:16 AM            11,214 14-0-2-checksum.html
09/16/2020  07:36 AM            11,439 15checksum.html

C:\Users\David Holberton\Downloads>

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

https://blogs.oracle.com/javamagazine/?xd_co_f=398e002e-b42f-445d-89c6-6e031e16832a

https://blogs.oracle.com/javamagazine/the-joy-of-writing-command-line-utilities-finding-duplicate-files-part-1

```
