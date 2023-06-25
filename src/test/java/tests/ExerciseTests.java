package tests;

import com.github.javafaker.Faker;
import manager.UserLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExerciseTests extends BaseTests {
    @Test
    public void test1() {
        UserLogin user = UserLogin.builder()
                .email("y.shvydak@icloud.com")
                .password("qweQWE123!@#")
                .build();
        String exerciseName = Faker.instance().animal().name();

        app.homePage().clickContinueWithEmailButton();
        app.signInPage().login(user);
        app.mainPage().clickExerciseButton();
        app.exercisesPage().clickNewExerciseButton();
        app.exercisesPage().fillExerciseName(exerciseName);
        app.exercisesPage().clickHarmonyDropDownList();
        app.exercisesPage().clickHarmonyDropDownListUnison();
        app.exercisesPage().clickHarmonyDropDownList();
        app.exercisesPage().clickHarmonyDropDownListMajorTriad();
        app.exercisesPage().clickHarmonyDropDownList();
        app.exercisesPage().clickHarmonyDropDownListMinorTriad();
        app.exercisesPage().clickHarmonyDropDownList();
        app.exercisesPage().clickHarmonyDropDownListPerfectFifth();
        app.exercisesPage().clickAddNotesButton();
        app.exercisesPage().clickOnKey();
        app.exercisesPage().clickOnSaveButton();
        app.exercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.exercisesPage().isExerciseSaved(exerciseName));
    }
}
