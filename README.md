# gutenbergFramework

# Page Object model Test automation framework using Selenium with Java, TestNG, and Maven-
This is a sample automation framework of the Gutenberg website.

This Test Automation Framework is created using Java + Selenium Web Driver + TestNG. Which can be used across different web-based applications.
Usage the POM for the reusability of the code.


# Steps to clone execute the tests
```
git clone https://github.com/AnjaliGhutke/gutenbergFramework.git
goto the Gutenberg directory
There are 2 ways to execute tests
1. using the POM.xml file you can run the command: mvn clean test
2. Using the TestNG : java org.testng.TestNG testng.xml

```

Logger: 
-----------
log4j configured to capture the test execution logs.
The configuration file is located at //config/log4j.xml
Execution log is captured in the //log/Automation_Execution.log

Screenshot:
---------------
*	Check the ScreenShot directory to see the screenshot of failed TC's


Report:
---------------
For Reporting used the ITestResultListener, check the file  /test-output/Extent.html or default testng report index.html /

Logger:
--------------
For console logger used the log4J, for the logger check the /logs/Automation_Execution.logs file.



