package pl.mmazur.movieclub.pages;
import com.microsoft.playwright.Page;

public class HomePage {

    Page page;

    //String Locators
    private String pageTitle = "text=Movie Club";

    //Constructor
    public HomePage(Page page) {
        this.page = page;
    }

    //page actions/methods
    public String getHomePageTitle() {
        String title = page.title();
        System.out.println("page title: "+ title);
        return title;
    }
}
