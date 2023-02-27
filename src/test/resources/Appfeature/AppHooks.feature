Feature: HMS Appadmin login

Scenario: HMS login page
Given User is in Loginpage
When Entering the Admin name "Admin"
And Entering the password "Admin123"
And Clicking on signin button
Then User must navigate to dashboard page