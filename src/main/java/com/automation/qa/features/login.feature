Feature: Login into application

Scenario: User can successfully login into CRM Application 
Given I'm on CRM login page 
When I login with valid username and password 
Then I should login successfully with page title displayed as "CRMPRO"
