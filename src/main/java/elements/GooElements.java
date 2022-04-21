package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GooElements {
    public static final SelenideElement gooInput = $("input[name='search']");
    public static final SelenideElement buttonSearch = $("button[class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    public static final SelenideElement searchRezult = $("div[class='rz-search-result-qnty']");


}
