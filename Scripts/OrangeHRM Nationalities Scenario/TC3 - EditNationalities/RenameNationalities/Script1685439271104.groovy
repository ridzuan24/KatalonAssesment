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

WebUI.click(findTestObject('Nationalities/AddNationalities/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Nationalities/AddNationalities/Page_OrangeHRM/li_Nationalities'))

WebUI.verifyElementClickable(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/button_Afghan_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/button_Afghan_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'))

WebUI.sendKeys(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), renameNationalities)

WebUI.click(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Nationalities/EditNationalities/Page_OrangeHRM/div_SuccessSuccessfully Updated'), 
    0)

WebUI.closeBrowser()

