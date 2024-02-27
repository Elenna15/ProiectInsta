package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "accounts/emailsignup/";

    String number = "0745823647";
    String name = "Pop Ana";
    String username = "user_357";
    String password = "pass1";


    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);


        LOG.info("Click the Cookies button");
        registerPage.clickCookies();
        sleep(3000L);

        LOG.info("Type Number Phone");
        registerPage.insertNumber(number);

        LOG.info("Type full name");
        registerPage.insertFullName(name);

        LOG.info("Type username");
        registerPage.insertUsername(username);

        LOG.info("Type password");
        registerPage.insertPassword(password);


    }
}
