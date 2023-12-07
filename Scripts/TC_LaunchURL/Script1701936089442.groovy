import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()
WebElement VerfiyElement = driver.findElement(By.xpath("//img[@alt='company-branding']"))

if (VerfiyElement.isDisplayed()) {
	WebUI.takeScreenshot()
	KeywordUtil.markPassed('Application Launched Successfully...!!')
} else {
	KeywordUtil.markFailed('Application Launched Failed...!!')
}


