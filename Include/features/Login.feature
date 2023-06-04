Feature: Login interface
Scenario Outline: User successfully login into page

Given User navigate to login page
When User enters <username> and <password>
And User clicks login button
Then User is navigated to homepage

Examples:
|username|password|
|Admin|hUKwJTbofgPU9eVlw/CnDQ==|