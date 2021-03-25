Feature: Verify sample tests for home and login screen

  Background:
    Given CoinMarketCap site "https://coinmarketcap.com/" opens successfully

  @AllTests
  Scenario: Validate 100 rows of Cryptocurrencies are shown to user
    When User selects Show rows dropdown value to 100
    Then Verify that 100 rows are displayed

  @AllTests
  Scenario: Validate filters on the home page shows correct results
    When User Clicks on Filters button
    And Filter records by MarketCap 1000000000 - 10000000000 and Price 101 - 1000
    Then Check records displayed on page are correct as MarketCap 1000000000 - 10000000000 and Price 101 - 1000