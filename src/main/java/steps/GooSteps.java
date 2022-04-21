package steps;

import com.codeborne.selenide.Condition;
import elements.GooElements;

public class GooSteps {
    //@Step("go to google")
    public void goToGooMetod(String s){
        GooElements.gooInput.shouldBe(Condition.visible)
                .setValue(s)
                .pressEnter();
        //GooElements.searchRezult.should(Condition.exist.because("Найдено"));
        //GooElements.searchRezult.should(Condition.exist);
        GooElements.searchRezult.should(Condition.exist).shouldHave(Condition.text("Найдено"));

    }

}
