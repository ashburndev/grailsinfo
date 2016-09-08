http://raibledesigns.com/rd/entry/upgrading_grails_from_2_0

http://burtbeckwith.com/blog/?paged=2

http://burtbeckwith.com/blog/?p=1457

http://burtbeckwith.com/blog/?p=1698

http://grails.org/plugins

http://docs.grails.org/2.5.4/guide/plugins.html#creatingAndInstallingPlugins

https://www.infoq.com/news/2014/05/Groovy-2.3-Released

https://opensource.com/life/16/7/top-10-Raspberry-Pi-boards

http://stackoverflow.com/questions/2871977/binding-a-grails-date-from-params-in-a-controller

http://docs.grails.org/2.5.0/guide/upgradingFrom23.html

http://docs.grails.org/2.5.0/guide/upgradingFrom22.html

https://github.com/grails/grails-data-mapping/issues/540



- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

http://docs.grails.org/2.5.0/guide/upgradingFrom23.html

Data Binding Changes

Prior to Grails 2.4 when data binding was performed with the params object in a controller, if the request contained a body the body would be parsed and used for data binding instead of the params object. In Grails 2.4 this behavior has changed so that if binding is initiated with params, the binding will always be done with the params object, without regard to whether or not the request has a body. If binding is done with the request object, if the request has a body then the body will be parsed and used for data binding, otherwise the request parameters will be used for data binding.



