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

Mobile.startApplication('C:\\Users\\DENGUYEN-97\\Desktop\\KCPM\\Attendant-Checking-Android-master\\app\\build\\outputs\\apk\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('android.widget.TextView1 - Set Host (1)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Input your host here (1)'), 'http://api-andoroid.000webhostapp.com/', 
    0)

Mobile.tap(findTestObject('android.widget.Button1 - GET HOST FROM ONLINE'), 0)

