Feature: Registration page
Scenario: User Registration

Given User in registraion page
When User Enter the details
     |trio|tend|cbe|876543223|
     |trio|tend|Chennai|876543227|
     |trio|tend|Bangalore|876543228|
     |trio|tend|trichy|876543224|
Then Registration should be succesfull


Scenario: Doctor Registration
Given Doctor in is Registration
When Doctor Enetr the details
     |Firstname|Lastname|city|phno|
     |trio|tend|cbe|876543223|
     |trio|tend|Chennai|876543227|
     |trio|tend|Bangalore|876543228|
     |trio|tend|trichy|876543224|
Then Doctor Registration should be succesfull