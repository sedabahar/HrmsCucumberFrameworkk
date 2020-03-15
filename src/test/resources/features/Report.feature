Feature: report

Background:
Given I am logged into HRMS
And I navigated to the Report Page

Scenario: Search for invalid report

When I click search button
And I see No resorch button
Then I see no record found message

Scenario: Seach for valid report

When I click search button
Then I see the search report is displayed
