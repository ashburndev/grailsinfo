```
6:49 AM 10/7/2020

C:\LocalApps\lia2e>dir /o:gd
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\lia2e

08/19/2004  12:00 PM    <DIR>          data
07/19/2009  06:24 AM    <DIR>          conf
07/19/2009  06:29 AM    <DIR>          src
06/24/2010  10:52 AM    <DIR>          workspace
06/24/2010  10:55 AM    <DIR>          lib
06/24/2010  10:55 AM    <DIR>          ..
06/24/2010  10:55 AM    <DIR>          .
12/08/2009  03:16 PM             5,236 README
03/18/2010  01:47 PM            18,756 build.xml
               2 File(s)         23,992 bytes
               7 Dir(s)  110,726,885,376 bytes free

C:\LocalApps\lia2e>tree /a
Folder PATH listing
Volume serial number is 4603-A8D3
C:.
+---conf
|   \---plugins
|       +---clustering-carrot2
|       +---creativecommons
|       +---feed
|       +---field-basic
|       +---field-boost
|       +---index-anchor
|       +---index-basic
|       +---index-more
|       +---language-identifier
|       +---lib-http
|       +---lib-jakarta-poi
|       +---lib-lucene-analyzers
|       +---lib-nekohtml
|       +---lib-parsems
|       +---lib-regex-filter
|       +---lib-xml
|       +---microformats-reltag
|       +---nutch-extensionpoints
|       +---ontology
|       +---parse-ext
|       +---parse-html
|       +---parse-js
|       +---parse-msexcel
|       +---parse-mspowerpoint
|       +---parse-msword
|       +---parse-oo
|       +---parse-pdf
|       +---parse-rss
|       +---parse-swf
|       +---parse-text
|       +---parse-zip
|       +---protocol-file
|       +---protocol-ftp
|       +---protocol-http
|       +---protocol-httpclient
|       +---query-basic
|       +---query-custom
|       +---query-more
|       +---query-site
|       +---query-url
|       +---response-json
|       +---response-xml
|       +---scoring-link
|       +---scoring-opic
|       +---subcollection
|       +---summary-basic
|       +---summary-lucene
|       +---tld
|       +---urlfilter-automaton
|       +---urlfilter-domain
|       +---urlfilter-prefix
|       +---urlfilter-regex
|       +---urlfilter-suffix
|       +---urlfilter-validator
|       +---urlnormalizer-basic
|       +---urlnormalizer-pass
|       \---urlnormalizer-regex
+---data
|   +---education
|   |   \---pedagogy
|   +---health
|   |   \---alternative
|   |       \---chinese
|   +---philosophy
|   |   \---eastern
|   \---technology
|       \---computers
|           +---ai
|           \---programming
|               +---education
|               \---methodology
+---lib
|   \---nutch
+---src
|   \---lia
|       +---admin
|       +---advsearching
|       +---analysis
|       |   +---codec
|       |   +---i18n
|       |   +---keyword
|       |   +---nutch
|       |   +---positional
|       |   +---queryparser
|       |   +---stopanalyzer
|       |   \---synonym
|       |       \---.AppleDouble
|       +---benchmark
|       +---common
|       +---extsearch
|       |   +---collector
|       |   +---filters
|       |   +---payloads
|       |   +---queryparser
|       |   |   \---.AppleDouble
|       |   \---sorting
|       +---indexing
|       +---meetlucene
|       |   \---data
|       +---ports
|       +---searching
|       +---tika
|       |   +---.AppleDouble
|       |   \---data
|       \---tools
|           +---.AppleDouble
|           +---remote
|           \---XmlQueryParser
\---workspace
    \---lucene-302
        \---dist

C:\LocalApps\lia2e>
C:\LocalApps\lia2e>

C:\LocalApps\lia2e\src\lia\meetlucene>
C:\LocalApps\lia2e\src\lia\meetlucene>dir /o:gd /s
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\lia2e\src\lia\meetlucene

07/19/2009  06:29 AM    <DIR>          data
04/29/2010  06:19 PM    <DIR>          ..
04/29/2010  06:19 PM    <DIR>          .
04/29/2010  06:19 PM             2,956 Searcher.java
04/29/2010  06:19 PM             3,909 Indexer.java
04/29/2010  06:19 PM             1,119 Fragments.java
               3 File(s)          7,984 bytes

 Directory of C:\LocalApps\lia2e\src\lia\meetlucene\data

07/19/2009  06:29 AM    <DIR>          ..
07/19/2009  06:29 AM    <DIR>          .
07/19/2009  06:29 AM             2,845 apache1.0.txt
07/19/2009  06:29 AM             2,827 apache1.1.txt
07/19/2009  06:29 AM            11,357 apache2.0.txt
07/19/2009  06:29 AM            11,863 cpl1.0.txt
07/19/2009  06:29 AM            11,252 epl1.0.txt
07/19/2009  06:29 AM             1,500 freebsd.txt
07/19/2009  06:29 AM            12,519 gpl1.0.txt
07/19/2009  06:29 AM            17,987 gpl2.0.txt
07/19/2009  06:29 AM            35,147 gpl3.0.txt
07/19/2009  06:29 AM            26,436 lgpl2.1.txt
07/19/2009  06:29 AM             7,639 lgpl3.txt
07/19/2009  06:29 AM            25,276 lpgl2.0.txt
07/19/2009  06:29 AM             1,065 mit.txt
07/19/2009  06:29 AM            25,755 mozilla1.1.txt
07/19/2009  06:29 AM             7,280 mozilla_eula_firefox3.txt
07/19/2009  06:29 AM             6,992 mozilla_eula_thunderbird2.txt
              16 File(s)        207,740 bytes

     Total Files Listed:
              19 File(s)        215,724 bytes
               5 Dir(s)  110,996,267,008 bytes free

C:\LocalApps\lia2e\src\lia\meetlucene>
C:\LocalApps\lia2e\src\lia\meetlucene>
C:\LocalApps\lia2e\src\lia\meetlucene>type Indexer.java
package lia.meetlucene;

/**
 * Copyright Manning Publications Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific lan
*/

import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.FileReader;

// From chapter 1

/**
 * This code was originally written for
 * Erik's Lucene intro java.net article
 */
public class Indexer {

  public static void main(String[] args) throws Exception {
    if (args.length != 2) {
      throw new IllegalArgumentException("Usage: java " + Indexer.class.getName()
        + " <index dir> <data dir>");
    }
    String indexDir = args[0];         //1
    String dataDir = args[1];          //2

    long start = System.currentTimeMillis();
    Indexer indexer = new Indexer(indexDir);
    int numIndexed;
    try {
      numIndexed = indexer.index(dataDir, new TextFilesFilter());
    } finally {
      indexer.close();
    }
    long end = System.currentTimeMillis();

    System.out.println("Indexing " + numIndexed + " files took "
      + (end - start) + " milliseconds");
  }

  private IndexWriter writer;

  public Indexer(String indexDir) throws IOException {
    Directory dir = FSDirectory.open(new File(indexDir));
    writer = new IndexWriter(dir,            //3
                 new StandardAnalyzer(       //3
                     Version.LUCENE_30),//3
                 true,                       //3
                             IndexWriter.MaxFieldLength.UNLIMITED); //3
  }

  public void close() throws IOException {
    writer.close();                             //4
  }

  public int index(String dataDir, FileFilter filter)
    throws Exception {

    File[] files = new File(dataDir).listFiles();

    for (File f: files) {
      if (!f.isDirectory() &&
          !f.isHidden() &&
          f.exists() &&
          f.canRead() &&
          (filter == null || filter.accept(f))) {
        indexFile(f);
      }
    }

    return writer.numDocs();                     //5
  }

  private static class TextFilesFilter implements FileFilter {
    public boolean accept(File path) {
      return path.getName().toLowerCase()        //6
             .endsWith(".txt");                  //6
    }
  }

  protected Document getDocument(File f) throws Exception {
    Document doc = new Document();
    doc.add(new Field("contents", new FileReader(f)));      //7
    doc.add(new Field("filename", f.getName(),              //8
                Field.Store.YES, Field.Index.NOT_ANALYZED));//8
    doc.add(new Field("fullpath", f.getCanonicalPath(),     //9
                Field.Store.YES, Field.Index.NOT_ANALYZED));//9
    return doc;
  }

  private void indexFile(File f) throws Exception {
    System.out.println("Indexing " + f.getCanonicalPath());
    Document doc = getDocument(f);
    writer.addDocument(doc);                              //10
  }
}

/*
#1 Create index in this directory
#2 Index *.txt files from this directory
#3 Create Lucene IndexWriter
#4 Close IndexWriter
#5 Return number of documents indexed
#6 Index .txt files only, using FileFilter
#7 Index file content
#8 Index file name
#9 Index file full path
#10 Add document to Lucene index
*/

C:\LocalApps\lia2e\src\lia\meetlucene>
C:\LocalApps\lia2e\src\lia\meetlucene>type Searcher.java
package lia.meetlucene;

/**
 * Copyright Manning Publications Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific lan
*/

import org.apache.lucene.document.Document;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.Directory;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.util.Version;

import java.io.File;
import java.io.IOException;

// From chapter 1

/**
 * This code was originally written for
 * Erik's Lucene intro java.net article
 */
public class Searcher {

  public static void main(String[] args) throws IllegalArgumentException,
        IOException, ParseException {
    if (args.length != 2) {
      throw new IllegalArgumentException("Usage: java " + Searcher.class.getName()
        + " <index dir> <query>");
    }

    String indexDir = args[0];               //1
    String q = args[1];                      //2

    search(indexDir, q);
  }

  public static void search(String indexDir, String q)
    throws IOException, ParseException {

    Directory dir = FSDirectory.open(new File(indexDir)); //3
    IndexSearcher is = new IndexSearcher(dir);   //3

    QueryParser parser = new QueryParser(Version.LUCENE_30, // 4
                                         "contents",  //4
                     new StandardAnalyzer(          //4
                       Version.LUCENE_30));  //4
    Query query = parser.parse(q);              //4
    long start = System.currentTimeMillis();
    TopDocs hits = is.search(query, 10); //5
    long end = System.currentTimeMillis();

    System.err.println("Found " + hits.totalHits +   //6
      " document(s) (in " + (end - start) +        // 6
      " milliseconds) that matched query '" +     // 6
      q + "':");                                   // 6

    for(ScoreDoc scoreDoc : hits.scoreDocs) {
      Document doc = is.doc(scoreDoc.doc);               //7
      System.out.println(doc.get("fullpath"));  //8
    }

    is.close();                                //9
  }
}

/*
#1 Parse provided index directory
#2 Parse provided query string
#3 Open index
#4 Parse query
#5 Search index
#6 Write search stats
#7 Retrieve matching document
#8 Display filename
#9 Close IndexSearcher
*/

C:\LocalApps\lia2e\src\lia\meetlucene>
C:\LocalApps\lia2e\src\lia\meetlucene>type Fragments.java
package lia.meetlucene;

/**
 * Copyright Manning Publications Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific lan
*/

import org.apache.lucene.store.*;
import org.apache.lucene.search.*;
import org.apache.lucene.index.*;
import java.io.File;
import java.io.IOException;

// From chapter 1

/** Just contains any code fragments from chapter 1 */

public class Fragments {
  public void simpleSearch() throws IOException {
    Directory dir = FSDirectory.open(new File("/tmp/index"));
    IndexSearcher searcher = new IndexSearcher(dir);
    Query q = new TermQuery(new Term("contents", "lucene"));
    TopDocs hits = searcher.search(q, 10);
    searcher.close();
  }
}
C:\LocalApps\lia2e\src\lia\meetlucene>
```

