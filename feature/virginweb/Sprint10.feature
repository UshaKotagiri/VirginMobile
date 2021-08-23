Feature: Covering Sprint10 scenarios

#Combined Scenarios
#To verify if the user is able to view the details when hover the mouse through "Plans and Product" tab
#To verify if the user is able to click on "Others Offer" when hover the mouse through "Plans and Product" tab
#To verify if the user redirected to "others offer" page when user click on other offer in "plan and product" tab.
#To verify if the "prepaid" button appears under other offer page when user redirected to others offer page.
#To verify if “VAT is applied at the time of recharge or through transactions on our website or the Virgin Mobile App" text appears witihin "youtube and social media offers" under prepaid section.
#To verify if" Bundelha Plans" appears in prepaid section under other offers page.
#To verify if"fees","local calls","validity" details appear under bundhela plan within prepaid section.
#To Verify if "SAR","MINUTES","DAYS" appears in bundhela plan under prepaid section.
#To verify if "Or you can dial *108#" appears within bundhela plan under prepaid section.
#To verify if“VAT is applied at the time of recharge or through transactions on our website or the Virgin Mobile App.” text appears within bundhela plan under prepaid section.
#To verify if "Data Bundles" appears under prepaid section within other offers page
#To verify if"fees","data","validity" details appear under data bundles within prepaid section
#To verify if "Or you can dial *110#" appears within data bundles under prepaid section.
#To verify if "National Minutes" appears under prepaid section within other offers page
#To verify if"fees","local calls","validity" details appear under national minutes within prepaid section.
#To verify if "Or you can dial *121#" appears within national minutes under prepaid section.
#To verify if“VAT is applied at the time of recharge or through transactions on our website or the Virgin Mobile App.” text appears within national minutes under prepaid section.
#To verify if "Post Paid" button is clickable or not.
#To verify if "standard pricing" appears within postpaid section.
#To verify if“VAT is applied at the time of recharge or through transactions on our website or the Virgin Mobile App.” text appears within "standard pricing" under postpaid section.

@Sprint10
Scenario: Combined Scenario_01_01_03_04_05_06_07_08_09_10_11_12
Given I have updated on Test rail "6000"
When I Click on offers in plan and product in dd
Then I verify that we are redircted to other offers page
Then I verify prepaid button appears on the offers page
Then I verify VAT text is available in the offers page
Then I verify Bundhela plans appears on the page
Then I verify fees and validity section appears on the page
Then I verify sar minutes appears in the prepaid section
Then I verify the dial number text in the bundhela plan
Then I verify fees and validity section appears in the bundhela plans
Then I verify sar minutes appears in the bundhela plan prepaid section
Then I verify the dial number text in the prepaid page in social media
Then I verify if VAT is applied at the time of recharge
Then I verify National Minutes appears under prepaid section within other offers page
Then I verify fees under national minutes
Then I verify you can dial text under national minutes
Then I verify Vat text in national minutes
Then I verify postpaid button is cliackable or not
Then I verify standard pricing apperars in postpaid
Then I verify vat text in postpaid section

#Combined scenarios
#To verify if international rates is present in dropdown
#To verify if international roaming is present in dropdown
#To verify if user is able to click over international rates
#To verify if user is redirected to international rates page
@Sprint10
Scenario: Combined scenario for Sprint 11 international rates
Given I have updated on Test rail "6015"
When I Click on offers in plan and product in dd
Then I verify the international rates in the dd
Then I verify international roaming in dd
When I click on international rates
Then I verify its redirected to international rates

#Combined scenarios
#To verify if user is able to click on international roaming
#To verify if user is redirected to international roaming page
#To verify if "updated" table appear when user click on International Roaming.
#To verify if "text" above table "countries" is  blank or invalid.
#To verify if data table is available in the roaming page
#To verify if CITC card column is available in the table
@Sprint10
Scenario: Combined scenarios for International Roaming
Given I have updated on Test rail "6019"
When I Click on offers in plan and product in dd
When I click on International Roaminga
Then I verify the page if its redirected to the required page
Then I verify updated table appears in the roaming tab
Then I verify data in the table is empty
Then I verify the table appears in the International roaming page
Then I verify CITC card column appear in table

#Combied scenarios
#To verify Frendi package is available in dropdown
#To verify if user is able to click on Frendi package
#To verify if user is redirected to the frendi package page
#To verify if user is able to click on data i frendi package
#To verify fees tab in data in the frendi package
#To verify if dial text is avaialable in the frendi package
#To verify if Vat text is avaialable in the frendi package
#To verify if Night time appears in the rates column in frendi package
@Sprint10
Scenario: Combined scenarios for Frendi package
Given I have updated on Test rail "6024"
When I Click on offers in plan and product in dd
When I click on Frendi package in pandproducts
Then I verify user is redirected to Frendi package
When I click on data
Then I verify data bundles in data in frendiP
Then I verify fees in data in FrendiP
Then I verify Dial text in FrendiP
Then I verify VAT text in frendiP
Then I verify NightTime appears in Rates in frendi data bundles
 
