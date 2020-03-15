@sprint1 @login
Feature: Login

  @smoke
  Scenario: Add Employee
    #Given I open browser and navigated to the HRMS
    When I enter valid username and password
    And I click login button
    And I click PIM link
    And I click Add Employee link
    When i enter employee details
      | FirstName | Middle | LastName |
      | Bartu     | k      | Demirkiran  |
    And I click save
    And I click Edit
   
    Then I am able to modify Employee Details
    
      | DeriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DateOfBirth |
      | N787886        | 2021-12-12     | 123-45-7896 | 3456728 | Male   | Other         | Turkish     | 1985-07-14  |
