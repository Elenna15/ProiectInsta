package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {
        LOG.info("Click the button");
        sleep(3000L);
        signInPage.clickAllowAllCookies();
        sleep(3000L);

        LOG.info("Click 'Sign Up' button");
        signInPage.clickSignUp();

    }


}
