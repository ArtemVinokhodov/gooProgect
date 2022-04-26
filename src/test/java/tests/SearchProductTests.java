package tests;

import elements.selectProductAndResult;
import org.testng.annotations.Test;
import steps.SearchSteps;

import static com.codeborne.selenide.Selenide.open;

public class SearchProductTests {
    @Test
    public void searchProductAndShowResult(){
        open("https://www.rozetka.com.ua");
        SearchSteps gooSteps = new SearchSteps();
        selectProductAndResult gooElements = new selectProductAndResult();
        gooSteps.rozetkaSearchProductStep("phone");
        System.out.println(gooElements.resultOfSearch.getText());

    }
}
