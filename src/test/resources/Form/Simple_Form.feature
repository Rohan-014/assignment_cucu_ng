@tag
Feature: Form Registration

  @tag1
  Scenario: To validate the from fill up
    Given open the browser, enter the simple from url
    When users enter the first_name,second_name,email,contact_no,message
    And clicking on submit button
    Then I validate pop up thank you message
    And clicking on ok button

#  @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 #   When I check for the <value> in step
 #   Then I verify the <status> in step
 

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
