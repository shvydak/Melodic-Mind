package tests;

import manager.ApplicationManager;
import manager.UserLogin;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.*;

public class BaseTests {
    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.start();

    }

    @BeforeClass
    public void preConditions() throws IOException {
        String email;
        String password;

        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/userLogin.csv")));
        String line = reader.readLine();
        String[] split = line.split(",");


        UserLogin user = UserLogin.builder()
                .email(split[0])
                .password(split[1])
                .build();

        app.homePage().clickContinueWithEmailButton();
        app.signInPage().login(user);
    }

    @AfterSuite
    public void tearDown() {
//        app.stop();
    }
}
