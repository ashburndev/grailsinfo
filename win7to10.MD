```
4:29 AM 2/7/2019

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.
        // runtime 'mysql:mysql-connector-java:5.1.29'
        runtime 'mysql:mysql-connector-java:8.0.14'
        // runtime 'org.postgresql:postgresql:9.3-1101-jdbc41'
        test "org.grails:grails-datastore-test-support:1.0.2-grails-2.4"
    }

class Person {
	String firstName
	String lastName
	String empNum

    static constraints = {
    }
}


| Running Grails application
Error |
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
| Server running. Browse to http://localhost:8080/win7to10


Microsoft Windows [Version 10.0.17134.523]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\David Holberton>mysql -u root -p
Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 20
Server version: 8.0.14 MySQL Community Server - GPL

Copyright (c) 2000, 2019, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| win7to10           |
+--------------------+
5 rows in set (0.00 sec)

mysql> use win7to10;
Database changed
mysql> show tables;
+--------------------+
| Tables_in_win7to10 |
+--------------------+
| person             |
+--------------------+
1 row in set (0.01 sec)

mysql> desc person;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| id         | bigint(20)   | NO   | PRI | NULL    | auto_increment |
| version    | bigint(20)   | NO   |     | NULL    |                |
| emp_num    | varchar(255) | NO   |     | NULL    |                |
| first_name | varchar(255) | NO   |     | NULL    |                |
| last_name  | varchar(255) | NO   |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)

mysql>
mysql> select * from person;
+----+---------+---------+------------+-----------+
| id | version | emp_num | first_name | last_name |
+----+---------+---------+------------+-----------+
|  1 |       0 | 2       | John       | Adams     |
|  2 |       0 | 41      | George     | Bush      |
+----+---------+---------+------------+-----------+
2 rows in set (0.00 sec)

mysql>

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.
        // runtime 'mysql:mysql-connector-java:5.1.29'
        // runtime 'mysql:mysql-connector-java:8.0.14'
        runtime 'mysql:mysql-connector-java:5.1.14'
        // runtime 'org.postgresql:postgresql:9.3-1101-jdbc41'
        test "org.grails:grails-datastore-test-support:1.0.2-grails-2.4"
    }


| Running Grails application
Error |
2019-02-07 04:39:22,466 [localhost-startStop-1] ERROR pool.ConnectionPool  - Unable to create initial connections of pool.
Message: Client does not support authentication protocol requested by server; consider upgrading MySQL client
    Line | Method
->>  407 | handleNewInstance  in com.mysql.jdbc.Util
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
|    382 | getInstance        in     ''
|   1013 | createSQLException in com.mysql.jdbc.SQLError
|   3593 | checkErrorPacket   in com.mysql.jdbc.MysqlIO

C:\Users\David Holberton\.m2\repository\mysql\mysql-connector-java>dir /o:gd /s
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Users\David Holberton\.m2\repository\mysql\mysql-connector-java

02/06/2019  09:31 AM    <DIR>          5.1.14
02/07/2019  04:27 AM    <DIR>          ..
02/07/2019  04:27 AM    <DIR>          .
02/07/2019  04:27 AM    <DIR>          8.0.14
               0 File(s)              0 bytes

 Directory of C:\Users\David Holberton\.m2\repository\mysql\mysql-connector-java\5.1.14

02/06/2019  09:31 AM    <DIR>          ..
02/06/2019  09:31 AM    <DIR>          .
02/06/2019  09:31 AM             1,105 mysql-connector-java-5.1.14.pom
02/06/2019  09:31 AM                74 mysql-connector-java-5.1.14.pom.sha1
02/06/2019  09:31 AM           775,688 mysql-connector-java-5.1.14.jar
02/06/2019  09:31 AM               229 _remote.repositories
02/06/2019  09:31 AM                41 mysql-connector-java-5.1.14.jar.sha1
               5 File(s)        777,137 bytes

 Directory of C:\Users\David Holberton\.m2\repository\mysql\mysql-connector-java\8.0.14

02/07/2019  04:27 AM    <DIR>          ..
02/07/2019  04:27 AM    <DIR>          .
02/07/2019  04:27 AM             1,068 mysql-connector-java-8.0.14.pom
02/07/2019  04:27 AM                41 mysql-connector-java-8.0.14.pom.sha1
02/07/2019  04:27 AM         2,134,907 mysql-connector-java-8.0.14.jar
02/07/2019  04:27 AM                41 mysql-connector-java-8.0.14.jar.sha1
02/07/2019  04:27 AM               229 _remote.repositories
               5 File(s)      2,136,286 bytes

     Total Files Listed:
              10 File(s)      2,913,423 bytes
               8 Dir(s)  268,309,413,888 bytes free

C:\Users\David Holberton\.m2\repository\mysql\mysql-connector-java>
```
