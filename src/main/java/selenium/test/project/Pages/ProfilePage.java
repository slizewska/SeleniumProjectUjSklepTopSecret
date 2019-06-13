package selenium.test.project.Pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage {

    //Line to add Email info
    @FindBy(xpath = "//*[@id=\"usr_email\"]")
    private WebElement emailField;


    //Email field for confirmation
    @FindBy(xpath = "//*[@id=\"usr_email\"]")
    private WebElement infoEmail;

    //Line to add Name info
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_fname\"]")
    private WebElement nameField;

    //Name field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_fname\"]")
    private WebElement infoName;

    //Line to add Last Name
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_lname\"]")
    private WebElement lastNameField;


    //Last Name field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_lname\"]")
    private WebElement infoLastName;

    //Line to add Sreet
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_street\"]")
    private WebElement streetNameField;

    //Street field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_street\"]")
    private WebElement infoStreetName;

    //Line to add House number
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_house_nr\"]")
    private WebElement houseNumberField;

    //House number field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_house_nr\"]")
    private WebElement infoHouseNumber;

    //Line to add Apartment number
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_flat_nr\"]")
    private WebElement apartmentNumberField;

    //Apartment number field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_flat_nr\"]")
    private WebElement infoApartmentNumber;

    //Line to add City name
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_city\"]")
    private WebElement cityNameField;

    //City name field for confirmation miast
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_city\"]")
    private WebElement infoCityName;


    //Line to add Zip number
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_zip\"]")
    private WebElement zipNumberField;

    //Zip number field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_zip\"]")
    private WebElement infoZipNumber;

    //Line to add Phone number
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_phone\"]")
    private WebElement phoneNumberField;

    //Phone number field for confirmation
    @FindBy(xpath = "//*[@id=\"extnd_data-prs_phone\"]")
    private WebElement infoPhoneNumber;


    //Confirmed button for clicking to save profile information
    @FindBy(xpath = "//*[@id=\"save\"]")
    private WebElement confirmedButton;



    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    //Add Email
    public ProfilePage addEmail(String email) {

        fillField(emailField, email);
        return this;
    }

    public boolean isEmailDisplayed() {
        return infoEmail.isDisplayed();
    }

    //Add Name to Profile
    public ProfilePage fillNameToProfileForms(String name) {
        fillField(nameField, name);
        return this;
    }

    public boolean isNameDisplayed() {
        return infoName.isDisplayed();
    }

    //Add Last Name to Profile
    public ProfilePage fillLastNameToProfileForms(String lastname) {
        fillField(lastNameField, lastname);
        return this;
    }

    public boolean isLastNameDisplayed() {
        return infoLastName.isDisplayed();
    }

    //Add Street Number
    public ProfilePage addStreetNumber(String street_number) {
        fillField(streetNameField, street_number);
        return this;
    }

    public boolean isStreetNumberDisplayed() {
        return infoStreetName.isDisplayed();
    }

    //Add House Number
    public ProfilePage addHouseNumber(String house_number) {
        fillField(houseNumberField, house_number);
        return this;
    }

    public boolean isHouseNumberDisplayed() {
        return infoHouseNumber.isDisplayed();
    }

    //Add Apartment Number
    public ProfilePage addApartmentNumber(String apartment_number) {
        fillField(apartmentNumberField, apartment_number);
        return this;
    }

    public boolean isApartmentNumberDisplayed() {
        return infoApartmentNumber.isDisplayed();
    }


    //Add City Name
    public ProfilePage addCityName(String city_name) {
        fillField(cityNameField, city_name);
        return this;
    }

    public boolean isCityNamerDisplayed() {
        return infoCityName.isDisplayed();
    }

    //Add Zip Number
    public ProfilePage addZipNumber(String zip_number) {
        fillField(zipNumberField, zip_number);
        return this;
    }

    public boolean isZipNumberDisplayed() {
        return infoZipNumber.isDisplayed();

    }

    //Add Phone Number
    public ProfilePage addPhoneNumber(String phone_number) {
        fillField(phoneNumberField, phone_number);
        return this;
    }

    public boolean isPhoneNumberDisplayed() {
        return infoPhoneNumber.isDisplayed();
    }


    //Click Confirm button to save info to Profile
    public ProfilePage submitProfileForms() {

        try {
            clickElement(confirmedButton);
            return new ProfilePage(driver);
        } catch (NoSuchElementException e) {
            return this;
        }
    }
}


