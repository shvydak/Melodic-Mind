package tests;

import manager.ApplicationManager;
import manager.UserLogin;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTests {
    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.start();

    }
    @BeforeClass
    public void preConditions(){
        UserLogin user = UserLogin.builder()
                .email("y.shvydak@icloud.com")
                .password("qweQWE123!@#")
                .build();

        app.homePage().clickContinueWithEmailButton();
        app.signInPage().login(user);
    }

    @AfterSuite
    public void tearDown() {
//        app.stop();
    }
}
