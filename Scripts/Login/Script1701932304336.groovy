import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Test Cases/LaunchURL'), [:] , FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()
try {
	WebElement Username = driver.findElement(By.xpath('//input[@name=\'username\']'))
	if (Username.isDisplayed()) {
		Username.sendKeys('Admin')
		Thread.sleep(1)

		WebElement Password = driver.findElement(By.xpath('//input[@name=\'password\']'))
		if (Password.isDisplayed()) {
			Password.sendKeys('admin123')
			Thread.sleep(1)

			WebElement LoginButton = driver.findElement(By.xpath('//button[text()=\' Login \']'))
			LoginButton.click()
			
			driver.close()
		} else {
			KeywordUtil.markFailed('Failed To Enter Password...!!')
		}
	} else {
		KeywordUtil.markFailed('Failed To Enter Username...!!')
	}
}
catch (Exception Ex) {
	KeywordUtil.markFailed('Application Login Failed, Please Try Again...!!')
}


