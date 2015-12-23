Feature: simple journey

  Background:
    Given Contacts application is launched

  @journey1
  Scenario: Contact creation viewing and deletion
    Given Contact application is launched
    When User creates a new contact with following data
    |name|phoneNumber|emailId|
    |John|09999999999|J@doe.com|
    Then User Views the contact card with following data
      |name|
      |John|
    When User click back button on device
    Then User should see "John" contact listed on home page