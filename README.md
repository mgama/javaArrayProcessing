# javaArrayProcessing
This is a small sample Java Project that is purpose is just to exemplify a simple interface and a class that implements it, along with including JUnit unit tests and test coverage via JaCoCo.
As to what the current project solves, it is the following: 
 - A Java interface, named ArrayProcessingInterface, that contains two methods for processing arrays of integers:
 
1. getLowestValueFromIntArray, which accepts a list of ints and returns the lowest value. If the list is null or empty then the method will return null
 
2. getSecondLowestValueFromIntArray, which accepts a list of ints and returns the second lowest value. If the list is null or empty then the method will return null
  
- A Java class, named ArrayProcessor, that implements the two methods from the Java Interface.

# Maven (Project Structure)
Java projects can be build and packaged using different tools, some of them include Maven, Ant, and Graddle. For this project, I decided to use Maven. 
How to install maven and running it from the commandline: https://stackoverflow.com/questions/8826881/maven-install-on-mac-os-x

# JUnit (Unit Testing) 
They are a few unit testing frameworks in Java, being the most popular JUnit and TestNG. 
For the purpose of this basic project, I integrated JUnit, which covers the needs of this project. 
If the project were to evolve in the future into a bigger application, maybe switching to TestNG would make sense. 

To run all the Junit tests, run the following command from a terminal: **mvn test**

# JaCoco (Test Coverage)
In order to analyze what is the percentage of test coverage that the project has for unit and integration tests, they were a few tools that I researched (JCov, Clover, Cobertura, JaCoCo and EMMA). 
Some basic info was found here: https://en.wikipedia.org/wiki/Java_Code_Coverage_Tools

From these test coverage tools, I was able to integrate JaCoCo on the project via the maven configurations. 
Here are some links for reference on how to do that:
https://www.petrikainulainen.net/programming/maven/creating-code-coverage-reports-for-unit-and-integration-tests-with-the-jacoco-maven-plugin/

A Sample of the JaCoCo Test Coverage report can be found on the **sampleJaCoCoTestCoverageReportFiles** directory of this project. 

To generate the most recent test coverage report, please run this command from a terminal: **mvn clean test**

The report will be generated under this directory: **target/site/jacoco-ut/index.html**

# JavaDoc (Documentation)
It is a common practice to also have documentation of the api's created on a java project. JavaDoc is the default tool for this and it has also been integrated on the project. 
A Sample of the JavaDocs can be found on the **sampleJavaDocs** directory of this project. 

To generate the most recent test coverage report, please run this command from a terminal: **mvn javadoc:javadoc**

The report will be generated under this directory: **target/site/apidocs/index.html**