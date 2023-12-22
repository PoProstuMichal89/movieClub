package pl.mmazur.movieclub.pages;

import com.microsoft.playwright.Page;
import pl.mmazur.movieclub.base.BaseTest;

public class RegisterPage  {
    String emailLabelName="text=Adres email";
    String passwordLabelName="text=Hasło";
    String userNameInput = "input[name='username']";
    String passwordInput = "input[name='password']";
    Page page;

    public RegisterPage(Page page) {
        this.page = page;
    }

    public String getPageTitle() {
        return page.title();
    }

    public String getRegisterPageUrl(){
        String pageUrl= page.url();
       return  pageUrl= page.url();
    }

    public String getEmailInputText(){
        return page.innerText(emailLabelName);
    }

    public String getPasswordInputText(){
        return page.innerText(passwordLabelName);
    }

  public void fillEmailField(String email) {
        page.fill(userNameInput, email);
    }
    public void fillPasswordField(String password) {
        page.fill(passwordInput, password);
    }

    public void clickRegisterButton() {
        page.click("button[type='submit']");
    }


}
