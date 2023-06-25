package manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ExercisesPage;
import pages.MainPage;
import pages.HomePage;
import pages.SignInPage;

import java.time.Duration;

public class ApplicationManager {
    WebDriver webDriver;
    HomePage homePage;
    SignInPage signInPage;
    MainPage mainPage;
    ExercisesPage exercisesPage;

    public void start() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.navigate().to("https://la-vocal.melodic-mind.com/");

        homePage = new HomePage(webDriver);
        signInPage = new SignInPage(webDriver);
        mainPage = new MainPage(webDriver);
        exercisesPage = new ExercisesPage(webDriver);
    }

    public void stop() {
        webDriver.close();
    }

    public HomePage homePage() {
        return homePage;
    }

    public SignInPage signInPage() {
        return signInPage;
    }

    public MainPage mainPage() {
        return mainPage;
    }

    public ExercisesPage exercisesPage() {
        return exercisesPage;
    }
}
