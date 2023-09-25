package pl.mmazur.movieclub.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.mmazur.movieclub.base.BaseTest;

public class HomePageTest extends BaseTest {
    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        String title = hp.getHomePageTitle();
        System.out.println("home page title is: " + title);
        Assert.assertEquals(title, "MovieClub");
    }
}
