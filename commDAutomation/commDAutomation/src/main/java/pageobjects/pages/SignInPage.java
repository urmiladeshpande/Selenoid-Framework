package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.RemedyPageFactory;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class SignInPage implements ISignInPage
{
    SelenideElement cookie_Accept = $x("");
    //Xpath for LoginEmail
    SelenideElement email_field = $x("//input[@placeholder='Enter email']");
    //Xpath for Login Password
    SelenideElement password_field = $x("//input[@placeholder='Enter password']");
    SelenideElement login = $x("//input[@type='submit']");
    SelenideElement clickonregister = $x("//a[text()='Register HCPs']");
    SelenideElement AccepCookiesButton = $x("/html/body/div[3]//div/div/div[2]/div/div[2]/div/div[2]/div/div/div/button[3]");

    SelenideElement ShowdowParent = $x("//*[@id=\"usercentrics-root\"]");


    @Override
    public ISignInPage accptCookies() {
        try{
            Thread.sleep(4000);


            System.out.println("---------------------------------");

            WebDriver driver=  WebDriverRunner.getWebDriver();


            WebElement shadow_host = driver.findElement(By.id("usercentrics-root"));

            Object shadowRoot = ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadow_host);
            String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
            RemoteWebElement shadowRootElement = new RemoteWebElement();
            shadowRootElement.setParent((RemoteWebDriver) driver);
            shadowRootElement.setId(id);

            WebElement shadowContent = shadowRootElement.findElement(By.cssSelector(".gHitPo"));

            shadowContent.click();
            System.out.println("---------------------------------");
            Thread.sleep(5000);

            

        }
        catch(Exception e){
            e.printStackTrace();
        };

        return RemedyPageFactory.getHomepage();
    }

    @Override
    public ISignInPage enterEmailId(String email)
    {
        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),20);
        WebDriverRunner.getWebDriver().navigate().refresh();
        wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver).executeScript("return document.readyState")));
        email_field.sendKeys(email);
        return RemedyPageFactory.getHomepage();
    }

    @Override
    public ISignInPage enterPassword(String password)
    {
        password_field.sendKeys(password);
        return RemedyPageFactory.getHomepage();
    }

    @Override
    public ISignInPage clickButton()
    {
        Assert.assertTrue(login.isDisplayed());
        login.click();
        return RemedyPageFactory.getHomepage();
    }

    @Override
    public IDashboardPage go_to_dashboard_page() {
        WebDriverRunner.getWebDriver().getTitle();
        return RemedyPageFactory.getdashboard();
    }
    //Method to connect login Page to event page



}
