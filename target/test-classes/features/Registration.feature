
Feature: Register Page Scenarios

Scenario: Registration functionality

Given I am on the Login Page
When I enter valid email id
And I click submit
Then I see the username and password credentials