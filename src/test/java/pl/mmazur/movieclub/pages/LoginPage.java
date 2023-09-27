package pl.mmazur.movieclub.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    Page page;

    //Selectors:
    String headers_h1 = "h1";

    String userNameInput = "input[name='username']";
    String passwordInput = "input[name='password']";
    String passwordInputLabel = "label[for='password']";
    String userlInputLabel = "label[for='username']";
    String loginButton = "button[type='submit']";
    String logOutLink = "li.menu-item a[href=\"/logout\"] ";
    String logInLink = "li.menu-item a[href=\"/login\"] ";
    String registrationLink = "p.registration-link a";

    String footerLocator = ".footer";



    public LoginPage(Page page) {
        this.page = page;
    }

    public String getPageTitle() {
        String title = page.title();
        return title;
    }

    public String getHeaderText() {
        String headerText = page.innerText(headers_h1);
        return headerText;
    }

    public String getEmailInputLabel() {
        String emailInputLabel = page.innerText(userlInputLabel);
        System.out.println("emailInputLabel: " + emailInputLabel);
        return emailInputLabel;
    }
    public String getPasswordInputLabel() {
        return page.innerText(passwordInputLabel);
    }

    //Login button - login action
    public String getLoginButtonText() {
        return page.innerText(loginButton);
    }

    public void clickLoginButton() {
        page.click(loginButton);
    }

    public void fillEmailField(String email) {
        page.fill(userNameInput, email);
    }
    public void fillPasswordField(String password) {
        page.fill(passwordInput, password);
    }
    //Register link
    public String getLogoutButtonText() {
        return page.innerText(logOutLink);
    }

    public String getLoginLinkText() {
        return page.innerText(logInLink);
    }

    public void clickLogoutButton() {
        page.click(logOutLink);
    }

    public String getRegisterLinkText() {
        return page.innerText(registrationLink);
    }

    public void clickRegisterLink() {
        page.click(registrationLink);
    }

    //Footer
    public String getFooterText() {
       return page.innerText(footerLocator);
    }


}



