package pageobjects.pages;

public interface IDashboardPage
{
    IDashboardPage Navigate_To_Resource_Tab();
    IDashboardPage Navigate_to_Team_tab();
    IDashboardPage Navigate_to_Profile_menu();
    IDashboardPage Navigate_to_workspace_menu();
    IDashboardPage Navigate_to_contact_support() throws InterruptedException;
    IDashboardPage Navigate_to_dashboard_menu();
}
