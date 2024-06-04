Feature: Book A Hotel in Addictive application

Scenario: userUser Login the adactin application
Given User launch the Adactin Application
When User Enter The UserNAme in UserName Field
And User Enter the Password In Password Field
Then user Click the Login Button And it Navigate To Next Page


Scenario: User Search the Hotel
When user select the location from location dropdown
And user select the Hotel from Hotel dropdown
And user select the room  type
And user select the number of rooms
And user select the number of adults
And user select the number of childrens
Then user click the search button and it navigate to select hotel page

Scenario: User Select the Hotel
When User click the required Hotel from the Select column
And user click the COntinue button and it navigate to Book a Hotel page

Scenario: User Proceeds to Book the selected Hotel
And User enters First Name in First name box
And User enters Last Name in Last name box
And User enters Billing address in Billing address box
And User enter Credit 16 digit credit card number in Credit card box
And User select the Credit card type from drop down box
And User select the Expiry date and Expiry Date from drop down box
And User Enters CVV number in CVV box
Then User clicks Book Now button and it navigate to Booking Confirmation page

Scenario: User clicks on My Itinerary button 
Then It navigates to Booked Iternerary page
Then User clicks the logout button and the application will be closed

 

