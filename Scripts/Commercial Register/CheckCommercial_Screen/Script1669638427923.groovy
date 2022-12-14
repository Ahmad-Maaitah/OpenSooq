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

Mobile.callTestCase(findTestCase('Login/MyAccount_Login'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.scrollToText('حمّل السجل التجاري')

//Check Elements Exist From My Account

Mobile.tap(findTestObject('Commercial/UploadCommercial_MyAccount'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Commercial/BackBtn_Commercial'), 5, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Commercial/UploadDocumentBtn_Commercial'), 5, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Commercial/ImgFromGallery_Commercial'), 5, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Commercial/NextBtnGallery_Commercial'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Commercial/ImgFrom_Commercial'), 5, FailureHandling.STOP_ON_FAILURE)

//Close the app
Mobile.closeApplication()