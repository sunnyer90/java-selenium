Feature: This feature file is to verify login functionality of subsource application

Scenario: This scenario is to validate login functionality for demo user

	Given Initialize the browser
	When Navigate to "SubSource" site
	And User clicks on Login button
	And User enters "devdemo" as Username and "Woodland@92" as Password followed by clicking on Login button
	Then Verify that user is able to see dashboard page
	And Close the browser
