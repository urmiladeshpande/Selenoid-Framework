package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.RemedyPageFactory;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.confirm;

public class DashboardPage implements IDashboardPage
{
    SelenideElement resource_tab = $x("//a[text()='Resources']");
    SelenideElement team_tab = $x("(//a[text()='Team'])[1]");
    SelenideElement profile_menu_dropdown = $x("//span[@class='open-dropdown']");
    SelenideElement profile_menu = $x("(//span[@class='profile-icon'])[1]");
    SelenideElement account_settings = $x("//a[text()='ACCOUNT SETTINGS']");

    SelenideElement workspace_menu = $x("//a[text()='Workspace']");
    SelenideElement change_workspace = $x("//a[text()='CHANGE WORKSPACE']");

//    String contact_support_url = "https://test-engage.mnghealth.com/commd/ContactSupport";

    @Override
    public IDashboardPage Navigate_To_Resource_Tab() {
        resource_tab.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return RemedyPageFactory.getdashboard();
    }

    @Override
    public IDashboardPage Navigate_to_Team_tab() {
        team_tab.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return RemedyPageFactory.getdashboard();
    }

    @Override
    public IDashboardPage Navigate_to_Profile_menu() {
        try {
            profile_menu_dropdown.click();
            TimeUnit.SECONDS.sleep(5);
            profile_menu.click();
            Thread.sleep(2000);
            account_settings.click();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return RemedyPageFactory.getdashboard();
    }

    @Override
    public IDashboardPage Navigate_to_workspace_menu() {
        try {
            profile_menu_dropdown.click();
            TimeUnit.SECONDS.sleep(5);
            workspace_menu.click();

            WebDriverRunner.getWebDriver().navigate().back();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return RemedyPageFactory.getdashboard();
    }

    @Override
    public IDashboardPage Navigate_to_contact_support() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(WebDriverRunner.getWebDriver().getTitle().equals("https://test-engage.mnghealth.com/commd/ContactSupport"));
        return RemedyPageFactory.getdashboard();
    }

    @Override
    public IDashboardPage Navigate_to_dashboard_menu() {

        try {
            profile_menu_dropdown.click();
            TimeUnit.SECONDS.sleep(5);
            WebDriverRunner.getWebDriver().navigate().back();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return RemedyPageFactory.getdashboard();
    }
}
