package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {

        String email = "abcd@email.com";
        String password = "Password123";

        LOG.info("Click the button");
        sleep(3000L);
        signInPage.clickAllowAllCookies();

        LOG.info("Check 'Sign In' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");


        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Insert 'Email'");
        signInPage.insertEmail(email);

        LOG.info("Insert 'Password'");
        signInPage.insertPassword(password);

        LOG.info("Check Facebook button");
        Assert.assertTrue(signInPage.isFacebookButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign In' button");
        signInPage.clickSignIn();



    }


}
