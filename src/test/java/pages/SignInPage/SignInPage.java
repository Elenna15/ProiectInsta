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

    private By signInPage = By.id("_acan._acap._acas._aj1-._ap30");

    public void clickSignInButton() {
        LOG.info("Click 'Sign In' button");
        driver.findElement(signInPage).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign In' button is displayed");
        return driver.findElement(signInPage).isDisplayed();
    }
}
