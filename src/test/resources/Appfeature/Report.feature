Feature: HMS Applogin

Background:
Given Enter Application url "http://triotend.com/tts/site/login"
When Username "triotend" password "triotend"
And Click on Signin Button

Scenario: Check for Frontoffice  Addappointment
Then Check for AddAppointment

Scenario: Check for Frontofffice Phonecall logs
Then Check for Phonecall logs

Scenario: Check for Frontoffice Visitor book
Then Check for Visitor Book