package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExerciseTests extends BaseTests {

    @Test(invocationCount = 1)
    public void test1() {
        String exerciseName = Faker.instance().animal().name();

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
        app.exercisesPage().maxNumberOfItems(2);

    }
}
