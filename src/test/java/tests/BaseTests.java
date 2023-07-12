package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.*;

public class BaseTests {
    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.start();
    }
//    @BeforeSuite
//    public void setUp() throws IOException {
//        app.start();
//        BufferedReader reader = new BufferedReader(new FileReader(new File("loginUser.csv")));
//        String line = reader.readLine();
//        String[] split = line.split(",");
//
//        UserLogin user = UserLogin.builder()
//                .email(split[0])
//                .password(split[1])
//                .build();
//        app.homePage().clickSignInUpButton();
//        app.homePage().clickContinueWithEmailButton();
//        app.signInPage().login(user);
//    }

    @AfterClass
    public void openHomePage() {
//        app.mainPage().clickBurgerMenu();
//        app.mainPage().clickMenuHomeButton();
    }

    @AfterSuite
    public void tearDown() {
//        app.stop();
    }
}
