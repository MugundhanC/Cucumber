Feature: Applogin

Scenario: Hms Admin login page

Given User enters App Url
And Checks for admin login page gets loaded

When Entering the username and password
And Clicking on submit button

Then User must navigate to homepage