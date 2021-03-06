import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://jqueryui.com/datepicker/')

'Input date you want to pickup and verify.'
CustomKeywords.'jqueryui.com.widgets.Datepicker.pickDate'(findTestObject('jqueryui.com/widgets/datepicker/txt_datePicker'), 
    '09/18/2020')

println(WebUI.getAttribute(findTestObject('jqueryui.com/widgets/datepicker/txt_datePicker'), 'value'))

CustomKeywords.'capture.screen.shots.CaptureScreen.takeCaptureScreen'('DatePicker')

WebUI.verifyElementAttributeValue(findTestObject('jqueryui.com/widgets/datepicker/txt_datePicker'), 'value', '09/18/2020', 
    0)

