package pageobjects.pages;

public interface ISignInPage
{

  ISignInPage accptCookies();
  ISignInPage enterEmailId(String email);
  ISignInPage enterPassword(String password);
  ISignInPage clickButton();
  IDashboardPage go_to_dashboard_page();


}
