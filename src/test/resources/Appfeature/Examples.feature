Feature: Test Applogin

Scenario Outline: Testing for staff login
Given Staff is in staff login page
When Staff Enter the username"<Username>"
And Staff Enter the password"<Password>"
And Staffs clicks on the submit button
Then Staff navigated to the dashboard page

Examples:
     |Username|Password|
     |trio1|TTS1| 
     |trio2|TTS2|
     |trio3|TTS3|