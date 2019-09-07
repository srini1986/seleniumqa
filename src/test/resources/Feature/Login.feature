Feature: To test if a quote is generated

Scenario Outline: The quote should be generated after entering the details
Given users is on the "<Url>"
When users enters details
Then quotes should be successfully generated
Examples: 
|Url|
|https://www.thig.com|