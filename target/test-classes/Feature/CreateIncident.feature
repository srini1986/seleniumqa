Feature: Create a Incident
Scenario: User calls Create a incident Service
	Given Incident service  with  username and Password
	When user hits create Incident Api
	Then the status code is201	