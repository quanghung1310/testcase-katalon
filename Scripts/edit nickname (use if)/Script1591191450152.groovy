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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/login')
if(true){
	

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_hello - teamm5 Mattermost/svg'))

WebUI.click(findTestObject('Page_hello - teamm5 Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Page_hello - teamm5 Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_hello - teamm5 Mattermost/input_Nickname_nickname'), 'admin123')

WebUI.click(findTestObject('Page_hello - teamm5 Mattermost/span_Save'))

WebUI.click(findTestObject('Page_hello - teamm5 Mattermost/span_'))

WebUI.closeBrowser()
}
else
System.out.println("condition fail");
