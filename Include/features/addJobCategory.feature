Feature: Add New Job Categories
Scenario Outline: Successfully add new job category

Given User is navigated to Job Categories page
When User clicks on the Add button
And User add new job category <jobCategories>
And User clicks on save button
Then User able to add and save job categories succesfully

Examples:
|jobCategories|
|Automation Tester|