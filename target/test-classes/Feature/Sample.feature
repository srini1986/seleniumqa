Feature: loginpixeel1

@Run
Scenario: loginpixeel validation with Correct UserName and password
    Given Open FireFox Browser with URL
    When User Enters Correct username and paasword
    Then Agent Portal is displayed
