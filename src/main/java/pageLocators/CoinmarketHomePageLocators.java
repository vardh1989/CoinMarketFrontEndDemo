package pageLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;


public class CoinmarketHomePageLocators {


    @FindBy(how=How.XPATH,using = "//div[@class='sc-AxhCb sc-fzpdbB jPpwSF']")
    public  WebElement showRowsDropdown;

    @FindBy(how=How.XPATH,using = "//button[contains(@class,'sc-fznKkj bMvvNf')]")
    public WebElement selectRowCountNumber;

    public WebElement selectRowCount( int count){
        WebElement element= selectRowCountNumber.findElement(By.xpath("//button[text()[contains(.,'"+count+"')]]"));
        return element;
    }

    @FindBy(how=How.XPATH,using="//td//p[@class='sc-AxirZ kGZHYU' and text()='100']")
    public WebElement verifyRowCount;

    @FindBy(how=How.XPATH,using = "//p[text()[contains(.,'Showing 1 - 100')]]")
    public WebElement numberOfResultShown;

    @FindBy(how=How.XPATH,using = "//button[text()='Filters']")
    public List<WebElement> filterButton;


    @FindBy(how=How.XPATH,using = "//button[text()[contains(.,'Add Filter')]]")
    public WebElement addFilterButton;

    @FindBy(how=How.XPATH,using = "//button[@data-qa-id=\"filter-dd-toggle\" and text()[contains(.,'Market Cap')]]")
    public  WebElement marketCapFilterButton;

    @FindBy(how=How.XPATH,using = "//button[@data-qa-id=\"filter-dd-toggle\" and text()[contains(.,'Price')]]")
    public  WebElement priceFilterButton;

    @FindBy(how=How.XPATH,using = "//input[@placeholder='$0']")
    public WebElement startPriceOrMarketCap;

    @FindBy(how=How.XPATH,using = "//input[@placeholder='$99,999']")
    public WebElement endPriceRange;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='$999,999,999,999']")
    public WebElement endMarketCap;

    @FindBy(how = How.XPATH,using = "//button[ text()[contains(.,'Apply Filter')]]")
    public WebElement applyFilterButton;

    @FindBy(how = How.XPATH,using = "//button[ text()[contains(.,'Show results')]]")
    public WebElement showResultsButtonInFilters;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'price___3rj7O')]")
    public List<WebElement>filteredPrices;

    @FindBy(how = How.XPATH,using = "//p[@class='sc-AxirZ hEsncc']")
    public List<WebElement> filteredMarketCap;




// Locators
//    ShowRows ="sc-AxhCb sc-fzpdbB jPpwSF"
//    SelectRowCount =//button[contains(@class,'sc-fznKkj bMvvNf') and text()[contains(.,'100')]]
//    Find unique value for graph =//td//img[contains(@alt,'price-graph')]
//    //p[text()[contains(.,'Showing 1 - 100')]]
//
//    //button[text()[contains(.,'Filters')] ]
//
//    //button[text()[contains(.,'Add Filter')]]
//    //button[@data-qa-id="filter-dd-toggle" and text()[contains(.,'Market Cap')]]
//    //button[@data-qa-id="filter-dd-toggle" and text()[contains(.,'Price')]]
//    //button[ text()[contains(.,'$1B - $10B')]]
//    //button[ text()[contains(.,'$101 - $1,000')]]
//
//    //button[ text()[contains(.,'Apply Filter')]]
//    //button[ text()[contains(.,'Show results')]]
//     Price filter =//div[contains(@class,'price___3rj7O')]
//    market cap filter =//p[@class='sc-AxirZ hEsncc']


}
