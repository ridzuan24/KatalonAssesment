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

WebUI.click(findTestObject('Object Repository/QualificationSkill/RenameSkill/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/QualificationSkill/RenameSkill/Page_OrangeHRM/li_Qualifications'))

WebUI.click(findTestObject('Object Repository/QualificationSkill/RenameSkill/Page_OrangeHRM/li_Skills'))

WebUI.verifyElementPresent(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/button_G Suite_oxd-icon-button oxd-table-cell-action-space'), 
    0)

WebUI.click(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/button_G Suite_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'))

WebUI.sendKeys(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    editSkillName)

WebUI.click(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('QualificationSkill/RenameSkill/Page_OrangeHRM/Page_OrangeHRM/div_SuccessSuccessfully Updated'), 
    0)

