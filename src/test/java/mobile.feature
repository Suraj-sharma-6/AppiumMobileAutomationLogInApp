Feature: Login
  Scenario: Login verification
    And user logs in through Login Window by using Username as "Jolly" and Password as "admin"
    Then login must be successful.