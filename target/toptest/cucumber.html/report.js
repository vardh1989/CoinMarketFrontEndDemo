$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CoinmarketTesting.feature");
formatter.feature({
  "line": 1,
  "name": "Verify sample tests for home and login screen",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4495847886,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "CoinMarketCap site \"https://coinmarketcap.com/\" opens successfully",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://coinmarketcap.com/",
      "offset": 20
    }
  ],
  "location": "CoinmarketTestingStepDefs.coinmarketcap_site_opens_successfully(String)"
});
formatter.result({
  "duration": 4006064912,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate 100 rows of Cryptocurrencies are shown to user",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-100-rows-of-cryptocurrencies-are-shown-to-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@AllTests"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User selects Show rows dropdown value to 100",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify that 100 rows are displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 41
    }
  ],
  "location": "CoinmarketTestingStepDefs.user_selects_show_rows_dropdown_value(int)"
});
formatter.result({
  "duration": 841115473,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 12
    }
  ],
  "location": "CoinmarketTestingStepDefs.verify_the_number_of_rows_shown(int)"
});
formatter.result({
  "duration": 5231736771,
  "status": "passed"
});
formatter.after({
  "duration": 212899623,
  "status": "passed"
});
formatter.before({
  "duration": 1116372280,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "CoinMarketCap site \"https://coinmarketcap.com/\" opens successfully",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://coinmarketcap.com/",
      "offset": 20
    }
  ],
  "location": "CoinmarketTestingStepDefs.coinmarketcap_site_opens_successfully(String)"
});
formatter.result({
  "duration": 5765978475,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate filters on the home page shows correct results",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-filters-on-the-home-page-shows-correct-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@AllTests"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Clicks on Filters button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Filter records by MarketCap 1000000000 - 10000000000 and Price 101 - 1000",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Check records displayed on page are correct as MarketCap 1000000000 - 10000000000 and Price 101 - 1000",
  "keyword": "Then "
});
formatter.match({
  "location": "CoinmarketTestingStepDefs.user_clicks_on_filter_button()"
});
formatter.result({
  "duration": 330616685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000000",
      "offset": 28
    },
    {
      "val": "10000000000",
      "offset": 41
    },
    {
      "val": "101",
      "offset": 63
    },
    {
      "val": "1000",
      "offset": 69
    }
  ],
  "location": "CoinmarketTestingStepDefs.filter_records_by_marketcap_and_price(long,long,int,int)"
});
formatter.result({
  "duration": 7962737730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000000",
      "offset": 57
    },
    {
      "val": "10000000000",
      "offset": 70
    },
    {
      "val": "101",
      "offset": 92
    },
    {
      "val": "1000",
      "offset": 98
    }
  ],
  "location": "CoinmarketTestingStepDefs.checkRecordsDisplayedOnPageAreCorrectAsMarketCapAndPrice(float,float,float,float)"
});
formatter.result({
  "duration": 6277451497,
  "status": "passed"
});
formatter.after({
  "duration": 166107287,
  "status": "passed"
});
});