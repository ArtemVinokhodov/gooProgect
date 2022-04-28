package steps;

import com.codeborne.selenide.Condition;
import elements.SelectProductAndResult;

public class SearchSteps {
    //@Step("go to google")
    public void rozetkaSearchProductStep(String nameOfProductForSearch){
        SelectProductAndResult.gooInputForSelectProduct.shouldBe(Condition.visible)
                .setValue(nameOfProductForSearch)
                .pressEnter();
        //GooElements.searchRezult.should(Condition.exist.because("Найдено"));
        //GooElements.searchRezult.should(Condition.exist);
        SelectProductAndResult.resultOfSearch.should(Condition.exist).shouldHave(Condition.text("Найдено"));

    }

}
