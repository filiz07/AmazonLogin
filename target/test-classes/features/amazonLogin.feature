Feature: Amazon Login
@amazon
  Scenario: User Login Amazon
    Given User clicks  AmazonUrl
    Then User clicks start here button
    And User clicks create New Account Button
    And User clicks Your name button
    Then User writes a right fullname
    Then User clicks Mobile number or email button
    And User writes a right email
    Then User clicks Password button
    And User writes a right password
    Then User clicks Re-enter password button
    And User writes a right password re-enter Button
    Then User clicks Continue button
  And Users verify account text
  







