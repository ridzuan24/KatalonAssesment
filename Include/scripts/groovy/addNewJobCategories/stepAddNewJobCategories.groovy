package addNewJobCategories
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class stepAddNewJobCategories {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is navigated to Job Categories page")
	def userNavigatedToJobCategories() {
		WebUI.callTestCase(findTestCase('Common/Login'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/a_Admin'))

		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/li_Job'))

		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/li_Job Categories'))
	}

	@When("User clicks on the Add button")
	def userClickButtons() {
		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/button_Add'))
	}

	@And("User add new job category (.*)")
	def enterDetails(String jobCategories) {
		WebUI.setText(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'),
				jobCategories)
	}

	@And("User clicks on save button")
	def userClicksButton() {
		WebUI.click(findTestObject('JobCategory/AddJobCategory/Page_OrangeHRM/button_Save'))
	}

	@Then("User able to add and save job categories succesfully")
	def ableToSaveLanguage() {
		WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_SuccessSuccessfully Saved'), 0)
	}
}