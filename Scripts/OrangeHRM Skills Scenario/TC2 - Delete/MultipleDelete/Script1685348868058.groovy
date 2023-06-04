import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common/Login'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QualificationSkill/MultipleDelete/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/QualificationSkill/MultipleDelete/Page_OrangeHRM/li_Qualifications'))

WebUI.click(findTestObject('Object Repository/QualificationSkill/MultipleDelete/Page_OrangeHRM/li_Skills'))

WebUI.click(findTestObject('QualificationSkill/MultipleDelete/Page_OrangeHRM/i_ContentCreation_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('QualificationSkill/MultipleDelete/Page_OrangeHRM/i_Copywriting_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('QualificationSkill/MultipleDelete/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('QualificationSkill/MultipleDelete/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('QualificationSkill/DeleteSkill/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 
    0)

