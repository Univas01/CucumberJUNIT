$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/automation/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can successfully login into CRM Application",
  "description": "",
  "id": "login-into-application;user-can-successfully-login-into-crm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I\u0027m on CRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login with valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should login successfully with page title displayed as \"CRMPRO\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.i_m_on_CRM_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepDefinition.i_login_with_valid_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO",
      "offset": 58
    }
  ],
  "location": "loginStepDefinition.i_should_login_successfully_with_page_title_displayed_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/main/java/com/automation/qa/features/travelexSignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up into travelex",
  "description": "",
  "id": "sign-up-into-travelex",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can successfully sign up",
  "description": "",
  "id": "sign-up-into-travelex;user-can-successfully-sign-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Sign Up page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user fills all the required information correctly",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the form is submitted",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be re-directed to welcome page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});