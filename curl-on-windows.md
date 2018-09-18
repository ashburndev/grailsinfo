```
Microsoft Windows [Version 10.0.17134.285]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\System32>dir cu*
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Windows\System32

04/11/2018  07:34 PM           424,448 curl.exe
               1 File(s)        424,448 bytes
               0 Dir(s)  371,322,085,376 bytes free

C:\Windows\System32>curl --version
curl 7.55.1 (Windows) libcurl/7.55.1 WinSSL
Release-Date: [unreleased]
Protocols: dict file ftp ftps http https imap imaps pop3 pop3s smtp smtps telnet tftp
Features: AsynchDNS IPv6 Largefile SSPI Kerberos SPNEGO NTLM SSL

C:\Windows\System32>curl http://github.com

C:\Windows\System32>curl http://google.com
<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="http://www.google.com/">here</A>.
</BODY></HTML>

C:\Windows\System32>
```
