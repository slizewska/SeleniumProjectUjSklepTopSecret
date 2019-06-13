package selenium.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public final class LoginPage extends AbstractPage {

    @FindBy(name = "app_username")
    private WebElement emailField;

    @FindBy(name = "app_password")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"send\"]")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }




    public LoginPage fillLoginForm(String email, String password) {
        fillField(emailField, email);
        fillField(passwordField, password);
        return this;
    }

    public DashboardPage submitLoginForm() {
        clickElement(loginButton);
        return new DashboardPage(driver);
    }
}
