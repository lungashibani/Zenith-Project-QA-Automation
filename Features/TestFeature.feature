Feature: Example Feature - Create Candidate

  Background:
    Given I have logged into the application

  @test
  Scenario: Example Tests - Create Candidate
    When I create a new candidate via the Plus Icon
    Then verify I can view the new candidate