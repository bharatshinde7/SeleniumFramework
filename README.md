#Introduction
This is simple selenium project for Undostres web application with page object model.

#Technologoes -
1) Maven
2) selenium
3) java
4) TestNG

#General Notes
1.base.java - intializing browser's driver and data properties(we already added in resource folder in git project) 
2.pageObject (package) -  we have create different classes for the multiple pages and then save the web elements on the pages in them.
3.testCases.pages-package- we are using objects or webelements in test cases
4.src/main/resources-drivers for browsers and data.properties file with all input data
5.pom.xml- main unit of maven framework-contains dependencies of all integrated tools
 
#IMPORTANT NOTE# We can not Automate captcha , Please manually click on it to continue Automation execution flow. 

#Installation
***
A little intro about the installation. 
```
$ git clone https://example.com
$ import the maven project in eclipse/STS/IDE tool
$ HomePage.java -> right click -> Run As -> TestNG test
```