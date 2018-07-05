Feature: Sign up into travelex

	Scenario: User can successfully sign up  
		Given User is on Sign Up page
		When the user fills all the required information correctly 
		And  the form is submitted
		Then user should be re-directed to welcome page
