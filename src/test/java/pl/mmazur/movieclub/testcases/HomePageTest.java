package pl.mmazur.movieclub.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.mmazur.movieclub.base.BaseTest;

public class HomePageTest extends BaseTest {
    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        String title = hp.getPageTitle();
        System.out.println("home page title is: " + title);
        Assert.assertEquals(title, "MovieClub");
    }

    @Test(priority = 2)
    public void verifyNavigateToLoginPageTest() {
        hp.navigateToLoginPage();
        String title = hp.getPageTitle();
        Assert.assertEquals(title, "Zaloguj się - MovieClub");
    }

    @Test(priority = 2)
    public void verifyNavigateToGenresPageTest() {
        hp.navigateToGenresPage();
        String title = hp.getPageTitle();
        Assert.assertEquals(title, "Gatunki filmowe - MovieClub");
    }

    @Test(priority = 2)
    public  void verifyNavigateToTop10PageTest() {
        hp.navigateToTop10Page();
        String title = hp.getPageTitle();
        Assert.assertEquals(title, "MovieClub");
    }

    @Test(priority = 1)
    public void verifyFooterTextTest() {
        String footerText = hp.getFooterText();
        Assert.assertEquals(footerText, "MovieClub 2022  JavaStart.pl");
    }
}
