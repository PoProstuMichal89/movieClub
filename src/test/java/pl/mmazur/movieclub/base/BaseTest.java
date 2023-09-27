package pl.mmazur.movieclub.base;

import com.microsoft.playwright.Page;
import org.testng.annotations.*;
import pl.mmazur.movieclub.factory.PlaywrightFactory;
import pl.mmazur.movieclub.pages.HomePage;
import pl.mmazur.movieclub.pages.LoginPage;

public class BaseTest {
    protected Page page;
    protected HomePage hp;
    protected LoginPage lp;
    PlaywrightFactory play;


    @Parameters({"appURL", "browserType"})
    @BeforeTest
    @BeforeClass
    public void setUp(String appURL, String browserType) {
        play = new PlaywrightFactory();
        page = play.getPage(appURL, browserType);
        hp = new HomePage(page);
        lp = new LoginPage(page);
    }

    @AfterClass
    public void tearDown() {
        page.context().browser().close();
    }

}
