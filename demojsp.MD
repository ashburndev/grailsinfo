```

C:\Users\David Holberton\sbprojects\demojsp>dir /o:gd
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Users\David Holberton\sbprojects\demojsp

06/12/2019  07:11 AM    <DIR>          .settings
06/12/2019  11:06 AM    <DIR>          src
06/12/2019  11:06 AM    <DIR>          .mvn
06/12/2019  08:59 PM    <DIR>          ..
06/12/2019  08:59 PM    <DIR>          .
06/12/2019  07:11 AM               559 .project
06/12/2019  07:11 AM             1,268 .classpath
06/12/2019  09:48 AM             1,862 pom.xml
06/12/2019  11:06 AM             5,811 mvnw.cmd
06/12/2019  11:06 AM             9,114 mvnw
06/12/2019  11:06 AM               532 HELP.md
06/12/2019  11:06 AM               303 .gitignore
               7 File(s)         19,449 bytes
               5 Dir(s)  251,927,052,288 bytes free

C:\Users\David Holberton\sbprojects\demojsp>tree /a /f
Folder PATH listing
Volume serial number is 4603-A8D3
C:.
|   .classpath
|   .gitignore
|   .project
|   HELP.md
|   mvnw
|   mvnw.cmd
|   pom.xml
|
+---.mvn
|   \---wrapper
|           maven-wrapper.jar
|           maven-wrapper.properties
|           MavenWrapperDownloader.java
|
+---.settings
|       org.eclipse.core.resources.prefs
|       org.eclipse.jdt.core.prefs
|       org.eclipse.m2e.core.prefs
|
\---src
    +---main
    |   +---java
    |   |   \---com
    |   |       \---ashburndev
    |   |           \---demojsp
    |   |                   ActivityCommand.java
    |   |                   ActivityController.java
    |   |                   DemojspApplication.java
    |   |
    |   +---resources
    |   |   |   application.properties
    |   |   |
    |   |   +---static
    |   |   \---templates
    |   \---webapp
    |       \---WEB-INF
    |           +---jsp
    |           \---view
    |                   examinerActivity.jsp
    |
    \---test
        \---java
            \---com
                \---ashburndev
                    \---demojsp
                            DemojspApplicationTests.java


C:\Users\David Holberton\sbprojects\demojsp>
C:\Users\David Holberton\sbprojects\demojsp>type src\main\java\com\ashburndev\demojsp\ActivityCommand.java
package com.ashburndev.demojsp;

//  import java.util.List;
//  import java.util.Map;

public class ActivityCommand {

  String firstName;
  String lastName;
  String personsAffected;

  //  List<String> personsAffectedList;
  //  Map<String, String> personsAffectedMap;
  //  String personsAffectedListJson;
  //  String personsAffectedMapJson;

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getPersonsAffected() {
    return personsAffected;
  }
  public void setPersonsAffected(String personsAffected) {
    this.personsAffected = personsAffected;
  }

  //  public String getPersonsAffectedListJson() {
  //    return personsAffectedListJson;
  //  }
  //  public void setPersonsAffectedListJson(String personsAffectedListJson) {
  //    this.personsAffectedListJson = personsAffectedListJson;
  //  }
  //  public String getPersonsAffectedMapJson() {
  //    return personsAffectedMapJson;
  //  }
  //  public void setPersonsAffectedMapJson(String personsAffectedMapJson) {
  //    this.personsAffectedMapJson = personsAffectedMapJson;
  //  }
  //  public List<String> getPersonsAffectedList() {
  //    return personsAffectedList;
  //  }
  //  public void setPersonsAffectedList(List<String> personsAffectedList) {
  //    this.personsAffectedList = personsAffectedList;
  //  }
  //  public Map<String, String> getPersonsAffectedMap() {
  //    return personsAffectedMap;
  //  }
  //  public void setPersonsAffectedMap(Map<String, String> personsAffectedMap) {
  //    this.personsAffectedMap = personsAffectedMap;
  //  }

}

C:\Users\David Holberton\sbprojects\demojsp>type src\main\java\com\ashburndev\demojsp\ActivityController.java
package com.ashburndev.demojsp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//   https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/
//   https://www.mkyong.com/spring-mvc/spring-mvc-dropdown-box-example/
//   https://hellokoding.com/spring-boot-hello-world-example-with-jsp/
//   https://howtodoinjava.com/spring-boot/spring-boot-jsp-view-example/
//   https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/spring-form-tld.html
//   http://fruzenshtein.com/spring-mvc-form-select-tag/
//   https://dzone.com/articles/spring-mvc-jsp-form-tags-example
//   https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/view.html

@Controller
@RequestMapping("/examinerActivity")
public class ActivityController {

  @GetMapping
  public String hello(Model model,
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    model.addAttribute("name", name);

    ActivityCommand examinerActivity = new ActivityCommand();
    Map<String, String> personsAffectedMap = new LinkedHashMap<String, String>();  // preserves order
    String personsAffectedListJson = "";  // use jackson to create the string
    String personsAffectedMapJson = "";  // use jackson to create the string
    List<String> personsAffectedList =
        Arrays.asList("For this calendar", "For all Examiners", "For all calendars");
    String personsAffected = personsAffectedList.get(0);

    for (String theString : personsAffectedList) {
      System.out.println(theString);
      personsAffectedMap.put(theString, theString);
    }

    try {
      ObjectMapper mapper = new ObjectMapper();
      personsAffectedListJson = mapper.writeValueAsString(personsAffectedList);
      personsAffectedMapJson = mapper.writeValueAsString(personsAffectedMap);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    System.out.println("personsAffected = " + personsAffected);
    System.out.println("personsAffectedList = " + personsAffectedList);
    System.out.println("personsAffectedMap = " + personsAffectedMap);
    System.out.println("personsAffectedListJson = " + personsAffectedListJson);
    System.out.println("personsAffectedMapJson = " + personsAffectedMapJson);

    examinerActivity.setFirstName("John");
    examinerActivity.setLastName("Smith");
    examinerActivity.setPersonsAffected(personsAffected);
    //  examinerActivity.setPersonsAffectedList(personsAffectedList);
    //  examinerActivity.setPersonsAffectedMap(personsAffectedMap);
    //  examinerActivity.setPersonsAffectedListJson(personsAffectedListJson);
    //  examinerActivity.setPersonsAffectedMapJson(personsAffectedMapJson);

    model.addAttribute("personsAffectedList", personsAffectedList);
    model.addAttribute("personsAffectedMap", personsAffectedMap);
    model.addAttribute("personsAffectedListJson", personsAffectedListJson);
    model.addAttribute("personsAffectedMapJson", personsAffectedMapJson);
    model.addAttribute("examinerActivity", examinerActivity);
    return "examinerActivity";  // the logical name of the view
  }

  //    <form:form method="POST" path="examinerActivity">

  //    <form:form method="POST" modelAttribute="examinerActivity">

  //    <form:form method="POST" commandObject="examinerActivity" commandName="command">

  //    <form:form method="POST" commandObject="examinerActivity" commandName="examinerActivity">

  //    <form:form method="POST" action="activity-result.html">
  //      <form:select path="personsAffected" items="${personsAffectedMap}" />
  //    </form:form>

  //    <form:form method="POST" commandName="activityForm">
  //      <form:select path="personsAffected" id="personsAffected" name="personsAffected" items="${personsAffectedMap}" />
  //    </form:form>

}

C:\Users\David Holberton\sbprojects\demojsp>type src\main\webapp\WEB-INF\view\examinerActivity.jsp
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
    <script>
      var personsAffectedListJson = '${personsAffectedListJson}';
      var personsAffectedMapJson = '${personsAffectedMapJson}';
      // var personsAffectedList = YAHOO.lang.JSON.parse(personsAffectedListJson);
      // var personsAffectedMap = YAHOO.lang.JSON.parse(personsAffectedMapJson);
    </script>
  </head>
  <body>
    <h2>Hello ${name}!</h2>

    <form:form method="POST" modelAttribute="examinerActivity">
      <form:select path="personsAffected" items="${personsAffectedMap}" />
      <br/><br/>
      <form:label path="firstName">first name:</form:label>
      <form:input path="firstName"/>
      <br/><br/>
      <form:label path="lastName">last name:</form:label>
      <form:input path="lastName"/>
      <br/><br/>
      <input type="submit" value="Save Changes" />
    </form:form>

  </body>
</html>
C:\Users\David Holberton\sbprojects\demojsp>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Hello World!</title>
    <script>
      var personsAffectedListJson = '["For this calendar","For all Examiners","For all calendars"]';
      var personsAffectedMapJson = '{"For this calendar":"For this calendar","For all Examiners":"For all Examiners","For all calendars":"For all calendars"}';
      // var personsAffectedList = YAHOO.lang.JSON.parse(personsAffectedListJson);
      // var personsAffectedMap = YAHOO.lang.JSON.parse(personsAffectedMapJson);
    </script>
  </head>
  <body>
    <h2>Hello World!</h2>
    
    <form id="examinerActivity" action="/examinerActivity" method="POST">
      <select id="personsAffected" name="personsAffected"><option value="For this calendar" selected="selected">For this calendar</option><option value="For all Examiners">For all Examiners</option><option value="For all calendars">For all calendars</option></select>
      <br/><br/>
      <label for="firstName">first name:</label>
      <input id="firstName" name="firstName" type="text" value="John"/>
      <br/><br/>
      <label for="lastName">last name:</label>
      <input id="lastName" name="lastName" type="text" value="Smith"/>
      <br/><br/>
      <input type="submit" value="Save Changes" />
    </form>
    
  </body>
</html>

```
