grails-migration

http://raibledesigns.com/rd/entry/upgrading_grails_from_2_0

http://burtbeckwith.com/blog/?paged=2

http://burtbeckwith.com/blog/?p=1457

http://burtbeckwith.com/blog/?p=1698

http://grails.org/plugins

http://docs.grails.org/2.5.4/guide/plugins.html#creatingAndInstallingPlugins

https://www.infoq.com/news/2014/05/Groovy-2.3-Released

http://stackoverflow.com/questions/2871977/binding-a-grails-date-from-params-in-a-controller

http://docs.grails.org/2.5.0/guide/upgradingFrom23.html

http://docs.grails.org/2.5.0/guide/upgradingFrom22.html

https://github.com/grails/grails-data-mapping/issues/540

http://stackoverflow.com/questions/38829209/grails-upgrade-to-2-5-5-unresolved-dependencies-groovy-all-2-4-5?utm_source=dlvr.it&utm_medium=twitter

https://github.com/grails/grails-core/issues/10011

https://github.com/grails/grails-core/commit/0ec157df1ec607ef7da58a751979f28d9a090cf4

http://grails.org/plugin/resources

http://grails-plugins.github.io/grails-resources/

http://grails.org/plugin/zipped-resources

http://grails.org/plugin/cached-resources

http://grails.org/plugin/cache-headers

http://www.anyware.co.uk/2005/2011/09/12/optimising-your-application-with-grails-resources-plugin/

http://www.technipelago.se/blog/show/grails-upgrade-1.3.7-to-2.0.1http://www.technipelago.se/blog/show/grails-upgrade-1.3.7-to-2.0.1

https://blog.oio.de/2011/04/13/displaying-hibernate-statistics-in-a-grails-app/

http://grails.org/plugin/hibernate-stats

http://www.groovymag.com/main.issues.description/id=6/

https://bertramdev.github.io/grails-asset-pipeline/guide/usage.html

https://bertramdev.github.io/grails-asset-pipeline/guide/usage.html

http://www.oodlestechnologies.com/blogs/Importance-of-Grails-asset-pipeline-plugin

http://www.redwindsw.com/blog/2013-08-03-grails-asset-pipeline-why-it-s-better

https://github.com/bertramdev/grails-asset-pipeline/issues/324

http://stackoverflow.com/questions/36324846/how-to-disable-digest-in-asset-pipeline-grails

http://bertramdev.github.io/grails-asset-pipeline/guide/releases.html

https://objectpartners.com/2015/05/14/list-of-groovy-versions-for-each-version-of-grails/

http://grails.1312388.n4.nabble.com/request-JSON-empty-if-command-object-is-parameter-of-controller-method-td4655576.html

http://docs.grails.org/latest/guide/theWebLayer.html#commandObjects%E2%80%A6

http://docs.grails.org/latest/guide/theWebLayer.html#commandObjects

http://stackoverflow.com/questions/24782459/how-to-group-js-and-css-using-grails-asset-pipeline-plugin

http://stackoverflow.com/questions/25247844/converting-resources-plugin-modules-to-asset-pipeline

http://tednaleid.github.io/asset-pipeline-presentation/?full#5

http://tednaleid.github.io/asset-pipeline-presentation/

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

http://docs.grails.org/2.5.0/guide/upgradingFrom23.html

Data Binding Changes

Prior to Grails 2.4 when data binding was performed with the params object in a controller, if the request contained a body the body would be parsed and used for data binding instead of the params object. In Grails 2.4 this behavior has changed so that if binding is initiated with params, the binding will always be done with the params object, without regard to whether or not the request has a body. If binding is done with the request object, if the request has a body then the body will be parsed and used for data binding, otherwise the request parameters will be used for data binding.

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

http://docs.grails.org/2.5.4/guide/security.html#xssPrevention

GSP features the ability to automatically HTML encode GSP expressions, and as of Grails 2.3 this is the default configuration.

Versions of Grails prior to 2.3, included the ability to set the default codec to html, however enabling this setting sometimes proved problematic when using existing plugins due to encoding being applied twice (once by the html codec and then again if the plugin manually called encodeAsHTML).

Grails 2.3 includes double encoding prevention so that when an expression is evaluated, it will not encode if the data has already been encoded (Example ${foo.encodeAsHTML()}).

If you are 100% sure that the value you wish to present on the page has not been received from user input, and you do not wish the value to be encoded then you can use the raw method:

${raw(book.title)}

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

http://docs.grails.org/2.5.4/guide/theWebLayer.html#contentNegotiation

Content Negotiation with URI Extensions

Grails also supports content negotiation using URI extensions. For example given the following URI:

/book/list.xml

This works as a result of the default URL Mapping definition which is:

"/$controller/$action?/$id?(.$format)?"{

Note the inclusion of the format variable in the path. If you do not wish to use content negotiation via the file extension then simply remove this part of the URL mapping:

"/$controller/$action?/$id?"{



grails-migration

http://raibledesigns.com/rd/entry/upgrading_grails_from_2_0

http://burtbeckwith.com/blog/?paged=2

http://burtbeckwith.com/blog/?p=1457

http://burtbeckwith.com/blog/?p=1698

http://grails.org/plugins

http://docs.grails.org/2.5.4/guide/plugins.html#creatingAndInstallingPlugins

https://www.infoq.com/news/2014/05/Groovy-2.3-Released

http://stackoverflow.com/questions/2871977/binding-a-grails-date-from-params-in-a-controller

http://docs.grails.org/2.5.0/guide/upgradingFrom23.html

http://docs.grails.org/2.5.0/guide/upgradingFrom22.html

https://github.com/grails/grails-data-mapping/issues/540

http://stackoverflow.com/questions/38829209/grails-upgrade-to-2-5-5-unresolved-dependencies-groovy-all-2-4-5?utm_source=dlvr.it&utm_medium=twitter

https://github.com/grails/grails-core/issues/10011

https://github.com/grails/grails-core/commit/0ec157df1ec607ef7da58a751979f28d9a090cf4

http://grails.org/plugin/resources

http://grails-plugins.github.io/grails-resources/

http://grails.org/plugin/zipped-resources

http://grails.org/plugin/cached-resources

http://grails.org/plugin/cache-headers

http://www.anyware.co.uk/2005/2011/09/12/optimising-your-application-with-grails-resources-plugin/

http://www.technipelago.se/blog/show/grails-upgrade-1.3.7-to-2.0.1http://www.technipelago.se/blog/show/grails-upgrade-1.3.7-to-2.0.1

https://blog.oio.de/2011/04/13/displaying-hibernate-statistics-in-a-grails-app/

http://grails.org/plugin/hibernate-stats

http://www.groovymag.com/main.issues.description/id=6/

https://bertramdev.github.io/grails-asset-pipeline/guide/usage.html

https://bertramdev.github.io/grails-asset-pipeline/guide/usage.html

http://www.oodlestechnologies.com/blogs/Importance-of-Grails-asset-pipeline-plugin

http://www.redwindsw.com/blog/2013-08-03-grails-asset-pipeline-why-it-s-better

https://github.com/bertramdev/grails-asset-pipeline/issues/324

http://stackoverflow.com/questions/36324846/how-to-disable-digest-in-asset-pipeline-grails

http://bertramdev.github.io/grails-asset-pipeline/guide/releases.html

https://objectpartners.com/2015/05/14/list-of-groovy-versions-for-each-version-of-grails/

http://grails.1312388.n4.nabble.com/request-JSON-empty-if-command-object-is-parameter-of-controller-method-td4655576.html

http://docs.grails.org/latest/guide/theWebLayer.html#commandObjects%E2%80%A6

http://docs.grails.org/latest/guide/theWebLayer.html#commandObjects

http://stackoverflow.com/questions/24782459/how-to-group-js-and-css-using-grails-asset-pipeline-plugin

http://stackoverflow.com/questions/25247844/converting-resources-plugin-modules-to-asset-pipeline

http://tednaleid.github.io/asset-pipeline-presentation/?full#5

http://tednaleid.github.io/asset-pipeline-presentation/

http://hibernate-jcons.sourceforge.net/usage.html

http://stackoverflow.com/questions/21254093/running-hibernate-4-3-with-jmx-without-spring

http://docs.jboss.org/hibernate/orm/4.3/manual/en-US/html_single/#performance-monitoring-sf

http://shengwangi.blogspot.com/2015/06/how-to-use-jmx-to-monitor-hibernate-43.html

https://hibernate.atlassian.net/browse/HHH-6190

Marcel Stör added a comment - 14/Jan/2014 02:45 AM - edited

Why did you remove StatisticsService with 4.3.0.Final (source points to this issue) without providing an alternative? If I interpret the comment above and the related issues correctly there will only be a fix for >= 5.x? Or is org.hibernate.cache.ehcache.management.impl.HibernateStatsImpl from hibernate-ehcache-4.3.0.Final.jar supposed to be the alternative? I doubt it because it exposes a different set of attributes.

Btw, the docs still contain an example that uses StatisticsService: http://docs.jboss.org/hibernate/orm/4.3/manual/en-US/html_single/#performance-monitoring-sf


Guenther Demetz added a comment - 16/Jan/2014 00:42 AM

I have the same problem as Marcel:
What is the alternative to StatisticsService (MBean) with 4.3.0.Final ?


Marcel Stör added a comment - 16/Jan/2014 00:54 AM

Well, if you happen to use Spring it's doable with low effort:

    create a Spring factory bean that returns the Hibernate statistics bean from the session factory

    public class HibernateStatisticsFactoryBean implements FactoryBean<Statistics> {

      @Autowired
      private EntityManagerFactory entityManagerFactory;

      @Override
      public Statistics getObject() throws Exception {
        SessionFactory sessionFactory = ((HibernateEntityManagerFactory) entityManagerFactory).getSessionFactory();
        return sessionFactory.getStatistics();
      }

      @Override
      public Class<?> getObjectType() {
        return Statistics.class;
      }

      @Override
      public boolean isSingleton() {
        return true;
      }
    }

    use the MBeanExport to export the above factory bean: http://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/jmx.html#jmx-mbean-server


http://shengwangi.blogspot.com/2015/06/how-to-use-jmx-to-monitor-hibernate-43.html



    package com.shengwang.demo.statistics;
     
    import org.hibernate.SessionFactory;
    import org.hibernate.stat.Statistics;
    import org.springframework.beans.factory.FactoryBean;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;
     
    @Component
    public class HibernateStatisticsFactoryBean implements FactoryBean<Statistics> {
     
      @Autowired
      private SessionFactory sessionFactory;
     
      @Override
      public Statistics getObject() throws Exception {
        return sessionFactory.getStatistics();
      }
     
      @Override
      public Class<?> getObjectType() {
        return Statistics.class;
      }
     
      @Override
      public boolean isSingleton() {
        return true;
      }
    }
    
    
    <!-- ==================================== -->
    <!--  Hibernate 4.3 Statistics for JMX    -->
    <!-- ==================================== -->
    <bean id="jmxExporter" class="org.springframework.jmx.export.MBeanExporter">
      <property name="beans">
        <map>
          <entry key="Hibernate:type=statistics">
            <ref bean="hibernateStatisticsFactoryBean"/>
          </entry>
        </map>
      </property>
    </bean>


