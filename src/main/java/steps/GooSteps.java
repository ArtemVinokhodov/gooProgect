package steps;

import com.codeborne.selenide.Condition;
import elements.GooElements;

public class GooSteps {
    //@Step("go to google")
    public void goToGooMetod(){
        GooElements.gooInput.shouldBe(Condition.visible)
                .setValue("phone")
                .pressEnter();
        GooElements.searchRezult.should(Condition.exist.because("Найдено"));

    }

}
