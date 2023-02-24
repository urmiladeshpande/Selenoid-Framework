package pageobjects.PageFactoryClasses;


import pageobjects.pages.*;


public class RemedyPageFactory extends PageFactory
{

    public static ISignInPage getHomepage()
    {
        return wrap(new SignInPage(), ISignInPage.class);
    }
    public static IDashboardPage getdashboard() {return wrap(new DashboardPage(), IDashboardPage.class);
    }


}
