package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By allowAllCookies = By.xpath("//button[text()='Allow all cookies']");
    private By signInButton = By.xpath("//button[@type='submit']");
    private By logo = By.xpath("//i[@aria-label='Instagram']");
    private By emailField = By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']");
    private By passwordField = By.xpath("//input[@aria-label='Password']");
    private By facebookButton = By.xpath("//button[@type='button']");
    private By signUpButton = By.xpath("//span[text()='Sign up']");


    public void clickAllowAllCookies() {
        LOG.info("Click the button");
        driver.findElement(allowAllCookies).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign In' button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void insertEmail(String Email) {
        LOG.info("Input 'Email address' in field");
        driver.findElement(emailField).sendKeys(Email);
    }

    public void insertPassword(String Password) {
        LOG.info("Input 'Password' in field");
        driver.findElement(passwordField).sendKeys(Password);
    }

    public boolean isFacebookButtonDisplayed() {
        LOG.info("Verify if Facebook button is displayed");
        return driver.findElement(facebookButton).isDisplayed();
    }

    public void clickSignIn() {
        LOG.info("Click 'Sign In' button");
        driver.findElement(signInButton).click();
    }

    public void clickSignUp() {
        LOG.info("Click 'Sign Up' button");
        driver.findElement(signUpButton).click();
    }




}
