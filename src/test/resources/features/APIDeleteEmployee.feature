Feature: Validating Syntax /createEmployee.php HRMS API
Background:
Given user generates token

@APITest1

Scenario: This test will delete Employee

Given user calls delete Employee API 
When User retrieves response for delete EmployeeAPI
Then status code is 200 for delete EmployeeAPI
Then user validates deleted Employee