Feature: Covering Family Device scenarios

@FindAStore_1_2_3_4_5_7 @FindAstore
Scenario: To verify Find A Store page and verify location search and current location tab
Given I have updated on Test rail "5476"
When I click on help and support button on Virgin 
When I click on Find a store tab in virgin
Then I get redirected to a find store page
When I click on Find a location tab
When I scroll down the Find Store
When I click on location tab
Then I verify the Current location

@FindAstore_overall @FindAstore
Scenario: To verify Find A Store page and check the diffent functions checkboxes in the hamburger
Given I have updated on Test rail "5481"
When I click on help and support button on Virgin 
When I click on Find a store tab in virgin
Then I get redirected to a find store page
When I click on Hamburger in find a store
Then Hamburger opens
When I click on Find a location tab
When I scroll down the Find Store
When I click on Family tag in HB
Then I click on done and redircted to required pge
When I click on Hamburger in find a store
When I click on Recharge in HB
Then I click on done and redircted to required pge
When I click on Hamburger in find a store
When I Click on sim in HB
Then I click on done and redircted to required pge
When I click on back button of HB
When I scroll up the HB page
Then I get hamburger gets closed

@WhyVirginMob_1_2_3
Scenario: To Verify vogin mobile page and sroll down
Given I have updated on Test rail "4550"
When I click on why virgin mobile1 page
Then I get redirected to the req page
When I scroll down the why virgin mob page

@TopUpWallet_overall
Scenario: To verify the join now page and check the country code values
Given I have updated on Test rail "4551"
When I click On JoinNow Page for the case
Then I get on the join now page
When I scroll down the join page
When I click on port Number
When I click on country code
Then I get required result



 