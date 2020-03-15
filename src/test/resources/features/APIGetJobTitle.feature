Feature: Validating Syntax /createEmployee.php HRMS API
Background:
Given user generates token

@APITest1

Scenario: This test will get all jobTitle 

Given user calls jobTitle  API 
When User retrieves response for jobTitle  API
Then status code is 200 for jobTitle  API
Then user validates got jobTitle 