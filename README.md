# Demo Web Backend for Girl's Day 2016

![Girl's Day](http://www.girls-day.de/design/girls_day/images/girls-day-logo.png)

Used to practically illustrate the different parts and pieces of today's web professional media portals and show the different participating roles.

- What is the application comprised of
- How is it delivered
- How is it deployed
- How is it operated
- How is it used

Based on "Stock Tomcat with Gradle" project for openshift together with tangram:

![Tangram](https://raw.githubusercontent.com/mgoellnitz/girlsday/master/tangram-logo-fulltext-small.jpg)

## Deployment

This example can for simplicity directly be deployed to the OpenShift Platform from the creation dialog when y
ou enter this github.com repository URL.

Since you will need to add the MongoDB afterwards, you have to clean the Tangram Restart Cache by removing the 
corresponding file manually. After that step everything should work like to the local use case.

## Quickstart for Stock Apache Tomcat together with Gradle on the OpenShift Platform

Look at the action hooks to understand the steps customized and change the version of Gradle and Apache Tomcat there easily.

The OpenShift `diy` cartridge documentation can be found at:

http://openshift.github.io/documentation/oo_cartridge_guide.html#diy

So this quickstart is a combination of the work of Shekhar Gulati at https://www.openshift.com/blogs/run-gradle-builds-on-openshift with the code at https://github.com/shekhargulati/gradle-openshift-quickstart and the tomcat quickstart https://github.com/openshift-quickstart/openshift-tomcat-quickstart

I chose not to put the binaries of the tomcat into the git repository though.
