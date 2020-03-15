Feature: Validating Syntax /createEmployee.php HRMS API
Background:
Given user generates token

@APITest1

Scenario: This test will get employee Status

Given user calls employee Status API 
When User retrieves response for employee Status API
Then status code is 200 for employee Status API
Then user validates got employee Status 