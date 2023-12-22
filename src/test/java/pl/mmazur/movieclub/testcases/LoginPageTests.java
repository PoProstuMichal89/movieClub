package pl.mmazur.movieclub.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pl.mmazur.movieclub.base.BaseTest;


public class LoginPageTests extends BaseTest {

    private final String username = "user@example.com";
    private final String password = "userpass";
    @Test(priority = 1)
    public void verifyLoginPageTitleTest() {
        String title = hp.getPageTitle();
        System.out.println("home page title is: " + title);
        Assert.assertEquals(title, "Zaloguj się - MovieClub");
    }

    @Test(priority = 1)
    public void verifyLoginPageEmailInputLabelTest() {
        String emailInputLabel = lp.getEmailInputLabel();
        Assert.assertEquals(emailInputLabel, "Adres email");
    }

    @Test(priority = 1)
    public void verifyLoginPagePasswordInputLabelTest() {
        String passwordInputLabel = lp.getPasswordInputLabel();
        Assert.assertEquals(passwordInputLabel, "Hasło");
    }

    @Test(priority = 1)
    public void verifyLoginPageLoginButtonTextTest() {
        String loginButtonText = lp.getLoginButtonText();
        Assert.assertEquals(loginButtonText, "Zaloguj się");
    }

    @Test(priority = 1)
    public void verifyLoginPageRegisterLinkTextTest() {
        String registerLinkText = lp.getRegisterLinkText();
        Assert.assertEquals(registerLinkText, "Zarejestruj się");
    }

    @Test(priority = 1)
    public void verifyLoginPageFooterTextTest() {
        String footerText = lp.getFooterText();
        Assert.assertEquals(footerText, "MovieClub 2022  JavaStart.pl");
    }

    @Test(priority = 2)
    public void verifyLoginPageHeaderTextTest() {
        String headerText = lp.getHeaderText();
        Assert.assertEquals(headerText, "Movie Club");
    }

    //Login actions
    @Test(priority = 2)
    public void verifyLoginPageLoginActionTest() {
        lp.fillEmailField(username);
        lp.fillPasswordField(password);
        lp.clickLoginButton();
        Assert.assertEquals(lp.getLogoutButtonText(), "Wyloguj się");
    }

    @Test(priority = 3)
    public void verifyLoginPageLogoutActionTest() {
        lp.clickLogoutButton();
        Assert.assertEquals(page.url(), "http://localhost:8080/login?logout");
    }
    @Test(priority = 4)
    public void verifyLoginPageRegisterLinkTest() {
        lp.clickRegisterLink();
        String title = lp.getPageTitle();
        String url = page.url();
        Assert.assertEquals(title, "Zarejestruj się | MovieClub");
        Assert.assertEquals(url, "http://localhost:8080/rejestracja");
//        lp.clickLoginButton();
    }

}
