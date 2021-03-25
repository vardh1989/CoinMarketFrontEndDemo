package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utils.SeleniumDriver;

import pageActions.CoinmarketHomePageActions;

public class CoinmarketTestingStepDefs {

    CoinmarketHomePageActions coinAction = new CoinmarketHomePageActions();

    @Given("^CoinMarketCap site \"([^\"]*)\" opens successfully$")
    public void coinmarketcap_site_opens_successfully(String url){

        SeleniumDriver.openPage(url);

    }

    @When("^User selects Show rows dropdown value to (\\d+)$")
    public void user_selects_show_rows_dropdown_value(int selectRowCount){
        coinAction.selectRowsToDisplay(selectRowCount);
    }

    @Then("^Verify that (\\d+) rows are displayed$")
    public void verify_the_number_of_rows_shown(int numberOfRows){
        coinAction.verifyNumberOfRows(numberOfRows,"Showing 1 - 100 out of");
    }

    @When("^User Clicks on Filters button$")
    public void user_clicks_on_filter_button(){
        coinAction.clickFilterButton();
    }

    @And("^Filter records by MarketCap (\\d+) - (\\d+) and Price (\\d+) - (\\d+)$")
    public void filter_records_by_marketcap_and_price(long startMarketCap, long endMarketCap,int startPrice, int endPrice ){
        coinAction.clickAddFilterButton();
        coinAction.clickMarketCapOption();
        coinAction.enterMarketCapFilterValues(startMarketCap,endMarketCap);
        coinAction.clickApplyFilter();
        coinAction.clickPriceOption();
        coinAction.enterPriceFilterValues(startPrice,endPrice);
        coinAction.clickApplyFilter();
        coinAction.clickShowResultsInFilters();
        SeleniumDriver.waitForPageToLoad();
    }


    @Then("^Check records displayed on page are correct as MarketCap (\\d+) - (\\d+) and Price (\\d+) - (\\d+)$")
    public void checkRecordsDisplayedOnPageAreCorrectAsMarketCapAndPrice(float startMarketCap, float endMarketCap, float startPrice, float endPrice) {
        coinAction.verifyFilteredPrices(startPrice,endPrice);
        coinAction.verifyFilteredMarketCap(startMarketCap,endMarketCap);
    }
}
