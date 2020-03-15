Feature: Validating Syntax /createEmployee.php HRMS API
Background:
Given user generates token

@APITest1

Scenario: This test will check to see if an Employee is updated

Given user calls updateEmployee API 
When User retrieves response for updated Employee
Then status code is 200 for updated Employee
Then user validates employee is updated