package BaseClasses;

import pageobjects.PageFactoryClasses.RemedyPageFactory;
import pageobjects.pages.ISignInPage;

import static com.codeborne.selenide.Selenide.open;
import static data.SystemProperties.REMEDY_URL;

public class FirstLoginPage {



    public ISignInPage RemedyLoginPage()
    {
        open(REMEDY_URL);

        return RemedyPageFactory.getHomepage();
    }


}
