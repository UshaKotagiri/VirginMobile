Feature: Covering Website scenarios

#combined scenarios
#To verify if Google playstore is available at the footer od the page
#To verify if it is redirected to the Google playstore page
#Check if there is a text label displayed
#Check if there is a text displayed
#Check if there button "Create your Plan" is displayed
#Check if there is image and list with text labels under the image displayed on the one side on the screen
#Check if there is a "SUBSCRIBE" button
#Check if following links are displayed in the footer: "About Virgin Mobile", "Terms & Conditions" and " Privacy Policy"
#Check if there is a banner and text about Virgin mobile
#Check if icons of youtube, twitter, instagram and facebook are displayed below "Follow Us"
#Check if text "© 2018 Virgin Mobile Saudi Consortium LLC All rights reserved" is displayed on the bottom of the footer
#Check if success message is displayed when the user is subscribed

@WebsiteTest @Website_01
Scenario: Combined sceanrios for Website tab 
Given I have updated case under Test Rail "3810"
When I scroll the Virgin page down
Then I verify the create your plan button
Then I verify the text is displayed at the footer
Then I verify About virgin mobile is displayed at the footer
Then I verify Terms ad conditions on the page
Then I verify Privacy Policy on the page
Then I Verify banner on the page
Then I verify text about Virgin mobile
Then I verify youtube on the page are displayed below Follow Us
Then I verify twitter on the page are displayed below Follow Us
Then I verify instagram on the page are displayed below Follow Us
Then I verify facebook on the page are displayed below Follow Us
Then I verify 2018 Virgin Mobile Saudi Consortium LLC All rights reserved at the bottom
Then I verify if Email address text box is present in the page
When I enter email address in the required text box
Then I verify the subscribe button is present at the footer 
When I click over the subscribe button
Then I Get the success message when the user is succesfully subscribed
Then I verify Google playstore button
When I click on Google playstore
Then I get redirected to the required page

#combined scenarios
# Check if there is a promotion Plan then the Plan Card with the promotion is first displayed in the carousel
# Check if the Plan Cards contains the 'Amount of sar/month' , 'Number of local minute/2x SMS' ,'Number of Data'
# Check if there is button "Just Sim" is displayed
# Check if  the button "Just Sim" is present
# Check if there is image and list with text labels under the image displayed on the one side on the screen
# Check if the user is unable to subscribe when invalid email address is entered
# Check if there is a "SUBSCRIBE" button
# Check if following links are displayed in the footer: "About Virgin Mobile", "Terms & Conditions" and " Privacy Policy"
# Check if there is a banner, title and text 
# Check if App Store and Google Play buttons are displayed below "Download the App"
# Check if error message indicating that the email is already subscribed is displayed when already subscribed email is entered

@WebsiteTest @Website_02
Scenario: Combined sceanrios for Website tab 
Given I have updated case under Test Rail "3810"
Then I verify there is promotion plan in the carousel
When I scroll the Virgin page down
Then I verify the data in the plan
Then I verify Just sim tab in the page
When I click over the subscribe button
Then I Get the error message for the already subscribed Email
Then I verify the Links in the footer present
Then I verify the banner and Title text
Then I verify the appstore and google play option
