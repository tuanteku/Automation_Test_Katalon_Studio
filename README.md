# Automation_Test_Katalon_Studio
This repository content sample test automation project with Katalon Studio.

## Hook [Test Listeners]
  + This class add methods will be executed before test case start, and after test case end.
  + Steps:
    1. Inside afterTestCase method, we will call WebUI.closeBrowser() to close browser.

## Test jQueryUI
  + Link URL: https://jqueryui.com
  + Test Object: datepicker
  + Test Steps:
    1. Create test objects.
	2. Create test case.
	3. Create custom keyword Datepicker.
	4. Create test suite.

## Customize Keywords
  + Customize function capture screen with path is defined.
  + Steps:
    1. Define Global variable: Path_Captured_Screen is path to contain captured image.
    2. Create custom keyword CaptureScreen class.

## Data Driven Testing With Login Function
  + Link URL: https://the-internet.herokuapp.com/login
  + Test Object: Login Function.
  + Test Steps:
    1. Create test case: TC_Test_Login_With_DDT.
    2. Create test data from excel file: TestData_Login is mapped from LoginFuntion_DataTest.xlsx file.
    3. Create test suite, and configure data mapping.

## Call batch file from test case.
  + This sample explain how to execute batch file directly from test case.
  + Steps:
    1. Create sample batch file inside project folder.
```Gherkin
	@ECHO OFF
	SET Today=%Date:~10,4%_%Date:~7,2%_%Date:~4,2%
	ECHO %Today%
	MKDIR %Today%
	PAUSE
```
	2. Create custom keyword to run batch file.
```Gherkin
	package com.configuration.runconfiguration

	import com.kms.katalon.core.annotation.Keyword
	import com.kms.katalon.core.configuration.RunConfiguration

	public class Extbase {
		@Keyword	
		public static runBatchFile = { String batchFile ->
			Runtime rt = Runtime.getRuntime();
			
			String bf = RunConfiguration.getProjectDir() + '/' + batchFile;
			println("Full path of batch file: " + bf);
			
			Process pr = rt.exec(bf);
		}
	}
```
	3. Create test case, add custom keyword and fill path of batch file.