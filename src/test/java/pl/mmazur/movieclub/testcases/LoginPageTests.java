package pl.mmazur.movieclub.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.mmazur.movieclub.base.BaseTest;

public class LoginPageTests extends BaseTest {
    @Test(priority = 1)
    public void verifyLoginPageTitleTest() {
        String title = hp.getPageTitle();
        System.out.println("home page title is: " + title);
        Assert.assertEquals(title, "Zaloguj się - MovieClub");
    }
}
