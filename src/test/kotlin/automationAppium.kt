import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

class automationAppium {
    @BeforeAll
     fun setUp (){
        val desiredCapabilities = DesiredCapabilities()
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554")
        desiredCapabilities.setCapability("platformName", "android")
        desiredCapabilities.setCapability("app", "C:\\Automation\\Apps\\Calculator_v8.2.apk")
        desiredCapabilities.setCapability("noReset", true)
        desiredCapabilities.setCapability("platformName", "android")
        desiredCapabilities.setCapability("platformName", "android")
        desiredCapabilities.setCapability("platformName", "android")
        val androidDriver = AndroidDriver(URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities)

    }
    @Test
    fun testCase_1 (androidDriver:AndroidDriver) {
        val el1 = androidDriver.findElement(By.id("")) as WebElement
        el1.click()
    }
        @Test
        fun testCase_2(androidDriver:AndroidDriver){
        val el2 = androidDriver.findElement(By.name("asd")) as WebElement
        el2.click()
    }

}