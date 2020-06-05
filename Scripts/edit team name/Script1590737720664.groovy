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

WebUI.callTestCase(findTestCase('admin login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Town Square - teamm1 Mattermost/span'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - teamm1 Mattermost/span_Team Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - teamm1 Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm1 Mattermost/input_Team Name_teamName'), name)

WebUI.click(findTestObject('Object Repository/Page_Town Square - teamm1 Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/button_Close'))

