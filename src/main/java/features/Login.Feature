Feature: Login Tests for Leaftaps


Scenario Outline: Login Positive tests

Given The username is entered as <username>
And The password is entered as <password>
And Click Login
Then Verify the welcome message
And Click Logout

Examples:
|username|password|
|DemoSalesManager|crmsfa|