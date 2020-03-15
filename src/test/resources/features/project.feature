Feature: Changing contact details

  Background: 
    Given I am logged into HRMS
    When I click PIM link
    Then I add employee
    And I verify it

  @Smoke
  Scenario: Changing details
    Given I click on Contact Details
    When click on edit button
    Then enter address Street
    And enter City
    And enter State
    And enter Zip code
    And add Country
    And enter Home Telephone
    And enter WorkTelephone
    Then click on save button

  @Smoke
  Scenario: Changing details invalid work other email
    Given I click on Contact Details
    When click on edit button
    Then enter address Street
    And enter City
    And enter State
    And enter Zip code
    And add Country
    And enter Home Telephone
    And enter WorkTelephone
    And other email
    Then click on save button
