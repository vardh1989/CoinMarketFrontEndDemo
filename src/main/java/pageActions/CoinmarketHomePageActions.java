package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.Reporter;
import pageLocators.CoinmarketHomePageLocators;
import utils.SeleniumDriver;

import java.util.List;

public class CoinmarketHomePageActions {
    CoinmarketHomePageLocators coinLocators =null;

    //Initializing WebElements using PageFactory
    public CoinmarketHomePageActions() {
        this.coinLocators=new CoinmarketHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), coinLocators);
    }

    /**
     *
     * @param rowCount number of rows
     */
    public void selectRowsToDisplay(int rowCount){
        Reporter.log("Test in selectRowsToDisplay");
        coinLocators.showRowsDropdown.click();
        coinLocators.selectRowCount(rowCount).click();
    }

    /**
     *
     * @param countToVerify number of rows to verify
     * @param textToVerify String to verify
     */
    public void verifyNumberOfRows(int countToVerify,String textToVerify) {
        try {
            SeleniumDriver.scrollToText("Find out how we work by clicking here. ");
            WebElement element = coinLocators.verifyRowCount;
            String numberOfRowsShown = coinLocators.numberOfResultShown.getText();
            Assert.assertEquals(countToVerify, Integer.parseInt(element.getText()));
            Assert.assertTrue(numberOfRowsShown.contains(textToVerify));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void clickFilterButton() {
        List<WebElement> elements = coinLocators.filterButton;
        for(WebElement element:elements){
            if(element.getText().contains("Filters")){
                element.click();
            }
        }
    }

    public void clickAddFilterButton(){
        coinLocators.addFilterButton.click();
    }

    public void clickMarketCapOption(){
        coinLocators.marketCapFilterButton.click();
    }

    /**
     *
     * @param startValue starting from value
     * @param endValue Last value
     */
    public void enterMarketCapFilterValues(long startValue, long endValue){
        coinLocators.startPriceOrMarketCap.sendKeys(String.valueOf(startValue));
        coinLocators.endMarketCap.sendKeys(String.valueOf(endValue));
    }

    public void clickApplyFilter(){
        coinLocators.applyFilterButton.click();
    }

    public void clickPriceOption(){
        coinLocators.priceFilterButton.click();
    }

    /**
     *
     * @param startValue First value
     * @param endValue Last value
     */
    public void enterPriceFilterValues(int startValue, int endValue){
        coinLocators.startPriceOrMarketCap.sendKeys(String.valueOf(startValue));
        coinLocators.endPriceRange.sendKeys(String.valueOf(endValue));
    }

    public void clickShowResultsInFilters(){
        coinLocators.showResultsButtonInFilters.click();
    }

    /**
     *
     * @param startValue First value
     * @param endValue Last value
     */
    public void verifyFilteredPrices(float startValue,float endValue){
        List<WebElement> prices = coinLocators.filteredPrices;
        for(WebElement price:prices){
            float priceToFloat = Float.parseFloat(price.getText().replaceAll("[^\\d.]", ""));
            Assert.assertTrue(startValue <= priceToFloat && priceToFloat<= endValue);
        }
    }

    public void verifyFilteredMarketCap(float startValue,float endValue){
        List<WebElement> marketcaps = coinLocators.filteredMarketCap;
        for(WebElement marketcap :marketcaps){
            float marketcapToFloat = Float.parseFloat(marketcap.getText().replaceAll("[^\\d.]", ""));
            Assert.assertTrue(startValue <= marketcapToFloat && marketcapToFloat<= endValue);
        }
    }


}
