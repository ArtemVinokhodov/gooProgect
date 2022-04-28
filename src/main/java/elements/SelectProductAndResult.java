package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelectProductAndResult {
    //public static final SelenideElement gooInputForSelectProduct = $("input[name='search']");
    public static final SelenideElement gooInputForSelectProduct = $("input.ng-valid");
    //public static final SelenideElement resultOfSearch = $("div[class='rz-search-result-qnty']");
    public static final SelenideElement resultOfSearch = $("div.rz-search-result-qnty");


}
