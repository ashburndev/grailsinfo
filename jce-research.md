```
7:04 AM 8/7/2020

C:\Users\David Holberton\Downloads>dir /o:gd jce*
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Users\David Holberton\Downloads

08/02/2017  06:24 AM             8,409 jce_policy-8.zip
08/07/2020  07:01 AM            12,417 jce_policy-8(1).zip
               2 File(s)         20,826 bytes
               0 Dir(s)  140,787,306,496 bytes free

C:\Users\David Holberton\Downloads>7z l jce_policy-8.zip

7-Zip 19.00 (x64) : Copyright (c) 1999-2018 Igor Pavlov : 2019-02-21

Scanning the drive for archives:
1 file, 8409 bytes (9 KiB)

Listing archive: jce_policy-8.zip

--
Path = jce_policy-8.zip
Type = zip
Physical Size = 8409

   Date      Time    Attr         Size   Compressed  Name
------------------- ----- ------------ ------------  ------------------------
2013-12-20 14:54:06 D....            0            0  UnlimitedJCEPolicyJDK8
2013-12-20 14:54:06 .....         3035         2634  UnlimitedJCEPolicyJDK8\local_policy.jar
2013-12-20 14:54:06 .....         7323         2433  UnlimitedJCEPolicyJDK8\README.txt
2013-12-20 14:54:01 .....         3023         2604  UnlimitedJCEPolicyJDK8\US_export_policy.jar
------------------- ----- ------------ ------------  ------------------------
2013-12-20 14:54:06              13381         7671  3 files, 1 folders

C:\Users\David Holberton\Downloads>
C:\Users\David Holberton\Downloads>7z l "jce_policy-8(1).zip"

7-Zip 19.00 (x64) : Copyright (c) 1999-2018 Igor Pavlov : 2019-02-21

Scanning the drive for archives:
1 file, 12417 bytes (13 KiB)

Listing archive: jce_policy-8(1).zip

--
Path = jce_policy-8(1).zip
Type = zip
Physical Size = 12417

   Date      Time    Attr         Size   Compressed  Name
------------------- ----- ------------ ------------  ------------------------
2020-06-19 17:09:55 D....            0            0  UnlimitedJCEPolicyJDK8
2020-06-19 17:09:53 .....         5373         4481  UnlimitedJCEPolicyJDK8\US_export_policy.jar
2020-06-19 17:09:55 .....         5372         4492  UnlimitedJCEPolicyJDK8\local_policy.jar
2020-07-01 09:44:17 .....         7921         2634  UnlimitedJCEPolicyJDK8\README.txt
------------------- ----- ------------ ------------  ------------------------
2020-07-01 09:44:17              18666        11607  3 files, 1 folders

C:\Users\David Holberton\Downloads>
C:\Users\David Holberton\Downloads>

C:\temp>dir /o:gd/s
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\temp

12/20/2013  02:54 PM    <DIR>          UnlimitedJCEPolicyJDK8
08/07/2020  07:08 AM    <DIR>          ..
08/07/2020  07:08 AM    <DIR>          .
08/02/2017  06:24 AM             8,409 jce_policy-8.zip
               1 File(s)          8,409 bytes

 Directory of C:\temp\UnlimitedJCEPolicyJDK8

12/20/2013  02:54 PM    <DIR>          ..
12/20/2013  02:54 PM    <DIR>          .
12/20/2013  02:54 PM             3,023 US_export_policy.jar
12/20/2013  02:54 PM             7,323 README.txt
12/20/2013  02:54 PM             3,035 local_policy.jar
               3 File(s)         13,381 bytes

     Total Files Listed:
               4 File(s)         21,790 bytes
               5 Dir(s)  140,968,947,712 bytes free

C:\temp>
C:\temp>java -version
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)

C:\temp>jarsigner -verify -verbose -certs UnlimitedJCEPolicyJDK8\US_export_policy.jar

s        275 Fri Dec 20 10:54:00 EST 2013 META-INF/MANIFEST.MF

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

         409 Fri Dec 20 10:54:00 EST 2013 META-INF/ORACLE_J.SF
        2027 Fri Dec 20 10:54:00 EST 2013 META-INF/ORACLE_J.RSA
           0 Fri Dec 20 03:09:42 EST 2013 META-INF/
sm       141 Fri Dec 20 03:09:42 EST 2013 default_US_export.policy

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

sm       419 Thu Dec 19 18:45:20 EST 2013 source_tips

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]


  s = signature was verified
  m = entry is listed in manifest
  k = at least one certificate was found in keystore
  i = at least one certificate was found in identity scope

- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 1024-bit key

jar verified.

Warning:
This jar contains entries whose signer certificate has expired.
This jar contains entries whose certificate chain is invalid. Reason: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
This jar contains signatures that do not include a timestamp. Without a timestamp, users may not be able to validate this jar after any of the signer certificates expire (as early as 2016-04-14).

C:\temp>
C:\temp>jarsigner -verify -verbose -certs UnlimitedJCEPolicyJDK8\local_policy.jar

s        271 Fri Dec 20 10:54:04 EST 2013 META-INF/MANIFEST.MF

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

         405 Fri Dec 20 10:54:06 EST 2013 META-INF/ORACLE_J.SF
        2027 Fri Dec 20 10:54:06 EST 2013 META-INF/ORACLE_J.RSA
           0 Fri Dec 20 03:09:42 EST 2013 META-INF/
sm       192 Fri Dec 20 03:09:42 EST 2013 default_local.policy

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

sm       419 Thu Dec 19 18:45:20 EST 2013 source_tips

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]


  s = signature was verified
  m = entry is listed in manifest
  k = at least one certificate was found in keystore
  i = at least one certificate was found in identity scope

- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 1024-bit key

jar verified.

Warning:
This jar contains entries whose signer certificate has expired.
This jar contains entries whose certificate chain is invalid. Reason: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
This jar contains signatures that do not include a timestamp. Without a timestamp, users may not be able to validate this jar after any of the signer certificates expire (as early as 2016-04-14).

C:\temp>
C:\temp>dir /o:gd/s
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\temp

06/19/2020  05:09 PM    <DIR>          UnlimitedJCEPolicyJDK8
08/07/2020  07:21 AM    <DIR>          ..
08/07/2020  07:21 AM    <DIR>          .
08/07/2020  07:01 AM            12,417 jce_policy-8(1).zip
               1 File(s)         12,417 bytes

 Directory of C:\temp\UnlimitedJCEPolicyJDK8

06/19/2020  05:09 PM    <DIR>          ..
06/19/2020  05:09 PM    <DIR>          .
06/19/2020  05:09 PM             5,373 US_export_policy.jar
06/19/2020  05:09 PM             5,372 local_policy.jar
07/01/2020  09:44 AM             7,921 README.txt
               3 File(s)         18,666 bytes

     Total Files Listed:
               4 File(s)         31,083 bytes
               5 Dir(s)  140,971,876,352 bytes free

C:\temp>
C:\temp>jarsigner -verify -verbose -certs UnlimitedJCEPolicyJDK8\US_export_policy.jar

s        275 Fri Jun 19 14:09:32 EDT 2020 META-INF/MANIFEST.MF

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

         410 Fri Jun 19 14:09:52 EDT 2020 META-INF/ORACLE_J.SF
        2351 Fri Jun 19 14:09:52 EDT 2020 META-INF/ORACLE_J.RSA
         410 Fri Jun 19 14:09:32 EDT 2020 META-INF/LEGACY-O.SF
        2027 Fri Jun 19 14:09:32 EDT 2020 META-INF/LEGACY-O.RSA
           0 Mon Apr 27 07:09:08 EDT 2020 META-INF/
sm       141 Mon Apr 27 07:09:06 EDT 2020 default_US_export.policy

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

sm       419 Fri Jun 19 14:09:14 EDT 2020 source_tips

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]


  s = signature was verified
  m = entry is listed in manifest
  k = at least one certificate was found in keystore
  i = at least one certificate was found in identity scope

- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 2048-bit key
- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 1024-bit key

jar verified.

Warning:
This jar contains entries whose signer certificate has expired.
This jar contains entries whose certificate chain is invalid. Reason: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
This jar contains signatures that do not include a timestamp. Without a timestamp, users may not be able to validate this jar after any of the signer certificates expire (as early as 2016-04-14).

C:\temp>
C:\temp>jarsigner -verify -verbose -certs UnlimitedJCEPolicyJDK8\local_policy.jar

s        271 Fri Jun 19 14:09:34 EDT 2020 META-INF/MANIFEST.MF

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

         406 Fri Jun 19 14:09:54 EDT 2020 META-INF/ORACLE_J.SF
        2351 Fri Jun 19 14:09:54 EDT 2020 META-INF/ORACLE_J.RSA
         406 Fri Jun 19 14:09:34 EDT 2020 META-INF/LEGACY-O.SF
        2027 Fri Jun 19 14:09:34 EDT 2020 META-INF/LEGACY-O.RSA
           0 Mon Apr 27 07:09:08 EDT 2020 META-INF/
sm       192 Mon Apr 27 07:09:06 EDT 2020 default_local.policy

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

sm       419 Fri Jun 19 14:09:14 EDT 2020 source_tips

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]


  s = signature was verified
  m = entry is listed in manifest
  k = at least one certificate was found in keystore
  i = at least one certificate was found in identity scope

- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 2048-bit key
- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 1024-bit key

jar verified.

Warning:
This jar contains entries whose signer certificate has expired.
This jar contains entries whose certificate chain is invalid. Reason: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
This jar contains signatures that do not include a timestamp. Without a timestamp, users may not be able to validate this jar after any of the signer certificates expire (as early as 2016-04-14).

C:\temp>


======================================================================

Current versions of the JDK do not require separate unlimited policy files.
They are provided for use with older versions.

The unlimited policy files for earlier releases are required only for
JDK 8 updates earlier than 8u161.

On later versions unlimited strength cryptographic algorithms are
available by default.

See https://bugs.openjdk.java.net/browse/JDK-8170157 for details.

The information provided below is relevant to old JDK versions only.


C:\Users\David Holberton\Downloads>dir /o:gd jdk-8u2*x64*exe
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Users\David Holberton\Downloads

01/30/2019  11:14 AM       217,539,936 jdk-8u201-windows-x64.exe
01/30/2019  11:17 AM       221,852,512 jdk-8u202-windows-x64.exe
04/16/2019  08:28 PM       225,748,832 jdk-8u211-windows-x64.exe
04/16/2019  08:30 PM       225,718,112 jdk-8u212-windows-x64.exe
07/31/2019  07:45 AM       225,811,416 jdk-8u221-windows-x64.exe
10/21/2019  07:44 PM       220,392,992 jdk-8u231-windows-x64.exe
01/19/2020  04:12 PM       221,163,040 jdk-8u241-windows-x64.exe
04/16/2020  12:26 PM       221,816,968 jdk-8u251-windows-x64.exe
07/16/2020  10:10 AM       174,353,032 jdk-8u261-windows-x64.exe
07/20/2020  06:36 AM       174,353,032 jdk-8u261-windows-x64(1).exe
              10 File(s)  2,128,749,872 bytes
               0 Dir(s)  140,920,946,688 bytes free

C:\Users\David Holberton\Downloads>
C:\Users\David Holberton\Downloads>cd \LocalApps\Java

C:\LocalApps\Java>
C:\LocalApps\Java>dir /o:gn
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\Java

08/07/2020  08:17 AM    <DIR>          .
08/07/2020  08:17 AM    <DIR>          ..
03/15/2018  09:52 AM    <DIR>          jdk1.8.0_131
03/15/2018  09:38 AM    <DIR>          jdk1.8.0_144
03/15/2018  09:53 AM    <DIR>          jdk1.8.0_162
06/19/2018  06:24 PM    <DIR>          jdk1.8.0_172
03/12/2020  06:00 AM    <DIR>          jdk1.8.0_241
08/07/2020  08:14 AM    <DIR>          jdk1.8.0_251
07/20/2020  07:02 AM    <DIR>          jdk1.8.0_261
06/19/2018  03:58 PM    <DIR>          jdk-10.0.1
03/15/2018  09:53 AM    <DIR>          jdk-9.0.4
03/15/2018  09:52 AM    <DIR>          jre1.8.0_131
03/15/2018  09:38 AM    <DIR>          jre1.8.0_144
03/15/2018  09:42 AM    <DIR>          jre1.8.0_162
06/19/2018  06:24 PM    <DIR>          jre1.8.0_172
03/12/2020  06:00 AM    <DIR>          jre1.8.0_241
08/07/2020  08:17 AM    <DIR>          jre1.8.0_251
07/20/2020  07:02 AM    <DIR>          jre1.8.0_261
06/19/2018  03:57 PM    <DIR>          jre-10.0.1
03/15/2018  09:47 AM    <DIR>          jre-9.0.4
               0 File(s)              0 bytes
              20 Dir(s)  139,366,916,096 bytes free

C:\LocalApps\Java>
C:\LocalApps\Java>cd jre1.8.0_261\lib\security

C:\LocalApps\Java\jre1.8.0_261\lib\security>dir /o:gd
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\Java\jre1.8.0_261\lib\security

07/20/2020  07:01 AM    <DIR>          policy
07/20/2020  07:01 AM    <DIR>          ..
07/20/2020  07:01 AM    <DIR>          .
07/20/2020  07:01 AM             4,054 blacklist
07/20/2020  07:01 AM             1,273 blacklisted.certs
07/20/2020  07:01 AM           103,206 cacerts
07/20/2020  07:01 AM             2,466 java.policy
07/20/2020  07:01 AM            47,290 java.security
07/20/2020  07:01 AM                98 javaws.policy
07/20/2020  07:01 AM                 0 trusted.libraries
               7 File(s)        158,387 bytes
               3 Dir(s)  140,925,243,392 bytes free

C:\LocalApps\Java\jre1.8.0_261\lib\security>
C:\LocalApps\Java\jre1.8.0_261\lib\security>dir /o:gd/s policy
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\Java\jre1.8.0_261\lib\security\policy

07/20/2020  07:01 AM    <DIR>          ..
07/20/2020  07:01 AM    <DIR>          limited
07/20/2020  07:01 AM    <DIR>          .
07/20/2020  07:01 AM    <DIR>          unlimited
               0 File(s)              0 bytes

 Directory of C:\LocalApps\Java\jre1.8.0_261\lib\security\policy\limited

07/20/2020  07:01 AM    <DIR>          ..
07/20/2020  07:01 AM    <DIR>          .
07/20/2020  07:01 AM             3,866 local_policy.jar
07/20/2020  07:01 AM             3,386 US_export_policy.jar
               2 File(s)          7,252 bytes

 Directory of C:\LocalApps\Java\jre1.8.0_261\lib\security\policy\unlimited

07/20/2020  07:01 AM    <DIR>          ..
07/20/2020  07:01 AM    <DIR>          .
07/20/2020  07:01 AM             3,397 local_policy.jar
07/20/2020  07:01 AM             3,386 US_export_policy.jar
               2 File(s)          6,783 bytes

     Total Files Listed:
               4 File(s)         14,035 bytes
               8 Dir(s)  140,924,420,096 bytes free

C:\LocalApps\Java\jre1.8.0_261\lib\security>
C:\LocalApps\Java\jre1.8.0_261\lib\security>cd policy\unlimited

C:\LocalApps\Java\jre1.8.0_261\lib\security\policy\unlimited>jarsigner -verify -verbose -certs US_export_policy.jar

s        237 Tue Mar 03 08:40:46 EST 2020 META-INF/MANIFEST.MF

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

         333 Tue Mar 03 08:40:46 EST 2020 META-INF/ORACLE_J.SF
        2343 Tue Mar 03 08:40:46 EST 2020 META-INF/ORACLE_J.RSA
           0 Tue Mar 03 16:11:36 EST 2020 META-INF/
sm       141 Tue Mar 03 16:11:32 EST 2020 default_US_export.policy

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

sm       419 Tue Mar 03 07:19:26 EST 2020 source_tips

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 1/28/20 8:33 PM to 12/28/30 7:00 PM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Oracle Corporation
      [certificate is valid from 7/6/16 7:48 PM to 12/30/30 7:00 PM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]


  s = signature was verified
  m = entry is listed in manifest
  k = at least one certificate was found in keystore
  i = at least one certificate was found in identity scope

- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Oracle Corporation"
    Digest algorithm: SHA1
    Signature algorithm: SHA1withRSA, 2048-bit key

jar verified.

Warning:
This jar contains entries whose certificate chain is invalid. Reason: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
This jar contains signatures that do not include a timestamp. Without a timestamp, users may not be able to validate this jar after any of the signer certificates expire (as early as 2030-12-28).

The signer certificate will expire on 2030-12-28.

C:\LocalApps\Java\jre1.8.0_261\lib\security\policy\unlimited>
C:\LocalApps\Java\jre1.8.0_261\lib\security\policy\unlimited>



C:\LocalApps>cd java

C:\LocalApps\Java>
C:\LocalApps\Java>cd jre1.8.0_251\lib\security

C:\LocalApps\Java\jre1.8.0_251\lib\security>dir /o:gd
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\Java\jre1.8.0_251\lib\security

08/07/2020  08:17 AM    <DIR>          policy
08/07/2020  08:17 AM    <DIR>          ..
08/07/2020  08:17 AM    <DIR>          .
08/07/2020  08:17 AM             4,054 blacklist
08/07/2020  08:17 AM             1,253 blacklisted.certs
08/07/2020  08:17 AM           105,352 cacerts
08/07/2020  08:17 AM             2,466 java.policy
08/07/2020  08:17 AM            46,199 java.security
08/07/2020  08:17 AM                98 javaws.policy
08/07/2020  08:17 AM                 0 trusted.libraries
               7 File(s)        159,422 bytes
               3 Dir(s)  139,361,476,608 bytes free

C:\LocalApps\Java\jre1.8.0_251\lib\security>dir /s policy
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\LocalApps\Java\jre1.8.0_251\lib\security\policy

08/07/2020  08:17 AM    <DIR>          .
08/07/2020  08:17 AM    <DIR>          ..
08/07/2020  08:17 AM    <DIR>          limited
08/07/2020  08:17 AM    <DIR>          unlimited
               0 File(s)              0 bytes

 Directory of C:\LocalApps\Java\jre1.8.0_251\lib\security\policy\limited

08/07/2020  08:17 AM    <DIR>          .
08/07/2020  08:17 AM    <DIR>          ..
08/07/2020  08:17 AM             3,527 local_policy.jar
08/07/2020  08:17 AM             3,026 US_export_policy.jar
               2 File(s)          6,553 bytes

 Directory of C:\LocalApps\Java\jre1.8.0_251\lib\security\policy\unlimited

08/07/2020  08:17 AM    <DIR>          .
08/07/2020  08:17 AM    <DIR>          ..
08/07/2020  08:17 AM             3,035 local_policy.jar
08/07/2020  08:17 AM             3,023 US_export_policy.jar
               2 File(s)          6,058 bytes

     Total Files Listed:
               4 File(s)         12,611 bytes
               8 Dir(s)  139,361,476,608 bytes free

C:\LocalApps\Java\jre1.8.0_251\lib\security>
C:\LocalApps\Java\jre1.8.0_251\lib\security>cd policy\unlimited

C:\LocalApps\Java\jre1.8.0_251\lib\security\policy\unlimited>jarsigner -verify -verbose -certs US_export_policy.jar

s        275 Fri Dec 20 10:54:00 EST 2013 META-INF/MANIFEST.MF

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

         409 Fri Dec 20 10:54:00 EST 2013 META-INF/ORACLE_J.SF
        2027 Fri Dec 20 10:54:00 EST 2013 META-INF/ORACLE_J.RSA
           0 Fri Dec 20 03:09:42 EST 2013 META-INF/
sm       141 Fri Dec 20 03:09:42 EST 2013 default_US_export.policy

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]

sm       419 Thu Dec 19 18:45:20 EST 2013 source_tips

      >>> Signer
      X.509, CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc
      [certificate expired on 4/14/16 2:00 AM]
      X.509, CN=JCE Code Signing CA, OU=Java Software Code Signing, O=Sun Microsystems Inc, L=Palo Alto, ST=CA, C=US
      [certificate expired on 4/25/20 3:00 AM]
      [Invalid certificate chain: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target]


  s = signature was verified
  m = entry is listed in manifest
  k = at least one certificate was found in keystore
  i = at least one certificate was found in identity scope

- Signed by "CN=Oracle Corporation, OU=Java Software Code Signing, O=Sun Microsystems Inc"
    Digest algorithm: SHA-256
    Signature algorithm: SHA256withRSA, 1024-bit key

jar verified.

Warning:
This jar contains entries whose signer certificate has expired.
This jar contains entries whose certificate chain is invalid. Reason: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
This jar contains signatures that do not include a timestamp. Without a timestamp, users may not be able to validate this jar after any of the signer certificates expire (as early as 2016-04-14).

C:\LocalApps\Java\jre1.8.0_251\lib\security\policy\unlimited>
C:\LocalApps\Java\jre1.8.0_251\lib\security\policy\unlimited>
```
