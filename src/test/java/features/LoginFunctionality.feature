Feature: This feature is for validating Home Page functionality

Scenario: Login-1 Login functionality validation 
Given I am on the login page
When I enter login credentials
And I click on sign in button
Then I am on the homepage


Scenario: Login-2 Login of retail member validation 
Given I am on the login page
When I enter login credentials
And I click on sign in button
Then I am on the homepage

