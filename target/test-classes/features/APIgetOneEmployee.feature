Feature: Validating Syntax /createEmployee.php HRMS API
Background:
Given user generates token

@APITest1

Scenario: This test will get an one Employee 

Given user calls getoneEmployee API 
When User retrieves response for getOneEmployee API
Then status code is 200 for getOneEmployee API
Then user validates created employee exists