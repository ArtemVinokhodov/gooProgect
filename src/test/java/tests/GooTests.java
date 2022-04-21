package tests;

import elements.GooElements;
import org.testng.annotations.Test;
import steps.GooSteps;

import static com.codeborne.selenide.Selenide.open;

public class GooTests {
    @Test
    public void goToGoo(){
        open("https://www.rozetka.com.ua");
        GooSteps gooSteps = new GooSteps();
        GooElements gooElements = new GooElements();
        gooSteps.goToGooMetod("6547");
        System.out.println(gooElements.searchRezult.getText());

    }
}
