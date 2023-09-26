package pl.mmazur.movieclub.base;

import com.microsoft.playwright.Page;
import org.testng.annotations.*;
import pl.mmazur.movieclub.factory.PlaywrightFactory;
import pl.mmazur.movieclub.pages.HomePage;

public class BaseTest {
    protected Page page;
    protected HomePage hp;
//    protected SearchPage search;
    PlaywrightFactory play;


    @BeforeTest
    @BeforeClass
    public void setUp() {
        play = new PlaywrightFactory();
        page = play.getPage("http://localhost:8080/", "chrome");
        hp = new HomePage(page);
    }

    @BeforeClass
    public void tearDown() {
        page.context().browser().close();
    }

}
