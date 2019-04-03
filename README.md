# Automation_Test_Katalon_Studio
This repository content sample test automation project with Katalon Studio.

1. Add [Test Listeners]
  + This class add methods will be executed before test case start, and after test case end.
  + Steps:
    - Inside afterTestCase method, we will call WebUI.closeBrowser() to close browser.

2. Test jQueryUI
  + Link URL: https://jqueryui.com
  + Test Object: datepicker
  + Test Steps:
    - Create test objects.
	- Create test case.
	- Create custom keyword Datepicker.
	- Create test suite.

3. Customize Keywords
  + Customize function capture screen with path is defined.
  + Steps:
    - Define Global variable: Path_Captured_Screen is path to contain captured image.
    - Create custom keyword CaptureScreen class.

4. Data Driver Testing With Login Function
  + Link URL: https://the-internet.herokuapp.com/login
  + Test Object: Login Function.
  + Test Steps:
    - Create test case: TC_Test_Login_With_DDT.
    - Create test data from excel file: TestData_Login is mapped from LoginFuntion_DataTest.xlsx file.
    - Create test suite, and configure data mapping.
  