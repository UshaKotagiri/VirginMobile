Feature: Covering Language scenarios

@Language  @Language_01
Scenario: To verify if the language is changed to Arabic by clicking on the "العربية" button
Given I updated a test cases in test rail "3511"
When I click on Arabic language tab
Then The language changes to arabic

@Language  @Language_02
Scenario: To verify if the language is changed to Arabic by clicking on the "العربية" button
Given I updated a test cases in test rail "3512"
When I click on Arabic language tab
When I click on English language tab
Then The language changes to English


