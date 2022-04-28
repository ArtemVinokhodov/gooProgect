package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelectProductAndResult {
    public static final SelenideElement gooInputForSelectProduct = $("input[name='search']");
    //public static final SelenideElement buttonSearch = $("button[class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    //public static final SelenideElement buttonSearch = $("button[class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    public static final SelenideElement resultOfSearch = $("div[class='rz-search-result-qnty']");


}
