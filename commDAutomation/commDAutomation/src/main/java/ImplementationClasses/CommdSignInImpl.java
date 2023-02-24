package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.FirstLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISignInPage;

public class CommdSignInImpl extends FirstLoginPage implements Feature
{
 // variable declare of interface
   private ISignInPage homePage;
    @Override
    public void init()
    {
        homePage = RemedyLoginPage();
    }

    @Override
    public void execute()
    {
     try {

      homePage.accptCookies()
//              .enterEmailId(SystemProperties.USERNAME)
//              .enterPassword(SystemProperties.PASSWORD)
//              .clickButton()
//              .go_to_dashboard_page();

      ;
     } catch (Exception exception) {
      exception.printStackTrace();
     }
    }
}
