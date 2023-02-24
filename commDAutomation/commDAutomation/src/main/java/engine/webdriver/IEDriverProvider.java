package engine.webdriver;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverProvider implements WebDriverProvider{

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        cap.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
       // cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        WebDriver driver = new InternetExplorerDriver(new InternetExplorerOptions(cap));
        driver.manage().deleteAllCookies();
        return driver;
    }
}
