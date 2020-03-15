Feature: 

  Background: 
    Given I open navigated to the HRMS
    When I enter username and password
    And I click login

  Scenario: AddEmploye without employee id
    And I click PIM
    Then I click Add Employee
    And I delete employe id
    And I click save
    And I see employee without employee and id is being added
    Then I close browser

  Scenario: Add employee and click checkbox
    And I click PIM link
    Then I click Add Employee link
    And I entered fullName and lastName
    And I click checkbox
    And I add userName, password and repassword
    Then I close browser

  Scenario Outline: Add new employee
    And I click PIM
    Then I click Add Employee
    And I add "<firstName>", "<middle>" ,and "<lastName>"
    Then I click save

    Examples: 
      | firstName | middle | lastName   |
      | Bahar     | Seda   | Demirkiran |
      | Antepli   | S      | Demirkiran |
      | Sukur     | az     | kaldi      |
      | Berke     | Emin   | Demirkiran |
