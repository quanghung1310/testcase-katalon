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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [('username') : 'admin', ('password') : curPass], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Town Square - hung Mattermost/button_admin_style--none sidebar-header-dropdown__icon'))

WebUI.click(findTestObject('Page_Town Square - team6 Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/button_Security'))

WebUI.click(findTestObject('Page_Town Square - hung Mattermost/h4_Password'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/input_Current Password_currentPassword'), 
    curPass)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/input_New Password_newPassword'), newPass)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/input_Retype New Password_confirmPassword'), 
    repeatPass)

WebUI.click(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/span_Save'))

WebUI.verifyElementNotPresent(findTestObject('Page_Town Square - team6 Mattermost/serverError'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_Town Square - team6 Mattermost/clientError'), 0)

WebUI.closeBrowser()

