@all
Feature: HMS Applogin
@Admin @Smoke
Scenario: HMS Admin login page
Given  User Enters the app url"http://triotend.com/tts/site/Adminlogin"
When  Entering the username "Admin" Password "Admin123"
And  Clicking on submit buttton
Then  User must navigate to Admin dashboard page
@Staff
Scenario: HMS Staff login page
Given  User Enters the app url"http://triotend.com/tts/site/Stafflogin"
When  Entering the username "Staff" Password "Staff123"
And  Clicking on submit buttton
Then  User must navigate to Staff dashboard page
@Doctor
Scenario: HMS Doctor login page
Given User Enters the app url"http://triotend.com/tts/site/Doctorlogin"
When  Entering the username "Doctor" Password "Doctor123"
And   Clicking on submit buttton
Then  User must navigate to Doctor dashboard page