```
import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

public class ShowCiphers {

  public static void main (String [] args) {
    System.out.println(new Date());
    String [] sysPropNameArray = {
      "java.vendor",
      "java.version",
      "java.vm.version",
      "os.name",
      "os.version"
    };
    List <String> sysPropNameList = Arrays.asList(sysPropNameArray);
    for (String sysPropName : sysPropNameList) {
      System.out.println(sysPropName + " " + System.getProperty(sysPropName));
    }
    System.out.println("Supported Cipher Suites:");
    try {
      String [] ciphers = SSLContext.getDefault().getSocketFactory().getSupportedCipherSuites();
      // for (String cipherName : ciphers) {
      //   System.out.println(" " + cipherName);
      // }
      for (int i = 0; i < ciphers.length; i++) {
        System.out.println(" " + i + ". " + ciphers[i]);
      }
    } catch (NoSuchAlgorithmException e) {
      System.out.println ("Failed to get default SSL context");
    }
  }
}

davidho@davidho-Inspiron-1564:~/vscprojects$  cd /home/davidho/vscprojects ; /home/davidho/.sdkman/candidates/java/current/bin/java -Dfile.encoding=UTF-8 -cp /home/davidho/.config/Code/User/workspaceStorage/0679fdf51355b4a0998c4af68d1117d4/redhat.java/jdt_ws/vscprojects_458b542b/bin ShowCiphers 
Mon Jan 25 14:20:37 EST 2021
java.vendor Amazon.com Inc.
java.version 11.0.10
java.vm.version 11.0.10+9-LTS
os.name Linux
os.version 4.15.0-47-generic
Supported Cipher Suites:
 0. TLS_AES_128_GCM_SHA256
 1. TLS_AES_256_GCM_SHA384
 2. TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
 3. TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
 4. TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
 5. TLS_RSA_WITH_AES_256_GCM_SHA384
 6. TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384
 7. TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384
 8. TLS_DHE_RSA_WITH_AES_256_GCM_SHA384
 9. TLS_DHE_DSS_WITH_AES_256_GCM_SHA384
 10. TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
 11. TLS_RSA_WITH_AES_128_GCM_SHA256
 12. TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256
 13. TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256
 14. TLS_DHE_RSA_WITH_AES_128_GCM_SHA256
 15. TLS_DHE_DSS_WITH_AES_128_GCM_SHA256
 16. TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384
 17. TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384
 18. TLS_RSA_WITH_AES_256_CBC_SHA256
 19. TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384
 20. TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384
 21. TLS_DHE_RSA_WITH_AES_256_CBC_SHA256
 22. TLS_DHE_DSS_WITH_AES_256_CBC_SHA256
 23. TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA
 24. TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
 25. TLS_RSA_WITH_AES_256_CBC_SHA
 26. TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA
 27. TLS_ECDH_RSA_WITH_AES_256_CBC_SHA
 28. TLS_DHE_RSA_WITH_AES_256_CBC_SHA
 29. TLS_DHE_DSS_WITH_AES_256_CBC_SHA
 30. TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256
 31. TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256
 32. TLS_RSA_WITH_AES_128_CBC_SHA256
 33. TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256
 34. TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256
 35. TLS_DHE_RSA_WITH_AES_128_CBC_SHA256
 36. TLS_DHE_DSS_WITH_AES_128_CBC_SHA256
 37. TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA
 38. TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
 39. TLS_RSA_WITH_AES_128_CBC_SHA
 40. TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA
 41. TLS_ECDH_RSA_WITH_AES_128_CBC_SHA
 42. TLS_DHE_RSA_WITH_AES_128_CBC_SHA
 43. TLS_DHE_DSS_WITH_AES_128_CBC_SHA
 44. TLS_EMPTY_RENEGOTIATION_INFO_SCSV
davidho@davidho-Inspiron-1564:~/vscprojects$ 
```

```
https://discuss.aerospike.com/t/how-to-select-tls-cipher-suites-in-java/7311

nmap --script ssl-enum-ciphers -Pn -p 4000 192.168.105.20
nmap --script ssl-enum-ciphers -Pn -p 8443 127.0.0.1

package com.aerospike.examples;
import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;
public class Main {
    public static void main(String[] args) {
        System.out.println("Supported Cipher Suites:");
        try {
            String[] ciphers = SSLContext.getDefault().getSocketFactory().getSupportedCipherSuites();
            for (int i = 1; i < ciphers.length; i++) {
                System.out.println(" " + i + ". " + ciphers[i]);
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Failed to get default SSL context.");
        }
    }
}

https://tomcat.apache.org/download-80.cgi
https://tomcat.apache.org/download-80.cgi#8.5.61
https://discuss.aerospike.com/t/how-to-select-tls-cipher-suites-in-java/7311

davidho@davidho-Inspiron-1564:~/Downloads$ sha512sum apache-tomcat-8.5.61.tar.gz
55d7d0442a3c1bae7e470ba75c7473a8deeaf33c60ff66cecdc136ae0b0e852b871940c5deb720d501b444ccb00f0b8520b1930cbf564c2f46ceaf1e0367d41b  apache-tomcat-8.5.61.tar.gz
davidho@davidho-Inspiron-1564:~/Downloads$ 

https://tomcat.apache.org/tomcat-7.0-doc/config/http.html
https://tomcat.apache.org/tomcat-8.5-doc/config/http.html
https://tomcat.apache.org/tomcat-8.5-doc/ssl-howto.html

$JAVA_HOME/bin/keytool -genkey -alias tomcat -keyalg RSA

Is CN=David Holberton, OU=ashburndev, O=foo, L=Ashburn, ST=VA, C=US correct?
  [no]:  yes

<!-- Define an SSL Coyote HTTP/1.1 Connector on port 8443 -->
<Connector
           protocol="org.apache.coyote.http11.Http11NioProtocol"
           port="8443" maxThreads="200"
           scheme="https" secure="true" SSLEnabled="true"
           keystoreFile="${user.home}/.keystore" keystorePass="changeit"
           clientAuth="false" sslProtocol="TLS"/>

<!-- Define an SSL Coyote HTTP/1.1 Connector on port 8443 -->
<Connector
           protocol="org.apache.coyote.http11.Http11NioProtocol"
           port="8443" maxThreads="200"
           scheme="https" secure="true" SSLEnabled="true"
           keystoreFile="${user.home}/.keystore" keystorePass="changeit"
           clientAuth="false" sslProtocol="TLSv1.2"/>           

davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ 
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ ./shutdown.sh 
Using CATALINA_BASE:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_HOME:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_TMPDIR: /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/temp
Using JRE_HOME:        /home/davidho/.sdkman/candidates/java/current
Using CLASSPATH:       /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/bootstrap.jar:/home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/tomcat-juli.jar
Using CATALINA_OPTS:   
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ ./startup.sh 
Using CATALINA_BASE:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_HOME:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_TMPDIR: /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/temp
Using JRE_HOME:        /home/davidho/.sdkman/candidates/java/current
Using CLASSPATH:       /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/bootstrap.jar:/home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/tomcat-juli.jar
Using CATALINA_OPTS:   
Tomcat started.
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ nmap --script ssl-enum-ciphers -Pn -p 8443 127.0.0.1

Starting Nmap 7.60 ( https://nmap.org ) at 2021-01-24 19:08 EST
Nmap scan report for localhost (127.0.0.1)
Host is up (0.00014s latency).

PORT     STATE SERVICE
8443/tcp open  https-alt
| ssl-enum-ciphers: 
|   TLSv1.0: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|     compressors: 
|       NULL
|     cipher preference: client
|   TLSv1.1: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|     compressors: 
|       NULL
|     cipher preference: client
|   TLSv1.2: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (dh 2048) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (secp256r1) - A
|     compressors: 
|       NULL
|     cipher preference: client
|_  least strength: A

Nmap done: 1 IP address (1 host up) scanned in 1.76 seconds
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ 

<Connector
           protocol="org.apache.coyote.http11.Http11NioProtocol"
           port="8443" maxThreads="200"
           scheme="https" secure="true" SSLEnabled="true"
           keystoreFile="${user.home}/.keystore" keystorePass="changeit"
           clientAuth="false" sslProtocol="TLS" sslEnabledProtocols="TLSv1.2"/>

davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ ./shutdown.sh 
Using CATALINA_BASE:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_HOME:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_TMPDIR: /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/temp
Using JRE_HOME:        /home/davidho/.sdkman/candidates/java/current
Using CLASSPATH:       /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/bootstrap.jar:/home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/tomcat-juli.jar
Using CATALINA_OPTS:   
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ ./startup.sh 
Using CATALINA_BASE:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_HOME:   /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61
Using CATALINA_TMPDIR: /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/temp
Using JRE_HOME:        /home/davidho/.sdkman/candidates/java/current
Using CLASSPATH:       /home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/bootstrap.jar:/home/davidho/Downloads/tomcat/apache-tomcat-8.5.61/bin/tomcat-juli.jar
Using CATALINA_OPTS:   
Tomcat started.
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ nmap --script ssl-enum-ciphers -Pn -p 8443 127.0.0.1

Starting Nmap 7.60 ( https://nmap.org ) at 2021-01-24 19:33 EST
Nmap scan report for localhost (127.0.0.1)
Host is up (0.00015s latency).

PORT     STATE SERVICE
8443/tcp open  https-alt
| ssl-enum-ciphers: 
|   TLSv1.2: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (dh 2048) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (secp256r1) - A
|     compressors: 
|       NULL
|     cipher preference: client
|_  least strength: A

Nmap done: 1 IP address (1 host up) scanned in 0.85 seconds
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ 
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ java -version
openjdk version "1.8.0_275"
OpenJDK Runtime Environment Corretto-8.275.01.1 (build 1.8.0_275-b01)
OpenJDK 64-Bit Server VM Corretto-8.275.01.1 (build 25.275-b01, mixed mode)
davidho@davidho-Inspiron-1564:~/Downloads/tomcat/apache-tomcat-8.5.61/bin$ 
```
