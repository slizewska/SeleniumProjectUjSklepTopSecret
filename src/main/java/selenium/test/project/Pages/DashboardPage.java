package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

     @FindBy(xpath = "/html/body/nav/div[2]/h1")
     private WebElement dashboardButton;



    @FindBy(xpath = "//*[@id=\"userDropdown\"]")
    private WebElement dropdownMenuLink;


    @FindBy(xpath = "/html/body/nav/div[2]/div[2]/ul/li[4]/div[2]/div/ul/li[1]/a/span[2]")
    private WebElement profileLinkButton;



    @FindBy(xpath = "/html/body/nav/div[2]/div[2]/ul/li[4]/div[2]/div/ul/li[3]/a")
    private WebElement exitButton;



    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDashboardButtonDisplayed()
    { return dashboardButton.isDisplayed();
    }

    //Go to Profile Page
    public ProfilePage goToProfilePage() {
        clickElement(dropdownMenuLink);
        clickElement(profileLinkButton);
        return new ProfilePage(driver);
    }

    //Logout
    public DashboardPage clickExitButton() {
        clickElement(dropdownMenuLink);
        clickElement(exitButton);
        return new DashboardPage(driver);
    }
}


