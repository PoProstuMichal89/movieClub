package pl.mmazur.movieclub.pages;
import com.microsoft.playwright.Page;

public class HomePage {

    Page page;

    //String Locators
    private final String loginLink = "text=Zaloguj się";
    private final String genresLink = "text=Gatunki";
    private final String top10Link = "text=Top10";
    private String footerLocator = ".footer";


    //Constructor
    public HomePage(Page page) {
        this.page = page;
    }

    //page actions/methods
    public String getPageTitle() {
        String title = page.title();
        System.out.println("page title: "+ title);
        return title;
    }

    public void navigateToLoginPage() {
        page.click(loginLink);
    }

    public void navigateToGenresPage() {
        page.click(genresLink);
    }

    public void navigateToTop10Page() {
        page.click(top10Link);
    }

    public String getFooterText() {
        String footerText = page.innerText(footerLocator);
        System.out.println("footer text: "+ footerText);
        return footerText;
    }
}
