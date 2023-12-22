package pl.mmazur.movieclub.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.mmazur.movieclub.base.BaseTest;

public class RegisterPageTests extends BaseTest {
    @Test(priority = 1)
    public void verifyRegisterPageTitleTest() {
        String title = rp.getPageTitle();
        Assert.assertEquals(title, "Zarejestruj się | MovieClub");
    }

    @Test(priority = 1)
    public void verifyRegisterPageUrl() {
        String url = rp.getRegisterPageUrl();
        Assert.assertEquals(url, "http://localhost:8080/rejestracja");
    }

    @Test(priority = 1)
    public void verifyRegisterPageInputText() {
        String inputText = rp.getEmailInputText();
        Assert.assertEquals(inputText, "Adres email");
    }

    @Test(priority = 1)
    public void verifyRegisterPagePasswordInputText() {
        String inputText = rp.getPasswordInputText();
        Assert.assertEquals(inputText, "Hasło");
    }
}
