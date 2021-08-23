Feature: Covering Family Device scenarios

@Family_1 @Test12 @Family 
Scenario: To verify if the user is redirected to the Family tag device page when the user click on the Family tag device  link.
 Given I updated a test cases in test rail "4420"
 When I click on Planproduct
 When I click on Family1 tag
 Then I verify the family device page if its is redirected
 
 @Family_2 @Test12 @Family
 Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Family tag device page
 Given I updated a test cases in test rail "4421"
 When I click on Planproduct
 When I click on Family1 tag
 Then I scroll down the page
 
 @Family_3_4 @Test12 @Family
 Scenario: To verify if the user is redirected to the Download App page when the user Click on the Download app button within the Family tag device page.
 Given I updated a test cases in test rail "4423"
 When I click on Planproduct
 When I click on Family1 tag
 Then I scroll down the page
 When I click on download app 
 Then It redirect to download app page
 When I go back page
 Then I verify the banner
 
 @Family_5_6 @Test12 @Family
 Scenario: To verify if the user is redirected to the Join now page when the user Click on the Join now button within the Family tag device page.
Given I updated a test cases in test rail "4430"
 When I click on Planproduct
 When I click on Family1 tag
 #Then I scroll down the page
 When I click on join us tab in the page
 Then It redirect to join us app page
 When I go back page
 Then I verify the banner
 
 @Family_7 @Family
 Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the Family tag device page.
 Given I updated a test cases in test rail "4434"
 When I click on Planproduct
 When I click on Family1 tag
 When I go back page
 Then I verify the banner
 
 @Family_2 @Test12 @Family
 Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Family tag device page and verify the below
 Given I updated a test cases in test rail "4436"
 When I click on Planproduct
 When I click on Family1 tag
 Then I verify the banner
 Then I verify the image present in the banner
 Then I verify the text present in the tab
 Then I scroll down the page
 Then I verify the Basic plan section
 Then I verify thw what it is for section
 Then I verify the Available in all Virgin Megastores branches in KSA label
 
  @Family @Test12 @Family
 Scenario: To verify if the user is redirected to the Join now page when the user Click on the Join now button within the Family tag device page.
Given I updated a test cases in test rail "4438"
 When I click on Planproduct
 When I click on Family1 tag
 Then I scroll down the page
 When I click on join us tab in the page
 Then It redirect to join us app page
 When I go back page
 
  @Family @Test12 @Family
 Scenario: To verify the download tab in the page and then verify if user is able to able to redirect back to the page
Given I updated a test cases in test rail "4440"
 When I click on Planproduct
 When I click on Family1 tag
 Then I scroll down the page
 When I click on download tab in the page
  When I go back page
  Then I verify the banner
  
   @Family @Test12 @Family123
 Scenario: To verify if the user is redirected to the page and verify the banner in the page
 Given I updated a test cases in test rail "2588"
 When I click on Planproduct
 When I click on Family1 tag
 Then I scroll down the page
 Then I verify the banner
 
 @Family @Test12 @Family
 Scenario: To verify the download, join now,text label, app store, google download, new customer and megastore text available in the page
Given I updated a test cases in test rail "4435"
 When I click on Planproduct
 When I click on Family1 tag
 Then I scroll down the page
 Then I verify Download tab
 Then I verify join now tab
 Then I verify Text label
 Then I scroll down the page
 Then I Verify app store tab
 Then I verify google download tab
 Then I verify for new customers tab
 Then I verify for virginmob customers 
 Then I verify text Available in all Virgin Megastores branches in KSA
 
    @Family @Test12 @FamilyMob
 Scenario:  To verify if the user is redirected to the page and verify the banner in the page in mobile browser
Given I updated a test cases in test rail "4434"
 When I click on Planproduct in Mobile browser
 When I click on Family1 tag
 Then I scroll down the page
 Then I verify the banner
 
 @Family @Test12 @TestMob @FamilyMob
 Scenario: To verify the download tab, join now,text label, app store, google download, new customer and megastore text available in the page in mobile
Given I updated a test cases in test rail "4435"
 When I click on Planproduct in Mobile browser
 When I click on Family1 tag
 Then I scroll down the page
 Then I verify Download tab
 Then I verify join now tab
 Then I verify Text label
 Then I scroll down the page
 Then I Verify app store tab
 Then I verify google download tab
 Then I verify for new customers tab
 Then I verify for virginmob customers 
 Then I verify text Available in all Virgin Megastores branches in KSA
  
  