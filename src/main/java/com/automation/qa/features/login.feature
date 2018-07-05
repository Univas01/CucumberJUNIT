Feature: Login into application

	Scenario: User can successfully login into CRM Application

		Given I'm on CRM login page
		When I login with valid username and password
		Then I should login successfully
		And title of the page should display "CRMPRO"