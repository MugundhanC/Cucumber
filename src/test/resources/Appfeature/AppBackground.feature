Feature: HMS Applogin

Background:
Given Enetr the Application Url"http://triotend.com/tts/site/login"
When Username "triotend" Password "Triotend"
And Click on the signin button

Scenario: Checks for the Frontoffice AddAppointment 

Then Checks for the AddAppointment 

Scenario: Checks for the Frontoffice Phonecalltags

Then Checks for the Phonecalltags

Scenario: Checks for the Frontoffice Visitorbook

Then Checks for the Visitorbook