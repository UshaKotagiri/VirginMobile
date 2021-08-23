Feature: Covering HomePage scenarios

@Home_977
@tag @Homepage 
Scenario: Verify Plan and Product tabs
Given I updated a test cases in test rail "3752"
   When I click on the Plan and Product tab
   Then I see different options
  

@Home_02 @Homepage
Scenario: verify if the user is redirected to the plans page when the user click on the Plans button within Plans and product menu
   Given I updated a test cases in test rail "3753"
   When I click on the Plan and Product tab
   Then I see different options
   And I click on plan tab
   Then I get redirected to plans tab
   

@Home_03 @Homepage
Scenario: To verify if the user is redirected to the other offres page when the user click on the other offers button within plans and product menu
   Given I updated a test cases in test rail "3754"
   When I click on the Plan and Product tab
   Then I see different options
   And I click on offers tab
   Then I get redirected to Other Offers page

@Home_04 @Homepage
Scenario: To verify if the user is redirected to the international rates page when the user click on the international rates button within plans and product menu
   Given I updated a test cases in test rail "3755"
   When I click on the Plan and Product tab
   Then I see different options
   And I click on internationalRates tab
   Then I get redirected to international rates page

@Home_05 @Homepage
Scenario: To verify if the user is redirected to the international roaming page when the user click on the international roaming button plans and product menu
   Given I updated a test cases in test rail "3756"
   When I click on the Plan and Product tab
   Then I see different options
   And I click on internationalRoaming tab
   Then the Roaming header is displayed
   
@Home_06 @Homepage
Scenario: To verify if the user is redirected to the family tag device page when the user click on the family tag device button within plans and product menu
   Given I updated a test cases in test rail "3757" 
   When I click on the Plan and Product tab
   Then I see different options
   And I click on familytag tab
   Then I verify the family device page if its is redirected
   
@Home_07 @Homepage
Scenario: To verify if the user is redirected to the friendi package page when the user click on the friendi  button within menu
  Given I updated a test cases in test rail "3758"
   When I click on the Plan and Product tab
   Then I see different options
   And I click on frendi tab
   Then I get redirected to the Tab
   
@Home_08 @Homepage
Scenario: To verify if the user is able to view the details when hover the mouse through help and support tab
  Given I updated a test cases in test rail "3759"
   When I click on the help and support tab
   Then I see different options in help and support
   
@Home_09 @Homepage
Scenario: To verify if the user is redirected to the faq page when the user click on the faq  button within help and support menu
   Given I updated a test cases in test rail "3760"
   When I click on the help and support tab
   Then I see different options in help and support
   And I click on faq tab
   Then I get redirected to FAQ tab again
   
@Home_10 @Homepage
Scenario: To verify if the user is redirected to the contact us page when the user click on the Contact us button within help and support menu
   Given I updated a test cases in test rail "3761"
   When I click on the help and support tab
   Then I see different options in help and support
   And I click on contact tab
   Then I get redirected to contact tab
   
@Home_11 @Homepage
Scenario: To verify if the user is redirected to the Find a store page when the user click on the Find a Store  button within help and support menu
   Given I updated a test cases in test rail "3762"
   When I click on the help and support tab
   Then I see different options in help and support
   When I click on findaStore tab
   Then I verify I get redirected to FindAStore page

@Home_12 @Homepage
Scenario: To verify if the user is redirected to the Why virgin mobile page when the user click on the Why virgin mobile tab  button
  Given I updated a test cases in test rail "3763"
   When I click on the why virgin mobile tab
   Then I verify its redirected to Virgin mobile page
   
@Home_13 @Homepage
Scenario: To verify if the user is successfully able to  change the current language to different when the user click on the language tab.
  Given I updated a test cases in test rail "3764"
   When I click on the different language tab
   Then I verify different language page

@Home_14 @Homepage
Scenario: To verify if the user is redirected to the Quick top up page when the user click on the Quick top up  button .
   Given I updated a test cases in test rail "3765"
   When I click on the quick top up tab
   Then I get redirected to QuickTopUp page
   
   
@Home_15 @Homepage
Scenario: To verify if the user is redirected to the Join now page when the user click on the Join now  button .
   Given I updated a test cases in test rail "3767"
   When I click on the Join now tab
   Then I redirect to Join Us Page
 
  @Home_Mob_01 @tag @TestMob 
Scenario: Verify Plan and Product tabs
Given I updated a test cases in test rail "3752"
   When I click on the Plan and Product tab in mobilehamburgerhamburger
   Then I see different options in mobile
  

@Home_02 @TestMob
Scenario: verify if the user is redirected to the plans page when the user click on the Plans button within Plans and product menu
   Given I updated a test cases in test rail "3753"
   When I click on the Plan and Product tab in mobilehamburger
   Then I see different options in mobile
   When I click on plan tab in mobile
   Then I get redirected to plans tab


@Home_03 @TestMob
Scenario: To verify if the user is redirected to the other offres page when the user click on the other offers button within plans and product menu
   Given I updated a test cases in test rail "3754"
   When I click on the Plan and Product tab in mobilehamburger
   Then I see different options in mobile
   When I click on offers tab in mobile
   Then I get redirected to Other Offers page
   

@Home_04 @TestMob
Scenario: To verify if the user is redirected to the international rates page when the user click on the international rates button within plans and product menu
   Given I updated a test cases in test rail "3755"
   When I click on the Plan and Product tab in mobilehamburger
   Then I see different options in mobile
   And I click on internationalRates tab in mobile
   Then I get redirected to international rates page

@Home_05 @TestMob
Scenario: To verify if the user is redirected to the international roaming page when the user click on the international roaming button plans and product menu
   Given I updated a test cases in test rail "3756"
   When I click on the Plan and Product tab in mobilehamburger
   Then I see different options in mobile
   And I click on internationalRoaming tab in mobile
   Then the Roaming header is displayed
   
@Home_06 @TestMob
Scenario: To verify if the user is redirected to the family tag device page when the user click on the family tag device button within plans and product menu
   Given I updated a test cases in test rail "3757" 
   When I click on the Plan and Product tab in mobilehamburger
   Then I see different options in mobile
   And I click on familytag tab in mobile
   Then I verify the family device page if its is redirected
   
@Home_07 @TestMob
Scenario: To verify if the user is redirected to the friendi package page when the user click on the friendi  button within menu
  Given I updated a test cases in test rail "3758"
   When I click on the Plan and Product tab in mobilehamburger
   Then I see different options in mobile
   And I click on frendi tab in mobile
   
   
@Home_08 @TestMob
Scenario: To verify if the user is able to view the details when hover the mouse through help and support tab
  Given I updated a test cases in test rail "3759"
   When I click on the help and support tab in mobile
    Then I see different options
   
@Home_09 @TestMob
Scenario: To verify if the user is redirected to the faq page when the user click on the faq  button within help and support menu
   Given I updated a test cases in test rail "3760"
   When I click on the help and support tab in mobile
  Then I see different options
   And I click on faq tab in mobile
   
@Home_10 @TestMob
Scenario: To verify if the user is redirected to the contact us page when the user click on the Contact us button within help and support menu
   Given I updated a test cases in test rail "3761"
   When I click on the help and support tab in mobile
    Then I see different options
   And I click on contact tab in mobile
   
@Home_11 @TestMob
Scenario: To verify if the user is redirected to the Find a store page when the user click on the Find a Store  button within help and support menu
   Given I updated a test cases in test rail "3762"
   When I click on the help and support tab in mobile
   Then I see different options
   And I click on findaStore tab in mobile
  

@Home_12 @TestMob
Scenario: To verify if the user is redirected to the Why virgin mobile page when the user click on the Why virgin mobile tab  button
  Given I updated a test cases in test rail "3763"
  When I click on the Plan and Product tab in mobilehamburgerhamburger
   Then I see different options in mobile
   When I click on the why virgin mobile tab in mobile
   Then I redirected to why virgin page
  
   
@Home_13 
Scenario: To verify if the user is successfully able to  change the current language to different when the user click on the language tab.
  Given I updated a test cases in test rail "3764"
  When I click on the Plan and Product tab in mobilehamburgerhamburger
  Then I see different options in mobile
   When I click on the different language tab in mobile
  Then I verify different language page
   

@Home_14 @TestMob
Scenario: To verify if the user is redirected to the Quick top up page when the user click on the Quick top up  button .
   Given I updated a test cases in test rail "3765"
   When I click on the Plan and Product tab in mobilehamburgerhamburger
   Then I see different options in mobile
   When I click on the quick top up tab in mobile
   Then I get redirected to QuickTopUp page
   
@Home_15 @TestMob123
Scenario: To verify if the user is redirected to the Join now page when the user click on the Join now  button .
   Given I updated a test cases in test rail "3766"
   When I click on the Plan and Product tab in mobilehamburgerhamburger
   Then I see different options in mobile
     When I click on the Join now tab in mobile
     Then I redirect to Join Us Page


   
   