package jqueryui.com.widgets

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static java.util.Calendar.*
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Datepicker {
	Date date;
	TestObject obj;

	Datepicker() {}
	Datepicker(TestObject testObject, String input_date) {
		this.obj = testObject;
		date = new Date().parse("MM/dd/yyyy", input_date)
	}

	def open_calendar_form() {
		WebUI.waitForElementClickable(this.obj, 0)
		WebUI.click(this.obj)
	}

	def displaying_month() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/date_month'), 0)
		return WebUI.getText(
				findTestObject('Object Repository/jqueryui.com/widgets/datepicker/date_month'),
				FailureHandling.STOP_ON_FAILURE)
	}

	def displaying_year() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/date_year'), 0)
		return WebUI.getText(
				findTestObject('Object Repository/jqueryui.com/widgets/datepicker/date_year'),
				FailureHandling.STOP_ON_FAILURE)
	}

	def displaying_date() {
		return new Date().parse("MMM/yyyy", displaying_month() + "/" + displaying_year())
	}

	def pick_year() {
		if (displaying_date()[YEAR] == date[YEAR]) return
			while (displaying_date()[YEAR] < date[YEAR]) {
				WebUI.click(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/icon_next'))
			}
		while (displaying_date()[YEAR] > date[YEAR]) {
			WebUI.click(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/icon_prev'))
		}
	}

	def pick_month() {
		if (displaying_date()[MONTH] == date[MONTH]) return
			while (displaying_date()[MONTH] < date[MONTH]) {
				WebUI.click(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/icon_next'))
			}
		while (displaying_date()[MONTH] > date[MONTH]) {
			WebUI.click(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/icon_prev'))
		}
	}

	def pick_day() {
		println date[DAY_OF_MONTH]
		WebUI.click(findTestObject('Object Repository/jqueryui.com/widgets/datepicker/date_day', [('day') : date[DAY_OF_MONTH]]))
	}

	def pick_date() {
		pick_year()
		pick_month()
		pick_day()
	}

	@Keyword
	/**
	 * This keyword is used to create test case.
	 * This function will open Datepicker form and select date is inputted.
	 * @param ob
	 * @param date
	 * @return
	 */
	def pickDate(TestObject inputTestObject, String inputDate) {
		def picker = new Datepicker(inputTestObject, inputDate)
		picker.open_calendar_form()
		picker.pick_date()
	}
}
