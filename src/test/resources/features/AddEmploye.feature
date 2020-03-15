Feature: AddingEmploye


Scenario: Add Employee
Given I open browser and navigated to the HRMS
When I enter valid username and password
And I click login button
Then I successfully logged in
And  I click PIM link
Then I click Add Employee link
And I entered fullName and lastName
Then I click save button




