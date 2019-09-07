$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "loginpixeel1",
  "description": "",
  "id": "loginpixeel1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "loginpixeel validation with Correct UserName and password",
  "description": "",
  "id": "loginpixeel1;loginpixeel-validation-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open FireFox Browser with URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters Correct username and paasword",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Agent Portal is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AgentLogin.Open_FireFox_Browser_with_URL()"
});
formatter.result({
  "duration": 11812175700,
  "status": "passed"
});
formatter.match({
  "location": "AgentLogin.User_Enters_Correct_username_and_paasword()"
});
formatter.result({
  "duration": 780959100,
  "status": "passed"
});
formatter.match({
  "location": "AgentLogin.Agent_Portal_is_displayed()"
});
formatter.result({
  "duration": 2817856700,
  "status": "passed"
});
formatter.uri("loginpixeel.feature");
formatter.feature({
  "line": 1,
  "name": "loginpixeel",
  "description": "",
  "id": "loginpixeel",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "loginpixeel validation with Correct UserName and password",
  "description": "",
  "id": "loginpixeel;loginpixeel-validation-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open FireFox Browser with URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters Correct username and paasword",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Agent Portal is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AgentLogin.Open_FireFox_Browser_with_URL()"
});
formatter.result({
  "duration": 9633089100,
  "status": "passed"
});
formatter.match({
  "location": "AgentLogin.User_Enters_Correct_username_and_paasword()"
});
formatter.result({
  "duration": 630640300,
  "status": "passed"
});
formatter.match({
  "location": "AgentLogin.Agent_Portal_is_displayed()"
});
formatter.result({
  "duration": 2797105500,
  "status": "passed"
});
});