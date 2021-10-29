Feature: Hotel Booking App
Scenario: Login

	Given Launch The Url
	When user Enter the Name In "sridharKumar0220" Field
	And user Enter The Password In Password Field
	Then user Click On The Login Button And It Navigates To Search Hotel Page

Scenario: Search Hotel Page_Details Entry
Given user Choose The Hotel Location
When user Choose The Hotel Name
And user Choose The Room  Type
And user Book The Total Number Of Rooms
And Adults Allowed In A Single Room
And Children Allowed In A Single Room
Then user Click On The Search Button And It Navigates To Hotel Confirmation Page

Scenario: Hotel Confirmation Page
Given user Click The Radio Button To Confirm The Hotel Booking
When user Click On The Continue Button To Navigate Into Personal Info Page

Scenario: Personal Info Page
Given user Enter The FirstName In The Correcponing Field
When user Enter The LastName For That Corresponding Field
And user Enter The Billing Address
And user Enter The Valid 16 Degits Valid Creadit Card Number
And user Enter The Creadit Cart Type
And user Enter The Expire Date
And user Enter The Expire Year
And user Enter The Cvv Number
Then user Click On The Book Now Button To Navigate Into LogOut Page

Scenario: Logout Page
Given user Click On The Logout Button 


