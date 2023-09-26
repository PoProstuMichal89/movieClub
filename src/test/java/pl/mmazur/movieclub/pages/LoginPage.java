package pl.mmazur.movieclub.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public String getPageTitle() {
        String title = page.title();
        System.out.println("page title: " + title);
        return title;
    }


}



