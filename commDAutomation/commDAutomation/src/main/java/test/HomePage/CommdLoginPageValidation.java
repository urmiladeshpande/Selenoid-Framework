package test.HomePage;
import BaseClasses.BaseTest;
import ImplementationClasses.CommdSignInImpl;
import org.testng.annotations.Test;

public class CommdLoginPageValidation extends BaseTest
{
    @Test(description = "Verify Login Page")

    public void verifyLogIn()
    {
        add(new CommdSignInImpl()).trigger();
    }
}


