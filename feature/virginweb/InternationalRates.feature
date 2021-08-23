Feature: Covering International rates scenarios

@InternationalRates_1 @IntRates @IntratesUni
Scenario: To verify if the user is redirected to the International rates page when the user click on the International rates  link.
  Given I updated a test cases in test rail "5250"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  
@InternationalRates_2 @IntRates
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Inyternational rates page
  Given I updated a test cases in test rail "5251"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When international rate page is scrollabble
  
@InternationalRates_3 @IntRates
Scenario: To verify if the select country dropdown  is clickable or not within the International rates page
  Given I updated a test cases in test rail "5252"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select the country
  
@InternationalRates_4 @IntRates @Demo
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select any country within the International rates page
  Given I updated a test cases in test rail "5253"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select the country
  When I scroll the InternationalRtes Page
  When I click on select country
  Then local sms and call rate is displayed
  
 @InternationalRates_5 @IntRates
 Scenario: To verify if the Local SMS and Calls field is populated with the details and redirect to back page
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select the country
  Then local sms and call rate is displayed
  When I click on back button in international rates page
  Then It get redirected to the previous page
  
@InternationalRates_6 @IntRates
Scenario: o verify if the Local SMS and Calls field is populated with the details when the user select Albania country within the International rates page
  Given I updated a test cases in test rail "5254"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select the country
  #Then I verify the text in the dropdown
  Then Local sms and call rates are displayed for Albania
  
  @InternationalRates_7 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Algeria country within the International rates page
  Given I updated a test cases in test rail "5255"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select the country
  #Then I verify the text in the dropdown
  Then Local sms and call rates are displayed for Algeria
  
  @InternationalRates_8 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select American Samoa country within the International rates page
 Given I updated a test cases in test rail "5257"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select American Samaoa as country
  Then Local sms and call rates are displayed for American Samoa
  
 @InternationalRates_9 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Andorra country within the International rates page
  Given I updated a test cases in test rail "5260"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Angola as country
  Then local sms and call rate is displayed
  
@InternationalRates_10 @IntRates1
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Angola country within the International rates page
 Given I updated a test cases in test rail "5263"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Angola as country
  Then local sms and call rate is displayed
  
 @InternationalRates_11 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Anguilla country within the International rates page
 Given I updated a test cases in test rail "5266"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Anguilla as country
  Then local sms and call rate is displayed
  
@InternationalRates_12 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Antigua and Barbuda country within the International rates page
 Given I updated a test cases in test rail "5269"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Antigua and Barbuda as country
  Then local sms and call rate is displayed
  
@InternationalRates_13 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Argentina country within the International rates page
 Given I updated a test cases in test rail "5271"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Argentina as country
  Then local sms and call rate is displayed
  

 @IntRates @InternationalRates_14 
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Armania country within the International rates page
 Given I updated a test cases in test rail "5273"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Armania as country
  Then local sms and call rate is displayed
  
 @InternationalRates_15 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Ascension  country within the International rates page
 Given I updated a test cases in test rail "5276"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Ascension as country
  Then local sms and call rate is displayed
  
 @InternationalRates_16 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Australia country within the International rates page
 Given I updated a test cases in test rail "5279"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Australia as country
  Then local sms and call rate is displayed
 
    @InternationalRates_17 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Azerbaijan country within the International rates page
 Given I updated a test cases in test rail "5282"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Azerbaijan as country
  Then local sms and call rate is displayed
  
   @InternationalRates_18 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bahamas country within the International rates page
 Given I updated a test cases in test rail "5285"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bahamas as country
  Then local sms and call rate is displayed
  
   @InternationalRates_19 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bahrain country within the International rates page
 Given I updated a test cases in test rail "5288"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bahrain as country
  Then local sms and call rate is displayed
  
   @InternationalRates_20 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bangladesh country within the International rates page
 Given I updated a test cases in test rail "5290"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bangladesh as country
  Then local sms and call rate is displayed
  
   @InternationalRates_21 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Barbados  country within the International rates page
 Given I updated a test cases in test rail "5292"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Barbados as country
  Then local sms and call rate is displayed
  
   @InternationalRates_22 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Belarus country within the International rates page
 Given I updated a test cases in test rail "5295"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Belarus as country
  Then local sms and call rate is displayed
  
   @InternationalRates_23 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Belgium country within the International rates page
 Given I updated a test cases in test rail "5298"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Belgium as country
  Then local sms and call rate is displayed
  
  
   @InternationalRates_24 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Belize country within the International rates page
 Given I updated a test cases in test rail "5301"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Belize as country
  Then local sms and call rate is displayed
  
   @InternationalRates_25 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Benin country within the International rates page
 Given I updated a test cases in test rail "5302"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Benin as country
  Then local sms and call rate is displayed
  
 @InternationalRates_26 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bermuda country within the International rates page
 Given I updated a test cases in test rail "5305"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bermuda as country
  Then local sms and call rate is displayed


 @InternationalRates_27 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bhutan country within the International rates page
 Given I updated a test cases in test rail "5308"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bhutan as country
  Then local sms and call rate is displayed
  
   @InternationalRates_28 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bolivia country within the International rates page
 Given I updated a test cases in test rail "5311"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bolivia as country
  Then local sms and call rate is displayed
  
   @InternationalRates_29 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bosnia and Herzegovina country within the International rates page
 Given I updated a test cases in test rail "5313"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bosnia and Herzegovina as country
  Then local sms and call rate is displayed
  
   @InternationalRates_30 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Botswana country within the International rates page
 Given I updated a test cases in test rail "5316"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Botswana as country
  Then local sms and call rate is displayed
  
   @InternationalRates_31 @IntRates
 Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Brazil country within the International rates page
 Given I updated a test cases in test rail "5319"
 When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Brazil as country
  Then local sms and call rate is displayed
  
   @InternationalRates_32 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select British virgin Islands country within the International rates page
  Given I updated a test cases in test rail "5321"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select British Virgin Islands as country
  Then local sms and call rate is displayed
  

   @InternationalRates_33 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Brunei country within the International rates page
  Given I updated a test cases in test rail "5324"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Brunei as country
  Then local sms and call rate is displayed
  
    @InternationalRates_34 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Bulgaria country within the International rates page
  Given I updated a test cases in test rail "5326"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Bulgaria as country
  Then local sms and call rate is displayed
  
     @InternationalRates_35 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Burkina Faso country within the International rates page
  Given I updated a test cases in test rail "5329"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Burkina Faso as country
  Then local sms and call rate is displayed
  
     @InternationalRates_36 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Burundi country within the International rates page
  Given I updated a test cases in test rail "5331"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Burundi as country
  Then local sms and call rate is displayed
  
     @InternationalRates_37 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Combodia country within the International rates page
  Given I updated a test cases in test rail "5333"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Combodia as country
  Then local sms and call rate is displayed
  
  @InternationalRates_38 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Cameroon country within the International rates page
  Given I updated a test cases in test rail "5336"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Cameroon as country
  Then local sms and call rate is displayed
  
    @InternationalRates_39 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Canada country within the International rates page
  Given I updated a test cases in test rail "5339"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Canada as country
  Then local sms and call rate is displayed
  
    @InternationalRates_40 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Cape verde country within the International rates page
  Given I updated a test cases in test rail "5341"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Cape verde as country
  Then local sms and call rate is displayed
  
  @InternationalRates_41 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Cayman islands country within the International rates page
  Given I updated a test cases in test rail "5343"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Cayman islands as country
  Then local sms and call rate is displayed
  
  @InternationalRates_42 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select  Central African Republic country within the International rates page
  Given I updated a test cases in test rail "5346"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Central African Republic as country
  Then local sms and call rate is displayed
  
  @InternationalRates_43 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Cape verde country within the International rates page
  Given I updated a test cases in test rail "5348"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Chile as country
  Then local sms and call rate is displayed
  
  @InternationalRates_44 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Chad  country within the International rates page
  Given I updated a test cases in test rail "5351"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Chad as country
  Then local sms and call rate is displayed
  
  @InternationalRates_45 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select China  country within the International rates page
  Given I updated a test cases in test rail "5353"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select China as country
  Then local sms and call rate is displayed
  
  @InternationalRates_46 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select China  country within the International rates page
  Given I updated a test cases in test rail "5356"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select China as country
  Then I verify the china in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_47 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Colombia  country within the International rates page
  Given I updated a test cases in test rail "5359"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Colombia as country
  Then I verify the Colombia in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_48 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Comoros country within the International rates page
  Given I updated a test cases in test rail "5360"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Comoros as country
  Then I verify the Comoros in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_49 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Cook Islands country within the International rates page
  Given I updated a test cases in test rail "5363"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Cook Islands as country
  Then I verify the Cook Islands in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_50 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Costa Rica  country within the International rates page
  Given I updated a test cases in test rail "5366"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Costa Rica as country
  Then I verify the Costa Rica in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_51 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Croatia  country within the International rates page
  Given I updated a test cases in test rail "5369"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Croatia as country
  Then I verify the Croatia in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_53 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Cyprus country within the International rates page
  Given I updated a test cases in test rail "5371"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Cyprus as country
  Then I verify the Cyprus in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_54 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Czech_Republic country within the International rates page
  Given I updated a test cases in test rail "5372"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Czech_Republic as country
 # Then I verify the Czech_Republic in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_55 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Democratic Republic of the Congo country within the International rates page
  Given I updated a test cases in test rail "5375"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Democratic Republic of the Congo as country
  Then I verify the Democratic Republic of the Congo in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_56 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Denmark country within the International rates page
  Given I updated a test cases in test rail "5378"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Denmark as country
  Then I verify the Denmark in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_57 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select DiegoGarcia country within the International rates page
  Given I updated a test cases in test rail "5380"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Diego Garcia as country
  Then I verify the Diego Garcia in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Dominica country within the International rates page
  Given I updated a test cases in test rail "5382"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Dominica as country
  Then I verify the Dominica in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_59 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Djibouti country within the International rates page
  Given I updated a test cases in test rail "5385"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Dominican Republic as country
  Then I verify the Dominican Republic in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_60 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Djibouti country within the International rates page
  Given I updated a test cases in test rail "5388"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select East Timor as country
  Then I verify the East Timor in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_61 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Ecuador country within the International rates page
  Given I updated a test cases in test rail "5390"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Ecuador as country
  Then I verify the Ecuador in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_62 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Egypt country within the International rates page
  Given I updated a test cases in test rail "5393"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Egypt as country
  Then I verify the Egypt in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_63 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select EI Salvador country within the International rates page
  Given I updated a test cases in test rail "5396"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select EI Salvador as country
  Then I verify the EI Salvador in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_64 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Equatorial Guinea country within the International rates page
  Given I updated a test cases in test rail "5399"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Equatorial Guinea as country
  Then I verify the Equatorial Guinea in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_65 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Ecuador country within the International rates page
  Given I updated a test cases in test rail "5401"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Eritrea as country
  Then I verify the Eritrea in the dropdown
  Then local sms and call rate is displayed

  @InternationalRates_66 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Estonia country within the International rates page
  Given I updated a test cases in test rail "5402"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Estonia as country
  Then I verify the Estonia in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_67 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Ethiopia country within the International rates page
  Given I updated a test cases in test rail "5403"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Ethiopia as country
  Then I verify the Ethiopia in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_68 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Falkland Island country within the International rates page
  Given I updated a test cases in test rail "5405"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Falkland Island as country
  Then I verify the Falkland Island in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_69 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Faroe Islands country within the International rates page
  Given I updated a test cases in test rail "5408"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Faroe Islands as country
  Then I verify the Faroe Islands in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Fiji country within the International rates page
  Given I updated a test cases in test rail "5409"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Fiji as country
  Then I verify the Fiji in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_581 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Finland country within the International rates page
  Given I updated a test cases in test rail "5411"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Finland as country
  Then I verify the Finland in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select France country within the International rates page
  Given I updated a test cases in test rail "5412"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select France as country
  Then I verify the France in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select French Guiana country within the International rates page
  Given I updated a test cases in test rail "5413"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select French Guiana as country
  Then I verify the French Guiana in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select French Polynesia country within the International rates page
  Given I updated a test cases in test rail "5415"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select French Polynesia as country
  Then I verify the French Polynesia in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select France country within the International rates page
  Given I updated a test cases in test rail "5416"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Gabon as country
  Then I verify the Gabon in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Gambia country within the International rates page
  Given I updated a test cases in test rail "5418"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Gambia as country
  Then I verify the Gambia in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Georgia country within the International rates page
  Given I updated a test cases in test rail "5419"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Georgia as country
  Then I verify the Georgia in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Germany country within the International rates page
  Given I updated a test cases in test rail "5420"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Germany as country
  Then I verify the Germany in the dropdown
  Then local sms and call rate is displayed
  
   @InternationalRates_58 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Ghana country within the International rates page
  Given I updated a test cases in test rail "5421"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Ghana as country
  Then I verify the Ghana in the dropdown
  Then local sms and call rate is displayed
 
  @InternationalRates_59 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Gibraltar country within the International rates page
  Given I updated a test cases in test rail "5422"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Gibraltar as country
  Then I verify the Gibraltar in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_60 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greece country within the International rates page
  Given I updated a test cases in test rail "5423"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Greece as country
  Then I verify the Greece in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_61 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greenland country within the International rates page
  Given I updated a test cases in test rail "5425"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Greenland as country
  Then I verify the Greenland in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_62 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Grenada country within the International rates page
  Given I updated a test cases in test rail "5426"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Grenada as country
  Then I verify the Grenada in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_63 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Ghana country within the International rates page
  Given I updated a test cases in test rail "5428"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Guadeloupe as country
  Then I verify the Guadeloupe in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_64 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Guam country within the International rates page
  Given I updated a test cases in test rail "5430"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Guam as country
  Then I verify the Guam in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_65 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Guatemala country within the International rates page
  Given I updated a test cases in test rail "5432"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Guatemala as country
  Then I verify the Guatemala in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_66 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Guinea country within the International rates page
  Given I updated a test cases in test rail "5435"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Guinea as country
  Then I verify the Guinea in the dropdown
  Then local sms and call rate is displayed
  
 
  @InternationalRates_60 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greece country within the International rates page
  Given I updated a test cases in test rail "5437"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Guyana as country
  Then I verify the Guyana in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_60 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greece country within the International rates page
  Given I updated a test cases in test rail "5438"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Haiti as country
  Then I verify the Haiti in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_60 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greece country within the International rates page
  Given I updated a test cases in test rail "5440"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select Hondurus as country
  Then I verify the Hondurus in the dropdown
  Then local sms and call rate is displayed
  
  @InternationalRates_60 @IntRates
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greece country within the International rates page
  Given I updated a test cases in test rail "5446"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I click on select country
  Then I select HongKong as country
  Then I verify the HongKong in the dropdown
  Then local sms and call rate is displayed

   @InternationalRates_mobile @Testmobile
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Andorra country within the International rates page
 # Given I updated a test cases in test rail "5449"
  When I click on Hamburgr tab on the page
  When I click in International Rates button in hamburgr
  Then I get redirected to international rates page in mobileview
  When I click on select country in mobile view
  Then I select Angola as country in mobile view
  Then local sms and call rate is displayed in mobile view
  
  @InternationalRates_60 @IntRates @IntRatesExcel
Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select Greece country within the International rates page
  Given I updated a test cases in test rail "5452"
  When I click on plan button
  When I click in International Rates button
  Then I get redirected to international rates page
  When I select options and data from excel file
  Then local sms and call rate is displayed